package com.org.ctc.Repositeries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.ctc.Models.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer>{

	//List<University> findByName(University university);
   @Query
	List<University> findByUniversityName(String universityName);
    @Query
	List<University> findByState(String state);

	
	
	

}
