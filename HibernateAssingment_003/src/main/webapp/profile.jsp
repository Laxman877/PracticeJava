<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	<form action="display" method="post">
		<table class="table" border="1">
			<tr>
				<th>Student Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Password</th>
				<th>Gender</th>
				<th>Image</th>
				<th colspan="2">Action</th>
			</tr>
			
			<tr>
				<td>${dt.getId()}</td>
				<td>${dt.getFname()}</td>
				<td>${dt.getLname()}</td>
				<td>${dt.getEmail()}</td>
				<td>${dt.getMobile()}</td>
				<td>${dt.getPass()}</td>
				<td>${dt.getGender()}</td>
				<td><img alt="" src="img/${dt.getImg()}"></td>
				<td><a href="update?action=update&&uid=${dt.getId()}">Edit</a></td>
				<td><a href="update?action=delete&&uid=${dt.getId()}">Delete</a></td>
			</tr>
			
		</table>
	</form><br>
	
	<a href="logout">Logout</a>
</body>
</html>