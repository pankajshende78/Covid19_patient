
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


String name=request.getParameter("name");
String password=request.getParameter("password");



HttpSession s=request.getSession();
s.setAttribute("name", name);


Class.forName("com.mysql.cj.jdbc.Driver");
Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb","root","root");
PreparedStatement pst=con.prepareStatement("select * from demo2 where name=? and password=?");
pst.setString(1, name);
pst.setString(2, password);
ResultSet rs=pst.executeQuery();
if(rs.next())
{
	%>
<jsp:forward page="succ.jsp"></jsp:forward>


<% 

 }
  
else
{
	RequestDispatcher rd=request.getRequestDispatcher("user.html");
      rd.forward(request, response);
	
}

%>

</body>
</html>