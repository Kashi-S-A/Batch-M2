package com.ty.ck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee employee = new Employee();
		employee.setName("Pengi");
		employee.setSalary(59000);
		employee.setAddress("Mulund");

		EmployeeId eid = new EmployeeId();
		eid.setEmail("pengi@gmail.com");
		eid.setPhone(456780);

		employee.setEid(eid);

		et.begin();
		em.persist(employee);
		et.commit();

		System.out.println("Saved");

	}
}
