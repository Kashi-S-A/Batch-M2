package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Employee emp = new Employee();
		emp.setEid(102);
		emp.setName("Pengi");
		emp.setDesign("Software Engineer");
		emp.setSalary(50000);

		et.begin();
		em.persist(emp);
		et.commit();

		System.out.println("saved");

	}
}
