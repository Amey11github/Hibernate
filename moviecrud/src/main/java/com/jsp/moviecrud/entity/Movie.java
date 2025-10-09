package com.jsp.moviecrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	int movId;
	String movName;
	String director;
	String type;
	double boxOfficeColl;
	int yorelease;
	
	
	public Movie() {
		super();
	}


	public Movie(int movId, String movName, String director, String type, double boxOfficeColl, int yorelease) {
		super();
		this.movId = movId;
		this.movName = movName;
		this.director = director;
		this.type = type;
		this.boxOfficeColl = boxOfficeColl;
		this.yorelease = yorelease;
	}


	public int getMovId() {
		return movId;
	}


	public void setMovId(int movId) {
		this.movId = movId;
	}


	public String getMovName() {
		return movName;
	}


	public void setMovName(String movName) {
		this.movName = movName;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getBoxOfficeColl() {
		return boxOfficeColl;
	}


	public void setBoxOfficeColl(double boxOfficeColl) {
		this.boxOfficeColl = boxOfficeColl;
	}


	public int getYorelease() {
		return yorelease;
	}


	public void setYorelease(int yorelease) {
		this.yorelease = yorelease;
	}
	
	
	
	

}
