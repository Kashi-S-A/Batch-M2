package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseCon1 {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/jc_db";
		String username = "postgres";
		String password = "root";

		Connection con = null;

		try {
			Class.forName(driver);
			System.out.println("driver loaded");

			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection created");

			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String sql = " student SET email='manga@gmail.com' WHERE name='Mangi'";

			int result = stm.executeUpdate(sql);

			System.out.println("No. of rows affected : " + result);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("connection closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
