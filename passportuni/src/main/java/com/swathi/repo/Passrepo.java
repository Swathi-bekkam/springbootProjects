package com.swathi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.entity.Passport1;
import com.swathi.entity.Person1;

@Repository
public interface Passrepo extends JpaRepository<Passport1,Long>{

	
}
