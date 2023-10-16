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
public class UserInfoDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userdao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 Optional<User> user= userdao.findByEmail(username);
		 return user.map(UserInfoUserDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));
	}

}
