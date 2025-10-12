package com.Meta.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int id;
	@Column(name = "Student_name")
	private String name;
	@Column(name = "Student_address")
	private String address;
	@Column(name = "Student_age")
	private int age;
	@Column(name = "Student_number")
	private int number;
	@Column(name = "Student_Admission")
	private int admissiondate;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id")
	private User user;
	public int getStudentId() {
		return id;
	}
	public void setStudentId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAdmissiondate() {
		return admissiondate;
	}
	public void setAdmissiondate(int enrollmentYear) {
		this.admissiondate = enrollmentYear;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Student(String name, String address, int age, int number, int admissiondate) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.number = number;
		this.admissiondate = admissiondate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", number=" + number
				+ ", admissiondate=" + admissiondate + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
