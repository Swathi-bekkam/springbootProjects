package com.swathi.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swathi.entity.Passport1;
import com.swathi.entity.Person1;
import com.swathi.repo.PerRepo;

@Service
public class PasService {
	@Autowired
	private PerRepo personrepo;
	

	
//	public Person1 createperson(Person1 person) {
//		return personrepo.save(person);
//		
//	}
//	
	public void create() {
		List<Person1> p=List.of(
				createperson("swetha",Date.valueOf("2000-02-09"),"achampet","Qgtygh","hyd",Date.valueOf("2023-12-11")),
				createperson("swathi2",Date.valueOf("2001-12-13"),"achampet","ftghgtrf","hyd",Date.valueOf("2024-01-11")),
				createperson("vysh",Date.valueOf("2002-12-10"),"kakinada","ertyui","hyd",Date.valueOf("2024-12-12"))
				);
		personrepo.saveAll(p);
		System.out.println("saved");
	}
	private Person1 createperson(String name,Date dob,String birthplace,String passportId,String issuePlace,Date issueDate) {
		
		Passport1 pass=new Passport1(passportId,issuePlace,issueDate);
		Person1 per=new Person1(name,dob,birthplace,pass);
		//per.setPassport(pass);
		return per;
	}
	
	public List<Person1> get(){
		List<Person1> pr=personrepo.findAll();
		return pr;
	}
	
	public Person1 find(String ids) {
	    return personrepo.findByPassport_PassportId(ids);
	}
	
	public void deletebyid(Long id) {
	personrepo.deleteById(id);
	}

	public Person1 update(Person1 p) {
		return personrepo.saveAndFlush(p);	
	}
	
	public Person1 updateid(Long id,Passport1 p) {
		Person1 pr=personrepo.findById(id).orElse(null);
		if(pr==null) {
			return null;
		}
		pr.setPassport(p);	
		return personrepo.save(pr);
		
	}
}
