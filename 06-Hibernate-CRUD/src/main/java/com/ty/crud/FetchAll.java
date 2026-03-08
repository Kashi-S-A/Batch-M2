package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.entity.Employee;

public class FetchAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

//		Fetch All records
//		String hql = "SELECT emp FROM Employee emp";
//
//		Query q = em.createQuery(hql);
//		List<Employee> emps = q.getResultList();

//		fetch based on designation
//		Naming based parameter
//		String hql = "SELECT emp FROM Employee emp WHERE emp.design=:empDes";
//		
//		Query q = em.createQuery(hql);
//		q.setParameter("empDes", "Software Engineer");

		String hql = "SELECT emp FROM Employee emp WHERE emp.design=?1 AND emp.name=?2";

		Query q = em.createQuery(hql);
		q.setParameter(1, "Software Engineer");
		q.setParameter(2, "Manga");

		List<Employee> emps = q.getResultList();

		System.out.println("-------Employee--------");

		if (!emps.isEmpty()) {
			for (Employee employee : emps) {
				System.out.println("ID : " + employee.getEid());
				System.out.println("Name : " + employee.getName());
				System.out.println("Designation : " + employee.getDesign());
				System.out.println("Salary : " + employee.getSalary());
				System.out.println("--------------------");
			}
		} else {
			System.out.println("No records");
		}

//		String hql = "SELECT emp.name FROM Employee emp";
//
//		Query q = em.createQuery(hql);
//		List<String> emps = q.getResultList();
//
//		System.out.println("-------Employee--------");
//
//		System.out.println(emps);

	}
}
