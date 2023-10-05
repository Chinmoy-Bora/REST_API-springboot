package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Trip;

public interface tripDao extends JpaRepository<Trip,Long> {
	
}
