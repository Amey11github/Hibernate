package com.jsp.hotelbranches.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branches {

	@Id
	int id;
	String bname;
	boolean parking;
	double revenue;
	
	public Branches() {
		// TODO Auto-generated constructor stub
	}

	public Branches(int id, String bname, boolean parking, double revenue) {
		super();
		this.id = id;
		this.bname = bname;
		this.parking = parking;
		this.revenue = revenue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	
	
}
