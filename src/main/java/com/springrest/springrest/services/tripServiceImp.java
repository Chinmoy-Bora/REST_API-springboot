package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.tripDao;
import com.springrest.springrest.entities.Trip;


@Service
public class tripServiceImp implements tripService {

	@Autowired
	private tripDao tripdao;
	@Override
	public List<Trip> getTrip() {
		return tripdao.findAll();
	}
	
	@Override
	public Trip addTrip(Trip  newtrip) {
		tripdao.save(newtrip);
		return newtrip;
	}
	
	
}
	
