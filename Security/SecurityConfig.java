package com.acc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {
	
	public UserDetailsService userDetailsService() {
		return null;
	}

	public PasswordEncoder passwordEncoder() {
		// should not be used in main project(prod app)
		// use BCryptPasswordEncoder
		return NoOpPasswordEncoder.getInstance();
	}
}
