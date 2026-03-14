package com.ty.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

	@Id
	private int aid;
	private String name;
	private String gender;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
