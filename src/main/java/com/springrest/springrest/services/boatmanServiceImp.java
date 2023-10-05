package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.boatmanDao;
import com.springrest.springrest.entities.Boatman;

@Service
public class boatmanServiceImp implements boatmanService {

	@Autowired
	private boatmanDao boatmandao;			
	@Override
	public List<Boatman> getboatman() {
		return boatmandao.findAll();
	}

	@Override
	public Boatman addBoatman(Boatman newboatman) {
			boatmandao.save(newboatman);
			return newboatman;
			
		}

}
