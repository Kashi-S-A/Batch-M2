package com.ty.shop.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.shop.conn.ConnectionPool;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");

		try {
			String sql = "INSERT INTO users VALUES(?,?,?,?)";

			Connection con = ConnectionPool.giveConnection();

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setLong(3, phone);
			pstm.setString(4, pwd);

			ConnectionPool.submitConnection(con);

			int saved = pstm.executeUpdate();

			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");

			if (saved > 0) {
				// Registered successfully
				req.setAttribute("succ", "Registered successfully");
				rd.forward(req, resp);
			} else {
				// something went wrong
				req.setAttribute("err", "Something went wrong");
				rd.forward(req, resp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// already registered
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("err", "Already Registered");
			rd.forward(req, resp);
		}

	}
}
