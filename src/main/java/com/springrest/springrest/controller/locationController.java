package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Ghat;
import com.springrest.springrest.entities.Trip;
import com.springrest.springrest.services.ghatService;
import com.springrest.springrest.services.tripService;

@RestController 
public class locationController {

	@Autowired
	private ghatService ghatservice;
	@Autowired
	private tripService tripservice;
	//get ghat 
	@GetMapping("/ghat")
	public List<Ghat> getghat()
	{
		return this.ghatservice.getghat();
		
	}
	
	@PostMapping(path="/ghat",consumes= "application/json")
	public Ghat addGhat(@RequestBody Ghat newghat)
	{
		return this.ghatservice.addGhat(newghat);
	}
	
	
	
  // get trip details 
	
	@GetMapping("/trip")
	public List<Trip> getTrip()
	{
		return this.tripservice.getTrip();
	}
	
	@PostMapping(path="/trips",consumes= "application/json")
	public Trip addTrip(@RequestBody Trip newtrip)
	{
		return this.tripservice.addTrip(newtrip);
	}
	

}
