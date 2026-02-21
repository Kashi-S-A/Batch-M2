package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseCon2 {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/jc_db";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName(driver);
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection(url, username, password);) {
			System.out.println("connection created");

			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String sql = " student SET email='manga@gmail.com' WHERE name='Mangi'";

			int result = stm.executeUpdate(sql);

			System.out.println("No. of rows affected : " + result);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
