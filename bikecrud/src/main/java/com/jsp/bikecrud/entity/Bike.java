package com.jsp.bikecrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	@Column(name="Model_No")
	int modelNo;
	@Column(name="Bike_Name")
	String bikeName;
	double price;
	String color;
	@Column(name="Engine_In_CC")
	int engineCC;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	

	public Bike(int modelNo, String bikeName, double price, String color, int engineCC) {
		super();
		this.modelNo = modelNo;
		this.bikeName = bikeName;
		this.price = price;
		this.color = color;
		this.engineCC = engineCC;
	}

	@Override
	public String toString() {
		return "Bike [modelNo=" + modelNo + ", bikeName=" + bikeName + ", price=" + price + ", color=" + color
				+ ", engineCC=" + engineCC + "]";
	}


	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	
	

}
