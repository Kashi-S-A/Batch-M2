package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = new User();
		user.setName("Manga");
		user.setEmail("Manga@gmail.com");
		user.setPhone(7654567);

		User u = em.find(User.class, 1);
		u.setName("Penga XYZ");

		et.begin();
		em.merge(u);
		et.commit();

		System.out.println("saved");

	}
}
