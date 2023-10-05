package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entities.User;

@Service
public class userServiceImp implements userService {

	@Autowired
	private UserDao userdao;
	//List<User> user;
	
	
	public userServiceImp()
	{
//		 user = new ArrayList<>();
//		 user.add(new User(12,"dhun","xyz","email","12345","male"));
	}
	
	@Override
	public User getUserId(long userId)
	{

		return userdao.getReferenceById(userId);

	}
	
	@Override
	public List<User> getuser() {
		
		return userdao.findAll();
	}
	
	

	@Override
	public User addUser(User newuser) {
		userdao.save(newuser);
		return newuser;
	}
	
	@Override
	public User updateUser(User newuser)
	{
		userdao.save(newuser);
		return newuser;	
	}
	
	@Override 
	public User deleteUser(long parselong) {
		User entity = userdao.getReferenceById(parselong);
		userdao.delete(entity);
		return entity;
	}
	

	


	
	
	
	 
	
}
