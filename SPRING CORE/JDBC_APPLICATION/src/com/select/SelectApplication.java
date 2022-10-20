package com.select;

import java.sql.*;

public class SelectApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select *from register");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
		}
			else
			{
				System.out.println("Some problem is there");
			}
		
	}
}

