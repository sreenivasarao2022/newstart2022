package com.org.ctc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.ctc.Models.University;
import com.org.ctc.Repositeries.UniversityRepository;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository universityRepository;

	public void saveUniversityDetails(University university) {
		
		universityRepository.save(university);
	}

}
