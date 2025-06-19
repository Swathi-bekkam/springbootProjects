package com.stucou.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	
	@ManyToMany
	@JoinTable(
		name="joinedtable",
				joinColumns=@JoinColumn(name="stu_id"),
				inverseJoinColumns=@JoinColumn(name="cour_id")
	)
	private List<Course> course=new ArrayList<>();
	
	public Student() {
		
	}

	public Student(String name, String email, List<Course> course) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	

}
