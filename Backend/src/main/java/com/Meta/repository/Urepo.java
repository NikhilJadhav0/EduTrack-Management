package com.Meta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Meta.entity.User;

@Repository
public interface Urepo extends JpaRepository<User, Integer>{

	User findByEmail(String email);



}
