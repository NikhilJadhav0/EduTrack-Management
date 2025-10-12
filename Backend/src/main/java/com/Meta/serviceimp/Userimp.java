package com.Meta.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Meta.entity.User;
import com.Meta.entity.User.Role;
import com.Meta.exception.ResourceNotFoundException;
import com.Meta.repository.Urepo;
import com.Meta.service.Userv;
@Service
public class Userimp implements Userv{
	@Autowired
	private Urepo userrepo;
	@Override
	public User getUser(int id) {
		
		return userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	}

	@Override
	public List<User> addUser(String name, String email, String password, Role role) {
		User u1 = new User();
		u1.setName(name);
		u1.setEmail(email);
		u1.setPass(password);
		u1.setRole(role);
		userrepo.save(u1);
		return userrepo.findAll();
	}

	@Override
	public List<User> updateUser(User user) {
		userrepo.save(user);
		return userrepo.findAll();
	}

	@Override
	public List<User> deleteUser(int id) {
		userrepo.deleteById(id);
		return userrepo.findAll();
	}

}
