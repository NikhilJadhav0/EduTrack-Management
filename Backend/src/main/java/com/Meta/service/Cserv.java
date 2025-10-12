package com.Meta.service;

import java.util.List;

import com.Meta.entity.Course;
import com.Meta.entity.Teacher;

public interface Cserv {
	 Course getCourse(int id);
	    List<Course> addCourse(String title, String description, Long teacherId);
	    List<Course> updateCourse(Course course);
	    List<Course> deleteCourse(int id);
}
