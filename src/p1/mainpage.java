package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

public class mainpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	
    	String name=request.getParameter("name");
    	String lname=request.getParameter("lname");
    	String mobile=request.getParameter("mobile");
    	String amobile=request.getParameter("amobile");
    	
     HttpSession session=request.getSession();
     session.setAttribute("name", name);
     
     setgetduo d=new setgetduo();
     d.setName(name);
     d.setLname(lname);
     d.setMobile(amobile);
     d.setAmobile(amobile);
     
     int status=saveduo.save(d);
     
     if(status > 0)
     {
    	 RequestDispatcher rd=request.getRequestDispatcher("mainpage.jsp");
    	 rd.include(request, response);
     }
     else
     {
    	 out.print("<h1>  Try Again</h1>");
    	 RequestDispatcher rd=request.getRequestDispatcher("index.html");
    	 rd.include(request, response);
     }
     
     
    	
    	
    	
    	
	}

}
