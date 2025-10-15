package com.jsp.bikecrud;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikecrud.entity.Bike;

public class BikeInsertDriver {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		System.out.println("Enter Bike No :");
//		int no=sc.nextInt();
//		System.out.println("Enter Bike name :");
//		String name=sc.next
		
		Bike b1 = new Bike(1001,"Pulsar 220",120000,"black",200);
		Bike b2 = new Bike(1002,"KTM Duke",230000,"white",230);
		Bike b3 = new Bike(1003,"Yamaha R15",200000,"blue",250);
		et.begin();
		
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);

		et.commit();
	}

}
