package com.stucou.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stucou.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student,Long> {

}
