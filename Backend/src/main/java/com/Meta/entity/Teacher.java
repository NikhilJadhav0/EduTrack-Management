package com.Meta.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
@Id
	private int id;
@Column(name = "Tname")
	private String name;
@Column(name = "email")
	private String email;
@Column(name = "phone_number")
	private String number;
@Column(name = "age")
	private int age;
private String department;

@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
@JoinColumn(name = "user_id", referencedColumnName = "id")
private User user;
@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Course> courses;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public Teacher(int id, String name, String email, String number, int age, User user, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.age = age;
		this.user = user;
		this.courses = courses;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
}
