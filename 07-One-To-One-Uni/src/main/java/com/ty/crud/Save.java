package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car c = new Car();
		c.setCid(102);
		c.setBrand("ABC");
		c.setPrice(2000000);

		Engine e = new Engine();
		e.setEid(222);
		e.setCc(1300);

		c.setEngine(e);// FK

		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();

		System.out.println("saved");
	}
}
