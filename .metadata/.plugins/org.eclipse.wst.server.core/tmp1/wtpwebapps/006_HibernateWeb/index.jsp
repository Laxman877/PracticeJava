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
<form action="reg" method="post">
<input type="hidden" name="id" value="${data.getId()}">
<input type="text" name="name" placeholder="Enter Name" value="${data.getName()}">
<input type="text" name="email" placeholder="Enter Email" value="${data.getEmail()}">
<input type="text" name="dept" placeholder="Enter Dept" value="${data.getDept()}">
<input type="submit">
</form>
<a href="display">View All Data</a>
</body>
</html>