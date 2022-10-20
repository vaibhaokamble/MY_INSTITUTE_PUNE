package com.prepared;
import java.sql.*;
import java.util.*;

public class InsertApplication {

	public static void main(String[] args) throws Exception {

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the name email and contact");
			String name = v.nextLine();
			String email = v.nextLine();
			String contact = v.nextLine();
			System.out.println("Connected");
			PreparedStatement stmt = conn.prepareStatement("insert into register value(?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, contact);
			int value = stmt.executeUpdate();
			if (value > 0) {
				System.out.println("Record save successfully");
			} else {
				System.out.println("Some problem is there");
			}
		} else {
			System.out.println("Databse is not connected");
		}
	}
}