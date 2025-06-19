package com.stucol.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stucol.model.College;


@Repository
public interface Colrepo extends JpaRepository<College,Long>{

	
	

}
