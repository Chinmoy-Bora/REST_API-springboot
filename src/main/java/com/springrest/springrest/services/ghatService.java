package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Ghat;

public interface ghatService {
	
	public List<Ghat> getghat();

	public Ghat addGhat(Ghat newghat);
	
}
