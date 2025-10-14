package com.jsp.collegeuniversitymanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.collegeuniversitymanytoone.entity.College;
import com.jsp.collegeuniversitymanytoone.entity.University;

public class CollegeUniDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		University un1=new University(10001,"SPPU","Pune","11Hb893");
		
		College c1=new College(101,"DY PATIL","Talegaon",10,un1);
		College c2=new College(102,"PCCOE","Akurdi",20,un1);
		
		et.begin();
		
		em.persist(un1);
		em.persist(c1);
		em.persist(c2);
		
		et.commit();
		
	}
}


