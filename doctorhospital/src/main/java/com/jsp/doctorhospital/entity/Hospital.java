package com.jsp.doctorhospital.entity;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Hospital {
	
	@Id
	int id;
	String name;
	String address;
	int noAmbulance;
	int noRooms;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	

	public Hospital(int id, String name, String address, int noAmbulance, int noRooms) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.noAmbulance = noAmbulance;
		this.noRooms = noRooms;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoAmbulance() {
		return noAmbulance;
	}

	public void setNoAmbulance(int noAmbulance) {
		this.noAmbulance = noAmbulance;
	}

	public int getNoRooms() {
		return noRooms;
	}

	public void setNoRooms(int noRooms) {
		this.noRooms = noRooms;
	}

}
