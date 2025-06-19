package com.swathi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swathi.model.UserA;

public interface UserRepo extends JpaRepository<UserA,Long>{

}
