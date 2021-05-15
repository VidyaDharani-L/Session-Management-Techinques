package demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out =response.getWriter();
			String uname=request.getParameter("uname");
			if(uname.equals("vidya"))
			{
				out.println("welcome"+uname);
				out.println("<form action='SecondServlet'");
				out.println("<input type='hidden' uname='uname' value='"+uname+"'> ");
				out.println("<input type='submit' value='click to visit next page'>");
				
			}
			else
			{
				out.println("Invalid details");
				request.getRequestDispatcher("login.html").include(request, response);
			}
	}

}