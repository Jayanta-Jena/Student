package StudentLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Signup extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String phone=req.getParameter("phone");
		
		req.setAttribute("name", name);
		req.setAttribute("phone", phone);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("studenthome");
		dispatcher.forward(req, resp);
	}

}
