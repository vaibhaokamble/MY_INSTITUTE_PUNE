package vaibhao;
import java.sql.*;

public class DriverApplication {

	public static void main(String[] args)throws Exception
	{
		 com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		 	DriverManager.registerDriver(d);
	}
}