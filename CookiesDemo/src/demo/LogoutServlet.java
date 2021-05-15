package demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class LogoutServlet extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("header.html").include(request, response);
		Cookie ck = new Cookie("uname","");
		ck.setMaxAge(0);
		response.addCookie(ck);
		out.println("you are logout");


		
	}

}
