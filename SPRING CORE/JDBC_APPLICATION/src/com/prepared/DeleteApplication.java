package com.prepared;
import java.sql.*;
import java.util.*;

public class DeleteApplication {
		public static void main(String[] args) throws Exception {
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
			if (conn != null) {
				Scanner xyz = new Scanner(System.in);
				System.out.println("Enter the email address");
				String email = xyz.nextLine();
				PreparedStatement stmt = conn.prepareStatement("delete from register where email=?");
				stmt.setString(1, email);
				int value = stmt.executeUpdate();
				if (value > 0) {
					System.out.println("Record deleted success");
				} else {
					System.out.println("Some problem is there");
				}

			} else {
				System.out.println("Database is not connected");
			}
		}

	}
