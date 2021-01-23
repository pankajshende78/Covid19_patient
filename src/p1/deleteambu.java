package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class deleteambu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
	int	status=saveduo.deleteambu(id);
	if(status>0)
	{
		RequestDispatcher rd=request.getRequestDispatcher("viewambulance");
		rd.include(request, response);
		
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("viewambulance");
		rd.include(request, response);
	}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
