package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Student student = (Student) app.getBean("studentBean");

		student.details();

		Employee emp = (Employee) app.getBean("empBean");

		emp.display();

		app.close();
	}
}
