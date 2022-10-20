package vaibhao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewsession")
public class ViewSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewSession() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); // use the existing created session
		// Object obj=session.getAttribute("u");
		// String u=obj.toString();
		String u = session.getAttribute("u").toString(); // fetch data from session
		String p = session.getAttribute("p").toString();
		out.println("Data from session is <br>");
		out.println("<h1>Username is " + u + "</h1>"); // display the data from session
		out.println("<h1>Password is " + p + "</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
