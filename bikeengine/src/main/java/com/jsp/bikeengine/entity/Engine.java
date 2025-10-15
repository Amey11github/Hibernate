package com.jsp.bikeengine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
	
	@Id
	int eid;
	String eng_name;
	int hp;
	double reqfuel;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(int eid, String eng_name, int hp, double reqfuel) {
		super();
		this.eid = eid;
		this.eng_name = eng_name;
		this.hp = hp;
		this.reqfuel = reqfuel;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEng_name() {
		return eng_name;
	}

	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public double getReqfuel() {
		return reqfuel;
	}

	public void setReqfuel(double reqfuel) {
		this.reqfuel = reqfuel;
	}
	
	

}
