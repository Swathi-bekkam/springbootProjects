package com.swathi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.entity.Person1;


@Repository
public interface PerRepo extends JpaRepository<Person1,Long>{

	Person1 findByPassport_PassportId(String ids);

}
