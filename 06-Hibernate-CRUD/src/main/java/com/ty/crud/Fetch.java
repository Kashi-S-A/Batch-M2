package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		Employee employee = em.find(Employee.class, 101);

		if (employee != null) {
			System.out.println("--------Employee--------");
			System.out.println("ID : " + employee.getEid());
			System.out.println("Name : " + employee.getName());
			System.out.println("Designation : " + employee.getDesign());
			System.out.println("Salary : " + employee.getSalary());
		} else {
			System.out.println("Not found");
		}

	}
}
