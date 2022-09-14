<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Here</h1>
<span>${err}</span>
<span>${msg}</span>
<form action="login" method="post">
<input type="text" name="email" placeholder="Username">
<input type="text" name="pass" placeholder="Password">
<input type="submit">
</form>
</body>
</html>