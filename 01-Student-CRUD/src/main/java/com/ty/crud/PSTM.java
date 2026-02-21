package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSTM {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/jdbc_db";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO student VALUES(?,?,?,?)";

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 103);
			pstm.setString(2, "Penga");
			pstm.setString(3, "penga@gmail.com");
			pstm.setString(4, "Andheri");

			pstm.execute();

			con.close();

			System.out.println("record saved and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
