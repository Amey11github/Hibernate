package com.jsp.hotelbranches;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hotelbranches.entity.Branches;
import com.jsp.hotelbranches.entity.Hotel;

public class HotelBranchesDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Branches b1=new Branches(1011,"Hotel Shauryawada Talegaon",true,567833);
		Branches b2=new Branches(1012,"Hotel Shauryawada",false,56766833);
		Branches b3=new Branches(1013,"Hotel Shauryawada Shirur",true,5673833);
		
		ArrayList<Branches> list=new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		Hotel h1=new Hotel(111,"Hotel Shauryawada","Non Veg",70,list);
		
		et.begin();
		
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		
		em.persist(h1);
		
		et.commit();
		
		
	}

}
