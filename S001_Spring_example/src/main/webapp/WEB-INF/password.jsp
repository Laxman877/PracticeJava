<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Let's check on spring mvc password</h2>

	<form:form method="post" commandName="password">
		<table>
			<tr>
				<td>Enter password:</td>
				<td><form:password path="password" showPassword="true" /></td>
				<td><form:errors path="password" class="text-danger"></form:errors>
				</td>
			<tr>
				<td>Enter confirm password:</td>
				<td><form:password path="cnfpassword" showPassword="true" /></td>
				<td><form:errors path="cnfpassword" class="text-danger"></form:errors>
				</td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
			</tr>
		</table>
	</form:form>
</body>
</html>