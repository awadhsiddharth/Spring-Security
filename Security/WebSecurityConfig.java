package com.acc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurtityConfig {
	
	@Bean
	public UserDetailsService userDetailsService() {
        var uds = new InMemoryUserDetailsManager();

        UserDetails u1 = User.withUsername("bill")
                .password("12345")
                .authorities("test")
                .build();

        uds.createUser(u1);

        return uds;
    }
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	

}
