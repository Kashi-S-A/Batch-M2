package com.ty.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	private int bid;
	private String name;
	private String ifsc;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Account> accounts;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public List<Account> getAccount() {
		return accounts;
	}

	public void setAccount(List<Account> account) {
		this.accounts = account;
	}

}
