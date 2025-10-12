package com.Meta.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {


	@Id
	private int id;
	@Column(name = "Uname")
	private String name;
	@Column(name = "Upass")
	private String pass;
	@Column(name = "Uemail")
	private String email;
	@Column(name = "U_Number")
	private int number;
	
	private Role role;
	
	public enum Role {
        STUDENT, TEACHER
    }
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public User(String name, String pass, String email, int number,Role role) {
		super();

		this.name = name;
		this.pass = pass;
		this.email = email;
		this.number = number;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
