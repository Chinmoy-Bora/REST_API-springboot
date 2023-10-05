package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Boat;


public interface BoatDao extends JpaRepository<Boat,Long>{
	
}
