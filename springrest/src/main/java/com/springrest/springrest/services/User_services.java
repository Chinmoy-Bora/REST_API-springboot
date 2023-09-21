package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.User;

@Service

public interface User_services{
	public List<User> getuser();
	
	public User getuser(Long id);
	public User adduser(User user);
	
	

}
