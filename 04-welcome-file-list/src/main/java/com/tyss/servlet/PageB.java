package com.tyss.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageB is triggered");

		//to get the data from the request
		String name = (String) req.getAttribute("personName");
		int age = (int) req.getAttribute("personAge");

		System.out.println("---------Person Details---------");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);

		resp.getWriter().print("<h1>Welcome to Servlet PageB</h1>");
	}
}
