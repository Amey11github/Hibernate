package com.jsp.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.entity.Customer;

public class CustomerDriver {
    public static void main(String[] args) {
		
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	
    	Customer c1 = new Customer(101,"ajay",23,"8080656048");
    	
    	et.begin();
    	
    	em.persist(c1);
    	
    	et.commit();
    	
	}
}
