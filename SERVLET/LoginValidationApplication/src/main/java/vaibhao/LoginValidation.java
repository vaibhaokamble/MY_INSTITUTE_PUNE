package vaibhao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

@WebServlet("/validate")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginValidation() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("name");
		String upass = request.getParameter("pass");
		try {
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "vaibhaovk",
					"vaibhao");
			if (conn != null) {
				PreparedStatement stmt = conn
						.prepareStatement("select *from sregister where username=? and password=?");
				stmt.setString(1, uname);
				stmt.setString(2, upass);
				ResultSet rs = stmt.executeQuery();
				if (rs.next()) {
					RequestDispatcher r = request.getRequestDispatcher("welcome.html");
					r.forward(request, response);
				} else {
					RequestDispatcher r = request.getRequestDispatcher("login.html");
					r.include(request, response);
					out.println("<h1>Invalid username and password</h1>");
				}
			} else {
				out.println("Not Connected");
			}
		} catch (Exception ex) {
			out.println("Error is " + ex);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
