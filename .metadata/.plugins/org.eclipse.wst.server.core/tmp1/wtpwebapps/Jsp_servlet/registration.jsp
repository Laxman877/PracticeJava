<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<h1 class="text-success">Registration Form</h1>
				<form action="reg">
					<div class="form-group">
						<label>First Name</label> <input type="text" name="fname"
							class="form-control">
					</div>
					<div>
						<label>Last Name</label> <input type="text" name="lname"
							class="form-control">
					</div>
					<div>
						<label>Email</label> <input type="text" name="email"
							class="form-control">
					</div>
					<div>
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control">
					</div>
					<div>
						<label>Gender</label> <input type="text" name="gender"
							class="form-control">
					</div>
					<div>
						<label>Password</label> <input type="text" name="password"
							class="form-control">
					</div>
					<br> <input type="submit" class="btn btn-success"> <input
						type="reset" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
</body>
</html>