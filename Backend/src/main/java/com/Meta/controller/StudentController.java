package com.Meta.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Meta.dto.StudentDto;
import com.Meta.service.Sserv;
import com.Meta.util.DtoMapper;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private Sserv sserv;
	@GetMapping("/{id}")
	public StudentDto getStudent(@PathVariable int id) {
		return DtoMapper.toStudentDto(sserv.getStudent(id));
	}
	
	@PostMapping
	public List<StudentDto> addStudent(@RequestParam String name,@RequestParam String adress ,@RequestParam int age,@RequestParam int number, @RequestParam int enrollmentYear){
		return sserv.addStudent(name, adress, age, number, enrollmentYear) .stream().map(DtoMapper::toStudentDto).collect(Collectors.toList());
	}
}
