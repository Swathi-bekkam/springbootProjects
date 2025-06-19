package com.property1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.propert1.model.Property1;
import com.property1.service.Property1service;

@RestController
@RequestMapping("/api")
public class Property1Controller {
	@Autowired
	private Property1service propertyservice;
	
	@PostMapping("/post")
	public Property1 create(@RequestBody Property1 property){
		return propertyservice.create(property);
	}
	
	@GetMapping("/get")
	public List<Property1> getall(){
		return propertyservice.get();
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Property1> getbyid(@PathVariable int id) {
		return ResponseEntity.ok().body(propertyservice.getbyid(id));
	}
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable int id){
	boolean delete=propertyservice.deletebyid(id);
	if(delete)
		return ResponseEntity.ok().build();
	else
		throw new RuntimeException("not found");
	}
	
	@DeleteMapping("/deleteall")
	public void deletall(){
		propertyservice.deleteall();
		}
	
	@PutMapping("/update/{id}")
	public Property1 update(@PathVariable int id,@RequestBody Property1 updateproperty)
	{
		return propertyservice.update(id,updateproperty);
	}

}
