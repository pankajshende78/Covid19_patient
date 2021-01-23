package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class otherpatient
 */
public class otherpatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String add=request.getParameter("add");
		String mobile=request.getParameter("mobile");
		
		setgetduo d=new setgetduo();
		d.setFname(fname);
		d.setLname(lname);
		d.setEmail(email);
		d.setAdd(add);
		d.setMobile(mobile);
		
		int status=saveduo.otherpatient(d);
		
		if(status >0)
		{
			out.print("Thank You For Informing");out.print("<br>");
			out.print("Togerther We Can Fight Coronavirus");out.print("<br>");
			RequestDispatcher rd=request.getRequestDispatcher("covidpatient.jsp");
	    	 rd.include(request, response);
		}
		else
		{
			out.print("Submition fail");
			RequestDispatcher rd=request.getRequestDispatcher("covidpatient.jsp");
	    	 rd.include(request, response);
		}
		
	}

}
