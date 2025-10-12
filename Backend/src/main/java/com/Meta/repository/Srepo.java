package com.Meta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Meta.entity.Student;

@Repository
public interface Srepo extends JpaRepository<Student, Integer>{

}
