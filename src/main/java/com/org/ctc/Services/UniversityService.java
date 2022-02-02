package com.org.ctc.Services;

import java.util.List;

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

	public void restUniversityDetails(University university) {
		universityRepository.save(university);
		
		// TODO Auto-generated method stub
		
	}

	public void updateUniversityDetails(University university) {
		// TODO Auto-generated method stub
		universityRepository.save(university);
	}

	public void deleteUniversityDetails(University university) {
		universityRepository.delete(university);
		// TODO Auto-generated method stub
		
	}

	public List<University> findAllUniversityDetails() {
		return universityRepository.findAll();
	}

	public List<University> findByNameUniversityDetails(String universityName) {
		// TODO Auto-generated method stub
		return universityRepository.findByUniversityName(universityName);
		
	}

	public List<University> findByNameStateDetails(String state) {
		// TODO Auto-generated method stub
		return universityRepository.findByState(state);
		
	}

}
