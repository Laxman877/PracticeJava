<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data</title>
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
			<div class="col md-4"></div>
			<div class="col md-4">
				<h1 class="text-success">Student Data</h1>
				<table class="table table-striped table-hover">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Street</th>
						<th>City</th>
						<th>State</th>
						<th>Zipcode</th>
						<th colspan="2">Action</th>
					</tr>
					<c:forEach var="dt" items="${data}">
						<tr>
							<td>${dt.getId()}</td>
							<td>${dt.getStd_name()}</td>
							<td>${dt.getAddress().getStreet()}</td>
							<td>${dt.getAddress().getCity()}</td>
							<td>${dt.getAddress().getState()}</td>
							<td>${dt.getAddress().getZipcode()}</td>
							<td><a href="update?action=delete&&uid=${dt.getId()}">Delete</a></td>
							<td><a href="update?action=update&&uid=${dt.getId()}">Update</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="col md-4"></div>
		</div>
	</div>
</body>
</html>