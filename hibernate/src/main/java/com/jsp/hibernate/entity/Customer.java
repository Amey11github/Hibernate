package com.jsp.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    
	@Id
	int id;
	String name;
	int age;
	String mobNumber;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, int age, String mobNumber) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobNumber = mobNumber;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
}
