package com.swathi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swathi.model.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{

}
