<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col md-2">
				<h1 class="text-success">Message</h1>
				<form action="msgpass">
				<span class="text-warning">${msg}</span>
					<div class="form-group">
						<label>From</label> <input type="text" name="from"
							class="form-control">
					</div>
					<div class="form-group">
						<label>Message</label> <input type="text" name="msg"
							class="form-control">
					</div>
					<div class="form-group">
						<label>To</label> <input type="text" name="to"
							class="form-control">
					</div>
					<br> <input type="submit" class="btn btn-warning">
				</form>
			</div>
			<div class="col-md-6">
				<h4 align="right">
					<a href="logout">Logout</a>
				</h4>
				<h1 align="center" class="text-success">welcome</h1>
				<table class="table" border="1">
					<tr>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Mobile</th>
						<th colspan="1">Action</th>
					</tr>
					<%
					User u = (User) request.getAttribute("data");
					%>
					<tr>
						<td><%=u.getUid()%></td>
						<td><%=u.getFname()%></td>
						<td><%=u.getLname()%></td>
						<td><%=u.getEmail()%></td>
						<td><%=u.getMobile()%></td>
						<td><a class="btn btn-primary"
							href="edit?action=update&&uid=<%=u.getUid()%>">Edit</a></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>