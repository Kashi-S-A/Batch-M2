package com.ty.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Actor;
import com.ty.entity.Movie;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Movie m = new Movie();
		m.setMid(102);
		m.setName("Kantara 2");

		Actor a1 = em.find(Actor.class, 11);// DB

		Actor a2 = new Actor();
		a2.setName("Sapthami");
		a2.setGender("Female");
		a2.setAid(33);

		m.setActors(Arrays.asList(a1, a2));

		et.begin();
		em.persist(m);
		em.persist(a2);
		et.commit();

		System.out.println("tables created");

	}
}
