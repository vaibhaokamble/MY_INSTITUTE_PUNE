package com.select;

import java.util.*;
import java.sql.*;

public class DeleteApplication {

	public static void main(String[] args) throws Exception {

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the email want tou want");
			String email = v.nextLine();
			Statement stmt = conn.createStatement();
			int value = stmt.executeUpdate("delete from register where email ='" + email + "'");
			if (value > 0) {
				System.out.println("Record Delete Successfull");
			} else {
				System.out.println("Some Problem is there");
			}
		} else {
			System.out.println("Database is not connected");
		}
	}

}
