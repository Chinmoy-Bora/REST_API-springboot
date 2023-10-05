package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entities.Trip;

public interface tripService {
	public List<Trip> getTrip() ;
	public Trip addTrip(Trip newtrip);
}
