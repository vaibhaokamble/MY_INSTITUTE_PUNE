package vaibhao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/create")
public class CreateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreateSession() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true); // created session here
		String username = request.getParameter("username");// accept form data
		String password = request.getParameter("password");
		session.setAttribute("u", username); // store data in session
		session.setAttribute("p", password);
		out.println("<a href='viewsession'>View Session Data</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
