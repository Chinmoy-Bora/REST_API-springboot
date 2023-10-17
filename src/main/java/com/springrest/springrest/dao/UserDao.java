package com.springrest.springrest.dao;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.User;

public interface UserDao extends JpaRepository<User,Long> {

	Optional<User> findByUsername(String username);
	 
	
}
	