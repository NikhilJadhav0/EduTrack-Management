package com.Meta.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "courses")
public class Course {
	@Id
	@Column(name = "cid")
	private int id;
	private String title;
    private String description;


	 @ManyToOne
	    @JoinColumn(name = "teacher_id")
	    private Teacher teacher;
	 @ManyToMany
	    @JoinTable(
	        name = "student_courses",
	        joinColumns = @JoinColumn(name = "course_id"),
	        inverseJoinColumns = @JoinColumn(name = "student_id")
	    )
	    private Set<Student> enrolledStudents;
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getTitle() {
		 return title;
	 }
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public Teacher getTeacher() {
		 return teacher;
	 }
	 public void setTeacher(Teacher teacher) {
		 this.teacher = teacher;
	 }
	 public Set<Student> getEnrolledStudents() {
		 return enrolledStudents;
	 }
	 public void setEnrolledStudents(Set<Student> enrolledStudents) {
		 this.enrolledStudents = enrolledStudents;
	 }
	 public Course(String title, String description, Teacher teacher, Set<Student> enrolledStudents) {
		super();
		this.title = title;
		this.description = description;
		this.teacher = teacher;
		this.enrolledStudents = enrolledStudents;
	 }
	 public Course() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 
}
