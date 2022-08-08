<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
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
		<div class="col-md-4 m-auto">
			<h1 align="center" class="text-success">Login Here</h1>
			<form action="login">
				<span class="text-danger">${err}</span> <span class="text-primary">${msg}</span>
				<div class="form-group">
					<label>Username</label> <input type="text" name="email"
						placeholder="Enter Username" class="form-control">
				</div>
				<div class="form-group">
					<label>Mobile</label> <input type="text" name="mobile"
						placeholder="Enter Mobile" class="form-control">
				</div>
				<br>
				<div class="from-group">
					<input type="submit" class="btn btn-success">
				</div><br>
				<button class="btn btn-warning"><a href="reg.jsp">Sing Up</a></button>
			</form>
		</div>
	</div>
</body>
</html>