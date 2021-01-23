package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ambulance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   
	   String fname=request.getParameter("fname");
	   String lname=request.getParameter("lname");
	   String mobile=request.getParameter("mobile");
	   String padd=request.getParameter("padd");
	   String gender=request.getParameter("gender");
	   String requester=request.getParameter("requester");
	   
	   setgetduo d=new setgetduo();
	   d.setFname(fname);
	   d.setLname(lname);
	   d.setMobile(mobile);
	   d.setPadd(padd);
	   d.setGender(gender);
	   d.setRequester(requester);
	   
	   int status =saveduo.ambulance(d);
	   
	   if(status >0)
	   {
		   out.print("succesfully Submition");
		   RequestDispatcher rd=request.getRequestDispatcher("ambulance.html");
		   rd.include(request, response);
	   }
	   else
	   {
		   out.print("Submition fail");
		   RequestDispatcher rd=request.getRequestDispatcher("ambulance.html");
		   rd.include(request, response);
		   
	   }
	   
	   
	   
	   
	   
	   
		
	}

}
