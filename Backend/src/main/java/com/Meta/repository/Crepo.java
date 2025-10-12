package com.Meta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Meta.entity.Course;

@Repository
public interface Crepo extends JpaRepository<Course, Integer>{

}
