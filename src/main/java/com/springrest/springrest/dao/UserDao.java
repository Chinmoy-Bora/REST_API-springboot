package com.springrest.springrest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springrest.springrest.entities.User;
@EnableJpaRepositories
public interface UserDao extends JpaRepository<User,Long> {

	Optional<User> findByName(String username);
	 
	
}
