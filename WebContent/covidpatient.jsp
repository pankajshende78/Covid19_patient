<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
     <link href="covidpatient.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <p   align="center"><b>Please Fill In This Form</b></p><br>
<form action="covidpatient"  method="post">
Enter first Name<br>
<input type="text" name="fname" placeholder="First Name"><br>
Enter Last Name<br>
<input type="text" name="lname" placeholder="Last Name"><br>
Enter Email<br>
<input type="email" name="email" placeholder="Email"><br>
Enter Address<br>
<input  type="text" name="add" placeholder="Address"><br>
Enter Mobile Number<br>
<input type="text" name="mobile" placeholder="Enter Mobile Number"><br>


<input type="submit" name="submit" value="Submit" class="signupbtn" >
</form>

<br><br><a href="mainpage.jsp"  ><button  class="cancelbtn">Back</button></a>

</div>

</body>
</html>