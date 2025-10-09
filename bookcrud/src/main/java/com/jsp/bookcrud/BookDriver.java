package com.jsp.bookcrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bookcrud.entity.Book;

public class BookDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		 Book book1 = new Book(1001,"Good vibes Good Life","Vex king",280,2022);
		 Book book2 = new Book(1002,"Wings of Fire","Dr A P J Abdul Kalam",300,2015);
		 Book book3 = new Book(1003,"The Entreprenuer","Sharad Tandale",200,2019);
		 
		
		et.begin();
		
		
//		 em.persist(book1);
		 em.persist(book2);
		 em.persist(book3);
		
		et.commit();
	}

}
