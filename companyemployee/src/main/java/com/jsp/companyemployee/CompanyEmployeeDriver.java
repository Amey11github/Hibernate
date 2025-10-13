package com.jsp.companyemployee;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.companyemployee.entity.Company;
import com.jsp.companyemployee.entity.Employee;

public class CompanyEmployeeDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e1 = new Employee(101,"amey",67383);
		Employee e2 = new Employee(102,"vijay",20000);
		Employee e3 = new Employee(103,"suraj",50000);
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Employee e4 = new Employee(104,"sakshi",27383);
		Employee e5 = new Employee(105,"sumit",25000);
		Employee e6 = new Employee(106,"viraj",50800);
		
		ArrayList<Employee> list1=new ArrayList<>();
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		Company c = new Company(001,"HEXAWARE","Mumbai",list);
		Company c1 = new Company(002,"TCS","Pune",list1);
		
		
		
		et.begin();
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(c);
		
		em.persist(e4);
		em.persist(e5);
		em.persist(e6);
		em.persist(c1);
		
		
		et.commit();
	}

}
