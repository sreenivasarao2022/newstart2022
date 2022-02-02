package com.org.ctc.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
   @RequestMapping(value="restSaveUniversity", method=RequestMethod.POST)
	public ResponseEntity<University> saveRestUniversityController(@RequestBody University university){
	   universityService.restUniversityDetails(university);
		@SuppressWarnings("unchecked")
		ResponseEntity re=new ResponseEntity("Sucessfully create by university", HttpStatus.OK);
		return re;
		
	}
   
   @RequestMapping(value="updateUniversity",method=RequestMethod.PUT)
   public ResponseEntity<University> updateUniversity(@RequestBody University university){
	   universityService.updateUniversityDetails(university);
	   ResponseEntity re=new ResponseEntity("university sucessfullt updated",HttpStatus.ACCEPTED);
	return re;
	
	   
   }
   @RequestMapping(value="deleteUniversity",method=RequestMethod.DELETE)
   public ResponseEntity<University> deleteUniversity(@RequestBody University university){
	   universityService.deleteUniversityDetails(university);
	   ResponseEntity re=new ResponseEntity("university sucessfullt deleted",HttpStatus.NO_CONTENT);
	return re;
}
   @RequestMapping(value="findallUniversitydata",method=RequestMethod.GET)
   public  @ResponseBody List<University> findAllUniversityData(){
	List<University> list=universityService.findAllUniversityDetails();
	System.out.println(list);
	return list;
   }
   @RequestMapping(value="findByNameUniverName/{name}",method=RequestMethod.GET)
   public  @ResponseBody List<University> findByNameUniversityData(@PathVariable("name") String universityName){
	List<University> list=universityService.findByNameUniversityDetails(universityName);
	System.out.println(list);
	return list;
}
   @RequestMapping(value="findByNameState/{state}",method=RequestMethod.GET)
   public  @ResponseBody List<University> findByNameState(@PathVariable("state") String state){
	List<University> list=universityService.findByNameStateDetails(state);
	System.out.println(list);
	return list;
}
}