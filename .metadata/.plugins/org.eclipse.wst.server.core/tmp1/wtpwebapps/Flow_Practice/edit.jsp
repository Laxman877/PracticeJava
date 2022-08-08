<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
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
			<div class="col-md-4"></div>
			<div class="col-md-4">

				<h1 class="text-success">Edit Form</h1>
				<form action="edit">
					<input type="hidden" name="id" value="${udata.getId()}"> 
					<span class="text-success">${msg}</span>
					<div class="form-group">
						<label>First Name</label> <input type="text" name="fname"
							class="form-control" id="fname" value="${udata.getFname()}" onblur="validation()"> <span
							id="fnameE" class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Last Name</label> <input type="text" name="lname"
							class="form-control" id="lname" value="${udata.getLname()}" onblur="validation()"> <span
							id="lnameE" class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Email</label> <input type="text" name="email"
							class="form-control" id="email" value="${udata.getEmail()}" onblur="validation()"> <span
							id="emailE" class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control" id="mobile" value="${udata.getMobile()}" onblur="validation()"> <span
							id="mobileE" class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Gender</label> <input type="text" name="gender"
							class="form-control" id="gender" value="${udata.getGender()}" onblur="validation()"> <span
							id="genderE" class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Password</label> <input type="text" name="pass"
							class="form-control" id="pass" value="${udata.getPass()}" onblur="validation()"> <span
							id="passE" class="text-danger"></span>
					</div>
					<br> <input type="submit" class="btn btn-success" id="sbtn">
					<input type="reset" class="btn btn-info">
				</form>
				<h2>
					<a href="show">Show Data</a>
				</h2>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>