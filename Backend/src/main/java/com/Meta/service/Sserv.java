package com.Meta.service;

import java.util.List;

import com.Meta.entity.Student;

public interface Sserv {
	Student getStudent(int id);
	List<Student> addStudent(String name, String address, int age, int number, int enrollmentYear);
    List<Student> updateStudent(Student student);
    List<Student> deleteStudent(int id);

}
