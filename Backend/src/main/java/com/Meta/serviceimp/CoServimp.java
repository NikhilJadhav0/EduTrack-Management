package com.Meta.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Meta.entity.Course;
import com.Meta.exception.ResourceNotFoundException;
import com.Meta.repository.Crepo;
import com.Meta.service.Cserv;
@Service
public class CoServimp implements Cserv{

	@Autowired
	private Crepo CourseRepo;
	
	@Override
	public Course getCourse(int id) {
		return CourseRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Course not found with id: " + id));
	}

	@Override
	public List<Course> addCourse(String title, String description, Long teacherId) {
		Course course = new Course();
		course.setTitle(title);
		course.setDescription(description);
		CourseRepo.save(course);
		return CourseRepo.findAll();
	}

	@Override
	public List<Course> updateCourse(Course course) {
		CourseRepo.save(course);
		return CourseRepo.findAll();
	}

	@Override
	public List<Course> deleteCourse(int id) {
		CourseRepo.deleteById(id);
		return CourseRepo.findAll();
	}

}
