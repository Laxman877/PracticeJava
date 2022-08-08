<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Employee Data</h1>
<table align="center" border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th colspan="2">Action</th>
</tr>
<c:forEach var="dt" items="${data}">
<tr>
<td>${data.getId()}</td>
<td>${data.getName()}</td>
<td>${data.getEmail()}</td>
<td>${data.getPass()}</td>
<td></td>
<td></td>
</tr>
</c:forEach>
</table>
</body>
</html>