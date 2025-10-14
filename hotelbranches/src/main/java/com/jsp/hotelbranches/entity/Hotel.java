package com.jsp.hotelbranches.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Hotel {

	@Id
	int id;
	String name;
	String type;
	int noTable;
	@OneToMany
	List<Branches> list;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(int id, String name, String type, int noTable, List<Branches> list) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.noTable = noTable;
		this.list = list;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoTable() {
		return noTable;
	}

	public void setNoTable(int noTable) {
		this.noTable = noTable;
	}
	
	
}
