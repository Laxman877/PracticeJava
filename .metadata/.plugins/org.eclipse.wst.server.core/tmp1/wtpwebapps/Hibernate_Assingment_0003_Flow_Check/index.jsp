<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<h1>Registration</h1>
<form action="reg">
<span>${warn}</span>
<span>${msg}</span>
<input type="hidden" name="id" value="${dt.getId()}">
<input type="text" name="fname" placeholder="Enter First Name" value="${dt.getFname()}">
<input type="text" name="lname" placeholder="Enter Last Name" value="${dt.getLname()}">
<input type="text" name="email" placeholder="Enter Email" value="${dt.getEmail()}">
<input type="text" name="mobile" placeholder="Enter Mobile" value="${dt.getMobile()}">
<input type="text" name="pass" placeholder="Enter Password" value="${dt.getPass()}">
<input type="text" name="gender" placeholder="Enter Gender" value="${dt.getGender()}">
<input type="submit">
</form>
<a href="login.jsp">Login</a>
</body>
</html>