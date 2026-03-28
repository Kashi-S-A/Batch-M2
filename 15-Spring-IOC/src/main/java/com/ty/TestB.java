package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-a.xml");

		Employee emp = (Employee) app.getBean("empBean");
		emp.project();

		Student student = (Student) app.getBean("studentBean");// Exception
		student.play();
	}
}
