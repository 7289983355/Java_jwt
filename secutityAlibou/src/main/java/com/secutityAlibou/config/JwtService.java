package com.secutityAlibou.config;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	private static final String SECRET_KEY = "MoF6NS+FT8jG/qWHzSB9ix/aI/5PPgGuzscRr0G0F+Upla92q9kDAEWZTWSLbNDzFOd0t4VpdOeCUdLMzzUvRHZQ3YF8n4ND3cS6ov4h7no=";

	public String extractUsername(String token) {
		// TODO Auto-generated method stub
		return extractClaims(token, Claims::getSubject);
	}

	public <T> T extractClaims(String token, Function<Claims, T> claimsResolver) {

		final Claims claims = extractAllClaims(token);

		return claimsResolver.apply(claims);

	}

	private Claims extractAllClaims(String token) {

		return Jwts.parserBuilder().setSigningKey(getsignKey()).build().parseClaimsJws(token).getBody();

	}

	private Key getsignKey() {
		// TODO Auto-generated method stub

		byte[] keybytes = Decoders.BASE64.decode(SECRET_KEY);
		return Keys.hmacShaKeyFor(keybytes);
	}

	public String generateToken(

			Map<String, Object> extraClaims, UserDetails userdetail) {

		return Jwts.builder().setClaims(extraClaims).setSubject(userdetail.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
				.signWith(getsignKey(), SignatureAlgorithm.HS256).compact();

	}

	public String generateToken(UserDetails userDetails) {
		return generateToken(new HashMap<>(), userDetails);

	}
	
	public boolean isTokenValid(String token ,UserDetails userDetails) {
		
		final String username =extractUsername(token);
		
		return (username.equals(userDetails.getUsername()))&& !isTokenExpired(token);
		
		
	}

	private boolean isTokenExpired(String token) {
		// TODO Auto-generated method stub
		return extractExpiration(token).before(new Date(System.currentTimeMillis()));
	}

	private java.util.Date extractExpiration(String token) {
		// TODO Auto-generated method stub
		return extractClaims(token, Claims::getExpiration);
	}
	
	
	
	
	
	
	

}
