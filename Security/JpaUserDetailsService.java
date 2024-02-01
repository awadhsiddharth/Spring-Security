package com.acc.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.acc.entities.User;
import com.acc.repository.UserRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class JpaUserDetailsService implements UserDetailsService{

	private final UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		var u : Optional<User> = userRepository.findUserByUsername(username);
		return null;
	}

}
