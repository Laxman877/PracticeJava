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
			<div class="col-md-4"></div>
			<div class="col-md-4">

				<h1 class="text-success">Edit Profile Form</h1>
				<form action="reg">
					<input type="hidden" name="id" value="${data.getUid()}"> <span
						class="text-success">${msg}</span> <span class="text-danger">${warn}</span>
					<div class="form-group">
						<label>First Name</label> <input type="text" name="fname"
							value="${data.getFname()}" class="form-control" id="fname"
							onblur="validation()"> <span id="fnameE"
							class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Last Name</label> <input type="text" name="lname"
							value="${data.getLname()}" class="form-control" id="lname"
							onblur="validation()"> <span id="lnameE"
							class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Email</label> <input type="text" name="email"
							value="${data.getEmail()}" class="form-control" id="email"
							onblur="validation()"> <span id="emailE"
							class="text-danger"></span>
					</div>

					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							value="${data.getMobile()}" class="form-control" id="mobile"
							onblur="validation()"> <span id="mobileE"
							class="text-danger"></span>
					</div>
					<br>
					<button class="btn btn-primary">Update</button>
				</form>
				<h4><a href="logout">Logout</a>|<a href="display">Profile</a></h4>
			</div>
			<div class="col-md-4"></div>
		</div>

	</div>
</body>
</html>