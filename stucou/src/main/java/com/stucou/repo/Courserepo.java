package com.stucou.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stucou.model.Course;
@Repository
public interface Courserepo extends JpaRepository<Course,Long>{

}
