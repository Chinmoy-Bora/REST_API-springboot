package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.User;

public interface userService {
	
	public List<User> getuser();
	
	public User getUserId(long userId);
	public User addUser(User newuser);
	public User updateUser(User newuser);
	public User deleteUser(long parselong);
}
