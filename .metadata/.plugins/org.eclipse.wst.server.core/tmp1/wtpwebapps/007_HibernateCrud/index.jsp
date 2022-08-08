<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="left">Employee</h1>
<span>${msg}</span>
<span>${warn}</span>
<form action="reg">
<input type="text" name="name" placeholder="Enter Name"><br><br>
<input type="text" name="email" placeholder="Enter Email"><br><br>
<input type="text" name="pass" placeholder="Enter pass"><br><br>
<input type="submit">
</form><br>
<a href="display.jsp">View Employee</a>
</body>
</html>