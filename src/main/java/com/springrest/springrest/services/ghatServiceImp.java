package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.GhatDao;

import com.springrest.springrest.entities.Ghat;

@Service
public class ghatServiceImp implements ghatService {
	
	@Autowired
	private GhatDao ghatdao;
	@Override
	public List<Ghat> getghat() {
		// TODO Auto-generated method stub
		return ghatdao.findAll();
	}
	
	@Override
	public Ghat addGhat(Ghat newghat) {
		ghatdao.save(newghat);
		return newghat;
	}
	
}
