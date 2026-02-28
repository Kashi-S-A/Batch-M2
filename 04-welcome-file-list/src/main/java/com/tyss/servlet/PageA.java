package com.tyss.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageA is triggered");

		resp.getWriter().print("<h1>Welcome to Servlet PageA</h1>");
		
		RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");//JSP,HTML
//		rd.forward(req, resp);
		rd.include(req, resp);
		
	}
}
