<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data</title>
</head>
<body>
	<h1>Welcome</h1>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Password</th>
			<th>Gender</th>
			<th colspan="2">Actions</th>
		</tr>
		<tr>
			<td>${dt.getId()}</td>
			<td>${dt.getFname()}</td>
			<td>${dt.getLname()}</td>
			<td>${dt.getEmail()}</td>
			<td>${dt.getMobile()}</td>
			<td>${dt.getPass()}</td>
			<td>${dt.getGender()}</td>
			<td><a href="update?action=update&&uid=${dt.getId()}">Update</a></td>
			<td><a href="logout">Logout</a></td>
		</tr>
	</table>
</body>
</html>
