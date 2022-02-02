package com.org.ctc.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COLLEGE")
public class University {
	@Id
	@GeneratedValue
	private int universityRegCode;
	private String universityName;
	private String country;
	private String state;
	private String place;
	public int getUniversityRegCode() {
		return universityRegCode;
	}
	public void setUniversityRegCode(int universityRegCode) {
		this.universityRegCode = universityRegCode;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
