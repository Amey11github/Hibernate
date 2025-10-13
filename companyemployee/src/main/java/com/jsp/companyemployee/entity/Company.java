package com.jsp.companyemployee.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Company {
	
	@Id
	int id;
	String name;
	String loc;
	@OneToMany
	List<Employee> emps;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	

	public Company(int id, String name, String loc, List<Employee> emps) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.emps = emps;
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
	
	

}
