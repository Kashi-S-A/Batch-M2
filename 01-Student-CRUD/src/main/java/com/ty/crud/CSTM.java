package com.ty.crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CSTM {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/jdbc_db";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			String pr = "call save_student(?,?,?,?)";

			CallableStatement cstm = con.prepareCall(pr);
			cstm.setInt(1, 105);
			cstm.setString(2, "Chinga");
			cstm.setString(3, "Chinga@gmail.com");
			cstm.setString(4, "Kurla");

			cstm.execute();

			con.close();

			System.out.println("procedure executed and closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
