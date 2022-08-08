<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
	String uname=(String)session.getAttribute("uname");
	if(uname==null){
		request.setAttribute("err", "Please Login First!!");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
%>
<h1>Products</h1>
<ul>
<li>Tv</li>
<li>Mobile</li>
<li>Laptop</li>
<li>Ac</li>
</ul>
<h1><a href="logout">Logout</a></h1>
</body>
</html>