package com.jsp.bikeengine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	
	@Id
	int id;
	String name;
	int gears;
	double price;
	@OneToOne
	Engine en;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(int id, String name, int gears, double price, Engine en) {
		super();
		this.id = id;
		this.name = name;
		this.gears = gears;
		this.price = price;
		this.en = en;
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

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEn() {
		return en;
	}

	public void setEn(Engine en) {
		this.en = en;
	}
	
	

}
