package com.jsp.moviecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.moviecrud.entity.Movie;

public class MovieDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Movie movie = new Movie(1001,"ABCD","SSR","Dance",90.36,2019);
		
		et.begin();
		
		em.persist(movie);
		
		et.commit();
	}

}
