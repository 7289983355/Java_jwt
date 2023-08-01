package com.secutityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.secutityApp.securityFilter.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class SecutityApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecutityApp1Application.class, args);
	}

}
