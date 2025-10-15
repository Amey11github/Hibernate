package com.jsp.bikecrud;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikecrud.entity.Bike;

public class BikeUpdateDriver {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		

		et.begin();
		
		Bike bike = em.find(Bike.class, 1001);
		bike.setColor("Red");
		em.merge(bike);

		et.commit();
	}
}
