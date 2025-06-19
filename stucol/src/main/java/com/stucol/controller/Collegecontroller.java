package com.stucol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stucol.model.College;
import com.stucol.model.Student;
import com.stucol.service.CollegeService;

@RestController
@RequestMapping("/api")
public class Collegecontroller {
	@Autowired
	private CollegeService colservice;
	
	@PostMapping("/create")
	public College createcollege(@RequestBody College college) {
		return colservice.createcollege(college);
	}
	
	@PostMapping("/createstudent/{collegeId}")
	public Student createStudent(@PathVariable Long collegeId,@RequestBody Student student) {
		return colservice.createStudent(collegeId, student);
	}
	
	@GetMapping("/getall")
	public List<College> getall() {
		return colservice.getAllColleges();	
		}
	@GetMapping("/getbyid")
	public List<Student> get(@RequestParam String collegeName){
		return colservice.getStudentByCollegeName(collegeName);
		
	}

}
