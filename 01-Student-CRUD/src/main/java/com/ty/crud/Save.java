package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/jdbc_db";
		String username = "postgres";
		String password = "root";

		try {
			// step 1 : Load the driver
			Class.forName(driver);
			System.out.println("driver loaded");

			// step 2 : Create a connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection created");

			// step 3 : Create the statement
			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String sql = "INSERT INTO student VALUES(101,'Manga','manga@gmail.com','Thane')";

			// step 4 : Execute the query
			System.out.println(stm.execute(sql));
			System.out.println("record is inserted");

			// step 5 : close the connection
			con.close();
			System.out.println("connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
