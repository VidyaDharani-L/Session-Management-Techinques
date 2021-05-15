package demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class LoginServlet extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out=response.getWriter();
			request.getRequestDispatcher("header.html").include(request, response);
			String uname=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			if(uname.equals("vidya") & pwd.equals("vidya")) 
			{
				out.println("welcome"+uname);
				Cookie ck = new Cookie("uname",uname);
				ck.setMaxAge(4*60);
				response.addCookie(ck);
				}
				else {
				out.println("In valid user plz login again");
				request.getRequestDispatcher("login.html").include(request,response);

				}

		}
}
