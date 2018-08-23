package com.linnelservices.restws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled=true) // Method Level Security
public class SpringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}
}
