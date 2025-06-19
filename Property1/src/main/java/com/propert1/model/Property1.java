package com.propert1.model;


public class Property1 {
	private int id;
	private String description;
	private String address;
	
	public Property1() {
		
	}
	
	public Property1(int id, String description, String address) {
		//super();
		this.id = id;
		this.description = description;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
