package com.jsp.collegeuniversitymanytoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
	
	@Id
	int id;
	String name;
	String loc;
	String uniNum;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(int id, String name, String loc, String uniNum) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.uniNum = uniNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getUniNum() {
		return uniNum;
	}

	public void setUniNum(String uniNum) {
		this.uniNum = uniNum;
	}
	
	

}
