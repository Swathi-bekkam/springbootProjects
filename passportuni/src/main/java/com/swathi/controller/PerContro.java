package com.swathi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.entity.Passport1;
import com.swathi.entity.Person1;
import com.swathi.service.PasService;

@RestController
@RequestMapping("/api")
public class PerContro {
@Autowired
private PasService perservice;

@PostMapping("/post")
public void createper(){
perservice.create();
	
}
 @GetMapping("/get")
 public List<Person1> getAll(){
	 return perservice.get();
 }
@GetMapping("/getbyid/{passport_id}")
public Person1 getbyid(@PathVariable String passport_id) {
	return perservice.find(passport_id);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id) {
	perservice.deletebyid(id);
}
@PutMapping("/update")
public Person1 updatep(@RequestBody Person1 p) {
	return perservice.update(p);
}

@PutMapping("/update/{id}")
public Person1 updateid(@PathVariable Long id,@RequestBody Passport1 p) {
	return perservice.updateid(id, p);
}
}
