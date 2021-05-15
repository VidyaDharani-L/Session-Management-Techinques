package demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;


public class ProfileServlet extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			request.getRequestDispatcher("header.html").include(request, response);
			Cookie ck[]=request.getCookies();
			String name=ck[0].getValue();
			if(ck!=null)
			{
				//if(ck[0].getValue()!=null|ck[0].getValue()!="")
				if(name!=null|!name.equals(""))
				{
					out.println("Welcome"+ck[0].getValue());
				}
			}
			else
			{
				out.println("plz login first");
				request.getRequestDispatcher("login.html").include(request, response);
			}
		
}
}
