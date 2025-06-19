package com.swathi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swathi.Dto.UserAddress;
import com.swathi.exceptions.UserNotFoundException;
import com.swathi.model.Address;
import com.swathi.model.UserA;
import com.swathi.repo.AddressRepo;
import com.swathi.repo.UserRepo;

@Service
public class UserAService {
	
	@Autowired
	private UserRepo userrepo;
//	@Autowired
//	private AddressRepo addressrepo;
	
	public void createuser(UserA us) {
		userrepo.save(us);
	}
	
	public List<UserA> get() {
		return userrepo.findAll();
	}
	
	public UserAddress getbyid(Long id) {
		UserA user=userrepo.findById(id).orElseThrow(()->new UserNotFoundException("User Not Found with this id"));
		return new UserAddress(user.getName(),user.getEmail());
	}
	
}
