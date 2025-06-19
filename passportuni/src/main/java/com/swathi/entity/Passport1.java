package com.swathi.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passport1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
private String passportId;
private String issuePlace;
private Date issueDate;

public Passport1() {
	
}

public Passport1(String passportId, String issuePlace, Date issueDate) {
	
	this.passportId = passportId;
	this.issuePlace = issuePlace;
	this.issueDate = issueDate;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPassport_id() {
	return passportId;
}
public void setPassport_id(String passport_id) {
	this.passportId = passport_id;
}
public String getIssuePlace() {
	return issuePlace;
}
public void setIssuePlace(String issuePlace) {
	this.issuePlace = issuePlace;
}
public Date getIssueDate() {
	return issueDate;
}
public void setIssueDate(Date issueDate) {
	this.issueDate = issueDate;
}



}
