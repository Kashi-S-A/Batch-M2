package com.tyss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Reading the data");
		
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("ph"));
		String passsword = req.getParameter("pwd");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(passsword);	
		
		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>"+name+",Welcome to the Read Servlet, "
						+ "your account is registered with given email : "+email+"</h1>"
				+ "</body>"
				+ "</html>");
	}
}
