package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchUser {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		System.out.println("-------------------------EM1-------------------------");
		EntityManager em1 = emf.createEntityManager();

		User u1 = em1.find(User.class, 1);
		System.out.println(u1);
		System.out.println("----------------------------------------------------------------");

		User u2 = em1.find(User.class, 2);
		System.out.println(u2);
		System.out.println("-----------------------------------------------------------------");

		User u3 = em1.find(User.class, 1);
		System.out.println(u3);
		System.out.println("-------------------------------------------------------------------");

		System.out.println("***************************************************************");

		System.out.println("------------------------EM2--------------------------");
		EntityManager em2 = emf.createEntityManager();

		User u4 = em2.find(User.class, 1);
		System.out.println(u4);
		System.out.println("--------------------------------------------------------");

		User u5 = em2.find(User.class, 2);
		System.out.println(u5);
		System.out.println("------------------------------------------------------");

		User u6 = em2.find(User.class, 1);
		System.out.println(u6);
		System.out.println("--------------------------------------------------------");
	}
}
