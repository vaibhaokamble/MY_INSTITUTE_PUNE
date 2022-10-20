package com.select;

import java.sql.*;
import java.util.*;

public class InsertApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the name email and contact");
			String name = v.nextLine();
			String email = v.nextLine();
			String contact = v.nextLine();
			Statement stmt = conn.createStatement();
			int value = stmt
					.executeUpdate("insert into register values('" + name + "','" + email + "','" + contact + "')");
			if (value > 0) {
				System.out.println("Record save successfully");
			} else {
				System.out.println("Some Problem is There");
			}
		} else {
			System.out.println("Database is not Connected");
		}
	}

}
