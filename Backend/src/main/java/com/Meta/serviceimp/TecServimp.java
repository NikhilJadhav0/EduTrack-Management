package com.Meta.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Meta.entity.Teacher;
import com.Meta.exception.ResourceNotFoundException;
import com.Meta.repository.Trepo;
import com.Meta.service.Tserv;

@Service
public class TecServimp implements Tserv{

	@Autowired
	private Trepo teacherRepo;
	@Override
	public Teacher getTeacher(int id) {

		return teacherRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Teacher not found with id: " + id));
	}

	@Override
	public List<Teacher> addTeacher(String name, String email, String number, int age) {
		Teacher tech = new Teacher();
		tech.setName(name);
		tech.setEmail(email);
		tech.setNumber(number);
		tech.setAge(age);
		teacherRepo.save(tech);
		return teacherRepo.findAll();
	}

	@Override
	public List<Teacher> updateTeacher(Teacher teacher) {
		teacherRepo.save(teacher);
		return teacherRepo.findAll();
	}

	@Override
	public List<Teacher> deleteTeacher(int id) {

		teacherRepo.deleteById(id);
		return teacherRepo.findAll();
	}

}
