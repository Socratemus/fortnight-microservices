package com.fortnight.security_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class SecurityServiceApplication {
    
    public static void main(String[] args) {
		SpringApplication.run(SecurityServiceApplication.class, args);
	}
}