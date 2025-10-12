package com.Meta.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Meta.dto.TeacherDto;
import com.Meta.service.Tserv;
import com.Meta.util.DtoMapper;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

	@Autowired
	private Tserv teserv;

	@GetMapping("/{id}")
	public TeacherDto getTeacher(@PathVariable int id) {
		return DtoMapper.toTeacherDto(teserv.getTeacher(id));
	}

	@PostMapping
	public List<TeacherDto> addTeacher(@RequestParam String name, @RequestParam String email,
			@RequestParam String number, @RequestParam int age) {
		return teserv.addTeacher(name, email, number, age).stream().map(DtoMapper::toTeacherDto)
				.collect(Collectors.toList());
	}
	
	@DeleteMapping("/{id}")
	public List<TeacherDto> deleteTeacher(@PathVariable int id){
		return teserv.deleteTeacher(id).stream().map(DtoMapper::toTeacherDto).collect(Collectors.toList());
	}

}
