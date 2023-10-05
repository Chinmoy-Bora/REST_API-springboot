package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Boatman;

public interface boatmanDao  extends JpaRepository<Boatman,Long> {

}
