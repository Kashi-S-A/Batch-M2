package com.ty.shop.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.shop.conn.ConnectionPool;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");

		try {
			Connection con = ConnectionPool.giveConnection();

			String sql = "SELECT * FROM users WHERE email=?";

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, email);

			ConnectionPool.submitConnection(con);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				if (rs.getString(4).equals(pwd)) {
					// Login Succ
					req.getRequestDispatcher("home.jsp").forward(req, resp);
				} else {
					// incorrect pwd
					req.setAttribute("err", "Incorrect Password!!!!!!!!!!");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				}
			} else {
				// User not registered
				req.setAttribute("err", "Email is not registered!!!!!!!!!!");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			req.setAttribute("err", "Something went wrong!!!!!!!!!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}

	}
}
