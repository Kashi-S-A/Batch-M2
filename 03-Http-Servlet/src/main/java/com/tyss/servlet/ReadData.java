package com.tyss.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadData extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("User data");
		
		String s = null;
		s.charAt(0);

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");

		System.out.println(name);
		System.out.println(email);
		System.out.println(address);

		resp.getWriter().print("<h1>User with name : " + name + " is registered successfully</h1>");

	}
}
