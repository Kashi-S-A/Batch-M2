package com.tyss.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-c")
public class PageC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageC is triggered");

		resp.getWriter().print("<h1>Welcome to Servlet PageC</h1>");

//		resp.sendRedirect("https://www.instagram.com/");//website link

		resp.sendRedirect("test.html");// servlet,jsp , html

	}
}
