package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.User;

@Service

public interface Userdao extends JpaRepository<User,Long> {

}
