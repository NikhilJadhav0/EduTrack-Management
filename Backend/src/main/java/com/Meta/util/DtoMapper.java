package com.Meta.util;

import com.Meta.dto.CourseDto;
import com.Meta.dto.StudentDto;
import com.Meta.dto.TeacherDto;
import com.Meta.dto.UserDto;
import com.Meta.entity.*;

public class DtoMapper {

	public static UserDto toUserDto(User user) {
		UserDto dto = new UserDto();
		dto.setUserId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setRole(user.getRole());
		return dto;
	}
	
	
	public static StudentDto toStudentDto(Student student) {
		StudentDto dto = new StudentDto();

		dto.setStudentId(student.getStudentId());
		dto.setEnrollmentYear(student.getAdmissiondate());
		if(student.getUser() != null) {
			dto.setName(student.getUser().getName());
			dto.setEmail(student.getUser().getEmail());
		}
		return dto;
	}
	
	public static TeacherDto toTeacherDto(Teacher teacher) {
		TeacherDto dto = new TeacherDto();
		dto.setTeacherId(teacher.getId());
		dto.setName(teacher.getName());
		dto.setNumber(teacher.getNumber());
		dto.setAge(teacher.getAge());
		dto.setDepartment(teacher.getDepartment());
		return dto;
	}
	
	public static CourseDto toCourseDto(Course course) {
		CourseDto dto = new CourseDto();
		dto.setCourseId(course.getId());
		dto.setTitle(course.getTitle());
		dto.setDescription(course.getDescription());
		if(course.getTeacher() != null) {
			dto.setTeacherId(course.getTeacher().getId());
		}
		return dto;
	}
	
}
