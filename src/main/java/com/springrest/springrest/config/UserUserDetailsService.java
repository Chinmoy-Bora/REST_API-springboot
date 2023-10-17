package com.springrest.springrest.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entities.User;
@Component

public class UserUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao userdao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional <User> user=userdao.findByName(username);
		
		return user.map(UserUserDetails::new)
		    .orElseThrow();
		
	}

}
