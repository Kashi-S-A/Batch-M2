package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entiy.Product;
import com.ty.entiy.Review;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p = new Product();
		p.setPid(1);
		p.setName("Mobile");
		p.setPrice(30000);

		Review r1 = new Review();
		r1.setRid(11);
		r1.setMsg("Good");
		r1.setProduct(p);

		Review r2 = new Review();
		r2.setRid(22);
		r2.setMsg("Bad");
		r2.setProduct(p);

		Review r3 = new Review();
		r3.setRid(33);
		r3.setMsg("Average");
		r3.setProduct(p);

		et.begin();
		em.persist(p);
		em.persist(r3);
		em.persist(r2);
		em.persist(r1);
		et.commit();

		System.out.println("saved");

	}
}
