package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Boat;

public interface boatServices {
	public List<Boat> getboat();
	public Boat getBoatId(long boatId);
	public Boat addBoat(Boat newboat);
}
