package login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
// import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

// @SuppressWarnings("serial")

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		response.sendRedirect("login.jsp");
	}
}
