package com.tyss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PageA extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("PageA got the request");
		
		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>Welcome to PageA servlet<h1>"
				+ "</body>"
				+ "</html>");
	}
}
