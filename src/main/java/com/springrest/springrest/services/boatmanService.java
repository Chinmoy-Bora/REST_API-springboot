package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Boatman;

public interface boatmanService {
	
	public List<Boatman> getboatman();
	
	public Boatman addBoatman(Boatman newboatman);
}
