package com.secutityAlibou.config;

import java.io.IOException;

import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private final JwtService jwtservice;

	private final UserDetailsService userDetilaService;

	@Override
	protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
			FilterChain filterChain) throws ServletException, IOException {

		final String authHeader = request.getHeader("Authorization");

		final String jwt;
		final String userEmail;

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {

			filterChain.doFilter(request, response);
			return;
		}

		jwt = authHeader.substring(7);

		userEmail = jwtservice.extractUsername(jwt);

		if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = this.userDetilaService.loadUserByUsername(userEmail);

			if (jwtservice.isTokenValid(jwt, userDetails)) {

				UsernamePasswordAuthenticationToken authtoken = new UsernamePasswordAuthenticationToken(userDetails

						, null, userDetails.getAuthorities()

				);

				authtoken.setDetails(

						new WebAuthenticationDetailsSource().buildDetails(request)

				);

				SecurityContextHolder.getContext().setAuthentication(authtoken);

			}
			filterChain.doFilter(request, response);
		}

	}

}