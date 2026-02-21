package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/jdbc_db?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);

			Statement stm = con.createStatement();

			String sql = "SELECT * FROM student";

//			stm.executeUpdate(sql);//Exception

			ResultSet rs = stm.executeQuery(sql);

			System.out.println("*************Students**************");

			while (rs.next()) {
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String address = rs.getString(4);

				System.out.println("Sid : " + sid);
				System.out.println("Name : " + name);
				System.out.println("Email : " + email);
				System.out.println("Address :" + address);
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			}

			con.close();

			System.out.println("records fetched");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
