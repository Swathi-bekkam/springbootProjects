package com.stucou.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stucou.model.Course;
import com.stucou.model.Student;
import com.stucou.repo.Courserepo;
import com.stucou.repo.Studentrepo;

@Service
public class StudentCourseService {
	@Autowired
	private Studentrepo studentrepo;
	
	@Autowired
	private Courserepo courserepo;
	
	public List<Student> createstudent(List<Student> student){
		return studentrepo.saveAll(student);
	}
	
	public List<Course> createcourse(List<Course> course)
	{
		return courserepo.saveAll(course);
	}
	
	public List<Course> getcoursesofstudent(Long id) {
		Student s=studentrepo.findById(id).orElse(null);
		if(s!=null) {
			return s.getCourse();
		}
		return null;
	}

}
