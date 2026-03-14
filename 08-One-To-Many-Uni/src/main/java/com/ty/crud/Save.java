package com.ty.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank bank = new Bank();
		bank.setBid(1);
		bank.setName("SBI");
		bank.setIfsc("SBI1100");

		Account a1 = new Account();
		a1.setAccno(1531);
		a1.setName("X");
		a1.setBalance(10000);

		Account a2 = new Account();
		a2.setAccno(1675);
		a2.setName("Y");
		a2.setBalance(25000);

		Account a3 = new Account();
		a3.setAccno(1783);
		a3.setName("Z");
		a3.setBalance(50000);

//		List<Account> accs = new ArrayList<Account>();
//		accs.add(a1);
//		accs.add(a2);
//		accs.add(a3);

		bank.setAccount(Arrays.asList(a1, a2, a3));// Relation establishing

		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();

		System.out.println("saved");

	}
}
