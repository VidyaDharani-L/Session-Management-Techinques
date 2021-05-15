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
				HttpSession session=request.getSession();
				session.setAttribute("uname",uname);
				
				}
				else {
				out.println("In valid user plz login again");
				request.getRequestDispatcher("login.html").include(request,response);

				}

		}
}
