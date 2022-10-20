package vaibhao;

import java.sql.*;

public class DAO {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	public DAO() throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk", "vaibhao");
	}

	public boolean isRegister(Register r) throws SQLException {
		stmt = conn.prepareStatement("insert into miniproject values('0;,?,?,?,?,?)");
		stmt.setString(1, r.getName());
		stmt.setString(2, r.getEmail());
		stmt.setString(3, r.getContact());
		stmt.setString(4, r.getUsername());
		stmt.setString(5, r.getPassword());
		int value = stmt.executeUpdate();
		if (value > 0) {
			return true; // SUCCESS
		} else {
			return false; // FAILED
		}
	}
}
