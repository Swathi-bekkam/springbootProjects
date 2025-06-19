package com.swathi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.Dto.UserAddress;
import com.swathi.model.UserA;
import com.swathi.service.UserAService;

@RestController
@RequestMapping("/api")
public class UserAdController {
	@Autowired
	private UserAService userservice;
	
	@PostMapping("/post")
	public ResponseEntity<String> postusers(@RequestBody UserA user) {
	userservice.createuser(user);	
	return ResponseEntity.ok().body("userAddressPosted");
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<UserA>> getall(){
	return ResponseEntity.ok().body(userservice.get());
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<UserAddress> getbyid(@PathVariable Long id){
		return ResponseEntity.ok().body(userservice.getbyid(id));
	}
	
}
