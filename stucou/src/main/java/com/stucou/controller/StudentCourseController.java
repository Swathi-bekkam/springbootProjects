package com.stucou.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stucou.model.Course;
import com.stucou.model.Student;
import com.stucou.service.StudentCourseService;

@RestController
@RequestMapping("/api")
public class StudentCourseController {
	@Autowired
	private StudentCourseService studentservice;
	
	@PostMapping("/createstudent")
	public List<Student> create(@RequestBody List<Student> student){
		return studentservice.createstudent(student);
		
	}
	
	@PostMapping("/createcourse")
	public List<Course> createcourse(@RequestBody List<Course> course){
		return studentservice.createcourse(course);
		
	}
	
	@GetMapping("/getcourses/{id}")
	public List<Course> getcourse(@PathVariable Long id){
		return studentservice.getcoursesofstudent(id);
	}

}
