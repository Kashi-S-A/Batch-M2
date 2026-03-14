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
		m.setMid(101);
		m.setName("Durandhar");

		Actor a1 = new Actor();
		a1.setName("Ranveer Singh");
		a1.setGender("Male");
		a1.setAid(11);

		Actor a2 = new Actor();
		a2.setName("Akshay Khanna");
		a2.setGender("Male");
		a2.setAid(22);

		m.setActors(Arrays.asList(a1, a2));

		et.begin();
		em.persist(m);
		em.persist(a2);
		em.persist(a1);
		et.commit();

		System.out.println("saved");

	}
}
