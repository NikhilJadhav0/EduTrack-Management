package com.Meta.service;

import java.util.List;

import com.Meta.entity.User;

public interface Userv {

	User getUser(int id);
    List<User> addUser(String name, String email, String password, int number, User.Role role);
    List<User> updateUser(User user);
    List<User> deleteUser(int id);

}
