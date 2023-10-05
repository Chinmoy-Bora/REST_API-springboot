 package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Boat;
import com.springrest.springrest.entities.Boatman;
import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.boatServices;
import com.springrest.springrest.services.boatmanService;
import com.springrest.springrest.services.userService;

@RestController 
public class Mycontroller {
	
	@Autowired
	private userService userservice;
	@Autowired
	private boatServices boatservice;
	
	@Autowired
	private boatmanService boatmanservice;
	
	
	
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page ";
	}
	
	// get the users

	@GetMapping("/user")
	public List<User> getuser()
	{
		return this.userservice.getuser();
	}
	
	@GetMapping("/user/{userId}")
	public User getUserId(@PathVariable String userId ) {
		return this.userservice.getUserId(Long.parseLong(userId));
	}
	
	
	@PostMapping(path="/users",consumes= "application/json")
	public User addUser(@RequestBody User newuser)
	{
		return this.userservice.addUser(newuser);
	}
	
	@DeleteMapping("/user/{userId}")
	public User deleteUser(@PathVariable String userId)
	{
		return this.userservice.deleteUser(Long.parseLong(userId));
	}
	
	@PutMapping("/userput")
	public User updateUser(@RequestBody User newuser)
	{
		return this.userservice.updateUser(newuser);
	}
	
	//get  boat 
	@GetMapping("/boat")
	public List<Boat> getboat()
	{
		return this.boatservice.getboat();
		
	}
	
	@GetMapping("/boat/{boatId}")
	public Boat getboatId(@PathVariable String boatId ) {
		return this.boatservice.getBoatId(Long.parseLong(boatId));
	}
	

	@PostMapping(path="/boat",consumes= "application/json")
	public Boat addBoat(@RequestBody Boat newboat)
	{
		return this.boatservice.addBoat(newboat);
	}
	
	
	
	//get boatman
	
	@GetMapping("/boatman")
	public List<Boatman> getboatman()
	{
		return this.boatmanservice.getboatman();
		
	}
	@PostMapping(path="/boatman",consumes= "application/json")
	public Boatman addBoatman(@RequestBody Boatman newboatman)
	{
		return this.boatmanservice.addBoatman(newboatman);
	}
	
}
 
