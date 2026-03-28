package com.ty;

public class Employee {

	String eid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(String eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("-------Employee--------");
		System.out.println("Name : " + name);
		System.out.println("eid : " + eid);
		System.out.println("salary : " + salary);
	}

	public void project() {
		System.out.println("employee is working on a project");
	}
}
