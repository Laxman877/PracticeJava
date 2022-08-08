<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registartion</title>
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
				<h1 class="text-success" align="center">Registration</h1>
				<span class="text-success">${msg}</span>
				<form action="reg">
				<input type="hidden" name="stid" value="${dt.getId()}">
					<div class="form-group">
						<label>Student Name</label> <input type="text" name="std_name"
							placeholder="Enter Name" class="form-control" value="${dt.getStd_name()}">
					</div>
					<div class="form-group">
						<label>Street</label> <input type="text" name="street"
							placeholder="Enter street" class="form-control" value="${dt.getAddress().getStreet()}">
					</div>
					<div class="form-group">
						<label>City</label> <input type="text" name="city"
							placeholder="Enter City" class="form-control" value="${dt.getAddress().getCity()}">
					</div>
					<div class="form-group">
						<label>State</label> <input type="text" name="state"
							placeholder="Enter state" class="form-control" value="${dt.getAddress().getState()}">
					</div>
					<div class="form-group">
						<label>Zipcode</label> <input type="text" name="zipcode"
							placeholder="Enter zipcode" class="form-control" value="${dt.getAddress().getZipcode()}">
					</div>
					<br> <input type="submit" class="btn btn-success">
				</form>
				<a href="display">View Data</a>
			</div>
			<div class="col md-4"></div>
		</div>
	</div>
</body>
</html>