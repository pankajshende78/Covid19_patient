<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<%


HttpSession s=request.getSession();



String a=(String) s.getAttribute("name");
out.print("Thank you "+a);


%>
<br>


<form action="vote"  method="post">


<select name="vote">

<option>Java</option>
<option>Html</option>
<option>Css</option>
<option>C++</option>
</select>
<br><br>
<input  type="submit" value="submit"  this.disabled=true; this.value='please wait....';"/>









</form>
<br>




<% 
out.print("<a href='user.html'>logout</logout>");






%>

</body>
</html>