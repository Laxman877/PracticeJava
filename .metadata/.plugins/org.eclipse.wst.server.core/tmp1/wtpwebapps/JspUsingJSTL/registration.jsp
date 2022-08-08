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
	<div class="conteiner">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<h1 class="text-success">Registarioin Form</h1>
				<form action="reg">
				<span class="text-success">${msg}</span>
					<div class="form-group">
						<label>First Name</label> <input type="text" class="form-control"
							name="fname">
					</div>
					<div class="form-group">
						<label>Last Name</label> <input type="text" class="form-control"
							name="lname">
					</div>
					<div class="form-group">
						<label>Email</label> <input type="text" class="form-control"
							name="email">
					</div>
					<div class="form-group">
						<label>Mobile</label> <input type="text" class="form-control"
							name="mobile">
					</div>
					<div class="form-group">
						<label>Gender</label> <input type="text" class="form-control"
							name="gender">
					</div>
					<div class="form=group">
						<label>Password</label> <input type="text" class="form-control"
							name="password">
					</div>
					<br> <input type="submit" class="btn btn-success"> <input
						type="reset" class="btn btn-primary">
				</form>
				<h1><a href="display">List</a></h1>
			</div>
		</div>
	</div>
</body>
</html>