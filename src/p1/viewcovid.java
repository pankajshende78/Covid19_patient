package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class viewcovid extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<setgetduo> list=saveduo.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Address</th><th>Mobile</th><th>Send Ambulance</th></tr>");
		for(setgetduo bean:list){
			out.println("<tr><td>"+bean.getId()+"</td><td>"+bean.getFname()+"</td><td>"+bean.getLname()+"</td><td>"+bean.getEmail()+"</td><td>"+bean.getAdd()+"</td><td>"+bean.getMobile()+"</td><td><a href='deletecovid="+bean.getId()+"'>Send Ambulance</a></td></tr>");
		}
		out.println("</table>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
