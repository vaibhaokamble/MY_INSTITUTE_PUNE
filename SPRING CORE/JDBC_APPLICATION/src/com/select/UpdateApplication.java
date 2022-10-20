package com.select;

import java.util.*;
import java.sql.*;

public class UpdateApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the  name email and contact");
			String name = v.nextLine();
			String email = v.nextLine();
			String contact = v.nextLine();
			Statement stmt = conn.createStatement();
			int value = stmt.executeUpdate(
					"update register set name='" + name + "',contact='" + contact + "' where email='" + email + "'");
			if (value > 0) {
				System.out.println("Update the Query");
			} else {
				System.out.println("Some problem is there");
			}
		} else {
			System.out.println("Database is not Connected");
		}
	}

}
