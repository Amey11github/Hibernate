package com.jsp.bikeengine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikeengine.entity.Bike;
import com.jsp.bikeengine.entity.Engine;

public class BikeEngineDriver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine e1=new Engine(10, "v12", 62,79);
		Bike b1=new Bike(101, "Pulsar GT", 6, 300000, e1);
		
		Engine e2=new Engine(11, "v15", 72,69);
		Bike b2=new Bike(102, "Kawasaki", 6, 350000, e2);
		
		
		et.begin();
		
		em.persist(e1);
		em.persist(b1);
		
		em.persist(e2);
		em.persist(b2);
		
		
		
		et.commit();
	}

}
