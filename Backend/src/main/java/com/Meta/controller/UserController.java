package com.Meta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Meta.dto.UserDto;
import com.Meta.entity.User;
import com.Meta.service.Userv;
import com.Meta.util.DtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private Userv userService;

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable int id) {
        return DtoMapper.toUserDto(userService.getUser(id));
    }

    @PostMapping
    public List<UserDto> addUser(@RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String password,
                                 @RequestParam User.Role role) {
        return userService.addUser(name, email, password, role)
                .stream().map(DtoMapper::toUserDto).collect(Collectors.toList());
    }

    @PutMapping
    public List<UserDto> updateUser(@RequestBody User user) {
        return userService.updateUser(user)
                .stream().map(DtoMapper::toUserDto).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public List<UserDto> deleteUser(@PathVariable int id) {
        return userService.deleteUser(id)
                .stream().map(DtoMapper::toUserDto).collect(Collectors.toList());
    }
}

