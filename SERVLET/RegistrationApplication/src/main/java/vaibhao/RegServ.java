package vaibhao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class RegServ
 */
@WebServlet("/reg")
public class RegServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String contact=request.getParameter("contact");
	String qual=request.getParameter("qual");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	out.println("<h1> Name is &nbsp;"+name+"</h1>");
	out.println("<h1> Email is &nbsp;"+email+"</h1>");
	out.println("<h1> Contact is &nbsp;"+contact+"</h1>");
	out.println("<h1> Qualification is &nbsp;"+qual+"</h1>");
	out.println("<h1> Username is &nbsp;"+username+"</h1>");
	out.println("<h1> Password is &nbsp;"+password+"</h1>");
	
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse","vaibhaovk","vaibhao");
		if(conn!=null)
		{
			PreparedStatement stmt=conn.prepareStatement("insert into registration values('0',?,?,?,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2,email);
			stmt.setString(3, contact);
			stmt.setString(4, qual);
			stmt.setString(5, username);
			stmt.setString(6, password);
			int value=stmt.executeUpdate();
			if(value>0)
			{
				out.println("Registration Succesfull");
			}
			else {
				out.println("Registration Failed");
			}
			}
		else {
			out.println("Not Connected");
		}
	}
	catch(Exception ex)
	{	
		out.println("Error is" +ex);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
