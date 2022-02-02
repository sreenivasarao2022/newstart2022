package com.org.ctc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.ctc.Models.University;
import com.org.ctc.Services.UniversityService;

@RestController
@RequestMapping
public class UniversityController {
   
	@Autowired
	private UniversityService universityService;
    
	@RequestMapping("saveUniversity")
	public void saveController(@RequestBody University university) {
		System.out.println("helllllllllllllllo");
		
		universityService.saveUniversityDetails(university);

	}

}
