package com.prepared;
import java.sql.*;

public class SelectApplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
		if (conn != null)
		{
			PreparedStatement stmt = conn.prepareStatement("select *from register");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
		}
		else
		{
			System.out.println("Not Connected");
		}
	}

}
