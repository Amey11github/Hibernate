package com.jsp.doctorhospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Doctor {
	
	@Id
	int id;
	String name;
	String specialization;
	String salary;
	@ManyToOne
	Hospital hos;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int id, String name, String specialization, String salary,Hospital hos) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.salary = salary;
		this.hos=hos;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	

}
