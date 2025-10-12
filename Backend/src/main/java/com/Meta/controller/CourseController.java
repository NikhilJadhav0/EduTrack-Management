package com.Meta.controller;

import com.Meta.dto.CourseDto;
import com.Meta.entity.Course;
import com.Meta.service.Cserv;
import com.Meta.util.DtoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private Cserv courseService;

    @GetMapping("/{id}")
    public CourseDto getCourse(@PathVariable int id) {
        return DtoMapper.toCourseDto(courseService.getCourse(id));
    }

    @PostMapping
    public List<CourseDto> addCourse(@RequestParam String title,
                                     @RequestParam String description,
                                     @RequestParam Long teacherId) {
        return courseService.addCourse(title, description, teacherId)
                .stream().map(DtoMapper::toCourseDto).collect(Collectors.toList());
    }

    @PutMapping
    public List<CourseDto> updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course)
                .stream().map(DtoMapper::toCourseDto).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public List<CourseDto> deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id).stream().map(DtoMapper::toCourseDto).collect(Collectors.toList());
    }
}
