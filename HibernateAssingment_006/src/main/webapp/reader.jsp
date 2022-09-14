<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="addreader">

		<table>
			<tr>
				<td><select name="subid">
						<c:forEach var="dt" items="${data}">
							<option value="${dt.getSubscriptionid()}">${dt.getSubscriptionName()}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="text" name="firstname" placeholder="FirstName">
				</td>
				<td><input type="text" name="lastname" placeholder="LastName">
				</td>
				<td><input type="text" name="email" placeholder="Email">
				</td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<br>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th colspan="2">Action</th>
		</tr>

		<c:forEach var="dt1" items="${rdata}">
			<tr>
				<td>${dt1.getReaderid()}</td>
				<td>${dt1.getFirstName()}</td>
				<td>${dt1.getLastName()}</td>
				<td>${dt1.getEmail()}</td>
				<td><a>Delete</a></td>
				<td><a>Update</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<form action="addsubscritpion">
		<table>
			<tr>
				<td><input type="text" name="subscriptionName"
					placeholder="SubscritptionName"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>