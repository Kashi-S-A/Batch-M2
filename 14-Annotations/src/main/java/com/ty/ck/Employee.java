package com.ty.ck;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {

	@EmbeddedId
	private EmployeeId eid;
	private String name;
	private String address;
	private double salary;

	public EmployeeId getEid() {
		return eid;
	}

	public void setEid(EmployeeId eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}