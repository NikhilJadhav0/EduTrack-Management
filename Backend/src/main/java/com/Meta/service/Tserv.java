package com.Meta.service;

import java.util.List;

import com.Meta.entity.Teacher;

public interface Tserv {

	Teacher getTeacher(int id);
    List<Teacher> addTeacher(String name, String email, String number, int age);
    List<Teacher> updateTeacher(Teacher teacher);
    List<Teacher> deleteTeacher(int id);

}
