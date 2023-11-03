package StudentLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studenthome")
public class Home extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=(String)req.getAttribute("name");
		String phone=(String)req.getAttribute("phone");
		
		if(name!=null && phone!=null) {
			PrintWriter pw=resp.getWriter();
			pw.println("hello" +name);
			}
		else {
			PrintWriter pw=resp.getWriter();
			pw.println("plz add proper detail");
		}
	}

}
