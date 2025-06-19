package com.stucol.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long collegeId;
	
	private String name;
	 
	@OneToMany(cascade=CascadeType.ALL,mappedBy="college")
	@JsonManagedReference
	private List<Student> student=new ArrayList<>();
	
	public College() {
		
	}

	public College(String name, List<Student> student) {
		super();
		this.name = name;
		this.student = student;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	

}
