package com.stucol.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stucol.model.Student;

@Repository
public interface Sturepo extends JpaRepository<Student,Long>{
	List<Student> findByCollege_name(String collegeName);

}
