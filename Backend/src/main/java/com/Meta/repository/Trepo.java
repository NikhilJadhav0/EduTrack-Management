package com.Meta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Meta.entity.Teacher;

@Repository
public interface Trepo extends JpaRepository<Teacher, Integer>{

}
