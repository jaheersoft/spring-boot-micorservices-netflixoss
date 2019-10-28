package com.expenses.auth.service.security;

import com.expenses.auth.domain.User;
import com.expenses.auth.repository.UserRepository;
import com.expenses.auth.service.UserDetailsImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MySQLUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repository.findById(username);
		user.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
		return user.map(UserDetailsImpl::new).get();
	}
}
