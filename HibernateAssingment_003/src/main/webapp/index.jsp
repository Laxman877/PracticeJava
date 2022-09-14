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
<h1>Student Registration</h1>
<span>${msg}</span>
<span>${warn}</span>
<form action="reg" method="post" enctype="multipart/form-data">
<input type="hidden" name="id" value="${dt.getId()}">
<input type="text" name="fname" placeholder="First Name" value="${dt.getFname()}">
<input type="text" name="lname" placeholder="Last Name" value="${dt.getLname()}">
<input type="text" name="email" placeholder="Email" value="${dt.getEmail()}">
<input type="text" name="mobile" placeholder="Mobile" value="${dt.getMobile()}">
<input type="text" name="pass" placeholder="Password" value="${dt.getPass()}">
<input type="text" name="gender" placeholder="Gender" value="${dt.getGender()}">
<input type="file" name="file">
<input type="submit">
</form>
<a href="login.jsp">Login</a>
</body>
</html>