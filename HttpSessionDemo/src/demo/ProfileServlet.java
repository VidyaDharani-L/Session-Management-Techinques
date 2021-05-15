package demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;


public class ProfileServlet extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			request.getRequestDispatcher("header.html").include(request, response);
		
			HttpSession session=request.getSession(false);
			if(session!=null) {
				out.println("Hello"+session.getAttribute("uname"));
			}
			else {
				out.println("plz login first");
				request.getRequestDispatcher("login.html").include(request, response);

				
			}

		
}
}
