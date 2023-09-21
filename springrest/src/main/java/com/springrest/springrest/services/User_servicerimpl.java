package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.*;
import com.springrest.springrest.entity.User;

@Service
public class User_servicerimpl implements User_services{
	
	@Autowired
	private Userdao Userdao;

	@Override
	public List<User> getuser() {
		// TODO Auto-generated method stub
		return Userdao.findAll();
	}

	@Override
	public User getuser(Long id) {
		// TODO Auto-generated method stub
		return Userdao.getReferenceById(id);
	}

	@Override
	public User adduser(User user) {
		// TODO Auto-generated method stub
		Userdao.save(user);
		return user;
	}




	

}
