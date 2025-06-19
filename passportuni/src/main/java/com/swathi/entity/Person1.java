package com.swathi.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Date dob;
	private String birthPlace;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk")
	private Passport1 passport;
	


	public Person1() {
		
	}
	
	public Person1(String name, Date dob, String birthPlace,Passport1 passport) {
		
		this.name = name;
		this.dob = dob;
		this.birthPlace = birthPlace;
		this.passport=passport;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Passport1 getPassport() {
		return passport;
	}

	public void setPassport(Passport1 passport) {
		this.passport = passport;
	}
	

}
