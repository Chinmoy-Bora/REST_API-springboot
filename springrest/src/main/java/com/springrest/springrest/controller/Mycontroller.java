package com.springrest.springrest.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.User;
import com.springrest.springrest.services.User_services;

@RestController
public class Mycontroller {
	
	
	@Autowired
	public User_services userservice ;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "This is home page";
	}
	
	@GetMapping("/user")
	public List<User> getuser()
	{
		return this.userservice.getuser();
		
	}
	
	@GetMapping("/user/{id}")
	public User getuser(@PathVariable String id)
	{
		return this.userservice.getuser(Long.parseLong(id));
	}
	
	@PostMapping("/user")
	public User adduser(@RequestBody User user)
	{
		return this.userservice.adduser(user);
	}

}
