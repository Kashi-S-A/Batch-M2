package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class FetchByAccount {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Account account = em.find(Account.class, 1531L);

		if (account != null) {
			System.out.println("---------Accounts--------");
			System.out.println(account.getAccno());
			System.out.println(account.getName());
			System.out.println(account.getBalance());

			System.out.println("-------Bank-------");
			Bank bank = account.getBank();
			System.out.println(bank.getBid());
			System.out.println(bank.getName());
			System.out.println(bank.getIfsc());
		} else {
			System.out.println("Not found");
		}

	}
}
