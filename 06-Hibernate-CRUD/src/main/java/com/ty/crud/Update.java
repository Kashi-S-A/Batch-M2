package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee employee = em.find(Employee.class, 107);

		if (employee != null) {

			employee.setSalary(60000);

			et.begin();
			em.merge(employee);
			et.commit();

			System.out.println("Salary updated");

		} else {
			System.out.println("employee not found");
		}
	}
}
