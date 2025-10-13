package com.jsp.doctorhospital;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.doctorhospital.entity.Doctor;
import com.jsp.doctorhospital.entity.Hospital;

public class DoctorHostpDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital h1=new Hospital(100097,"A B C Hospital","Pune",12,24);
		
		Doctor d1=new Doctor(101,"Dinesh","MD Radiology","67890",h1);
		Doctor d2=new Doctor(102,"Vishal","Dentist","97990",h1);
		Doctor d3=new Doctor(103,"Aayush","Cardiology","37890",h1);
		
		ArrayList<Doctor> list=new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		
		
		
		et.begin();
		
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(h1);
		
		et.commit();
	}

}
