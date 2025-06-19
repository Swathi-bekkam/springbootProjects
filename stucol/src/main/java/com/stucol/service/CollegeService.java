package com.stucol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stucol.model.College;
import com.stucol.model.Student;
import com.stucol.repo.Colrepo;
import com.stucol.repo.Sturepo;

@Service
public class CollegeService {
	@Autowired
	private Colrepo colrepo;
	
	@Autowired
	private Sturepo sturepo;
	
	public College createcollege(College college) {
		return colrepo.save(college);
	}
	
	public Student createStudent(Long collegeId,Student student) {
		College c=colrepo.findById(collegeId).orElse(null);
		if(c!=null) {
			 student.setCollege(c);
		 return sturepo.save(student);
		}
		return null;
	}
	
	public List<College> getAllColleges() {
		return colrepo.findAll();
		}
	
	public List<Student> getStudentByCollegeName(String collegeName) {
		return sturepo.findByCollege_name(collegeName);
		
	}

}
