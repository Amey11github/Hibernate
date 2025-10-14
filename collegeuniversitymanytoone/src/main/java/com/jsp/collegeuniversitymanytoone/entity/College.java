package com.jsp.collegeuniversitymanytoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class College {
	
	@Id
	int id;
	String name;
	String loc;
	int noBus;
	
	@ManyToOne
	University uni;
	
	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, String loc, int noBus, University uni) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.noBus = noBus;
		this.uni = uni;
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

	public int getNoBus() {
		return noBus;
	}

	public void setNoBus(int noBus) {
		this.noBus = noBus;
	}

	public University getUni() {
		return uni;
	}

	public void setUni(University uni) {
		this.uni = uni;
	}
	
	

}
