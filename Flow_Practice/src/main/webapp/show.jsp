<%@page import="com.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-6">
			
				<h1 align="center">Students</h1>
					<table class="table">
						<tr>
							<th>Student Id</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Email</th>
							<th>Mobile</th>
							<th>Gender</th>
							<th>Password</th>
							<th colspan="2">Action</th>
						</tr>
						<%
						ArrayList<User> al=(ArrayList) request.getAttribute("data");
						for(User u:al){
						%>
						<tr>
							<td><%=u.getId()%></td>
							<td><%=u.getFname()%></td>
							<td><%=u.getLname()%></td>
							<td><%=u.getEmail()%></td>
							<td><%=u.getMobile()%></td>
							<td><%=u.getGender()%></td>
							<td><%=u.getPass()%></td>
							<td><a class="btn btn-danger"
								href="update?action=delete&&uid=<%=u.getId()%>">Delete</a></td>
							<td><a class="btn btn-primary"
								href="update?action=update&&uid=<%=u.getId()%>">Update</a></td>
						</tr>
						<%
						}
						%>
					</table>
			</div>
		</div>
	</div>
</body>
</html>