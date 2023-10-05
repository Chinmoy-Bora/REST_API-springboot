package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.BoatDao;
import com.springrest.springrest.entities.Boat;

@Service
public class boatserviceImp implements boatServices {
	
	@Autowired
	private BoatDao boatdao;
	List<Boat> boat;
	
	public boatserviceImp()
	{
//		 boat = new ArrayList<>();
//		 boat.add(new Boat(12,1,"vikram",1,"xyz","email","wewe"));
	}

	@Override
	public List<Boat> getboat() {
		return boatdao.findAll();
	}

	@Override
	public Boat getBoatId(long boatId) {
		// TODO Auto-generated method stub
		return boatdao.getReferenceById(boatId);
	}

	@Override
	public Boat addBoat(Boat newboat) {
		boatdao.save(newboat);
		return newboat;
	}
}
