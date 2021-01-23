package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email.equals("admin")&& password.equals("admin"))
		{
			
			out.print("Welcome "+email);
			RequestDispatcher rd=request.getRequestDispatcher("admin_nav.html");
			rd.include(request, response);
		}
		else
		{
	     out.print("Fail login");
		 RequestDispatcher rd=request.getRequestDispatcher("adminpage.html");
		 rd.include(request, response);
		} 
		
		
	}

}
