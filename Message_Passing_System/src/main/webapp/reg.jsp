<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<title>Hello world</title>
<script type="text/javascript">
	function validation() {
		var fname = document.getElementById("fname").value;
		var lname = document.getElementById("lname").value;
		var email = document.getElementById("email").value;
		var mobile = document.getElementById("mobile").value;
		var btn = document.getElementById("sbtn");

		var fnameE = document.getElementById("fnameE");
		var lnameE = document.getElementById("lnameE");
		var emailE = document.getElementById("emailE");
		var mobileE = document.getElementById("mobileE");

		var unameExp = /^[a-zA-Z]+$/;
		var emailExp = /^[A-Za-z0-9+_.-]+@(.+)$/;

		if (fname == "" || fname == null) {
			fnameE.innerHTML = "First name Required!!!"
			btn.disabled = true;
		} else if (!unameExp.test(fname)) {
			fnameE.innerHTML = "Only char. allowed"
			btn.disabled = true;
		} else {
			fnameE.innerHTML = "";

		}

		if (lname == "" || lname == null) {
			lnameE.innerHTML = "Last name Required!!!"
			btn.disabled = true;
		} else if (!unameExp.test(lname)) {
			lnameE.innerHTML = "Only char. allowed!!"
			btn.disabled = true;
		} else {
			lnameE.innerHTML = "";

		}

		if (email == "" || email == null) {
			emailE.innerHTML = "Email Required!!!"
			btn.disabled = true;
		} else if (!emailExp.test(email)) {
			emailE.innerHTML = "invalid email format!!"
			btn.disabled = true;
		} else {
			emailE.innerHTML = "";

		}

		if (mobile == "" || mobile == null) {
			mobileE.innerHTML = "Mobile Number Required!!!"
			btn.disabled = true;
		} else {
			mobileE.innerHTML = "";
			btn.disabled = false;
		}
	}
</script>


<style type="text/css">
.err {
	color: red;
}
</style>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">

				<h1 class="text-success">Registration form</h1>
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
					<br> <input type="submit" class="btn btn-success" id="sbtn">
					<input type="reset" class="btn btn-info">
				</form>
				<h2>
					<a href="login.jsp">Login</a>
				</h2>
			</div>
			<div class="col-md-4"></div>
		</div>

	</div>

</body>
</html>