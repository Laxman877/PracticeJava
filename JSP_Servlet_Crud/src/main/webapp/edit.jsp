<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
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
  	
  	<h1 class="text-success">Registration form</h1>
  	<form action="edit">
  	<input type="hidden" name="id" value="${udata.getSid()}">
  	<span class="text-success">${msg}</span>
  	<div class="form-group">
  	<label>First Name</label>
  	<input type="text" name="fname" value="${udata.getFname()}" class="form-control" id="fname" onblur="validation()">
  	<span id="fnameE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  	<label>Last Name</label>
  	<input type="text" name="lname" value="${udata.getLname()}" class="form-control" id="lname" onblur="validation()">
  	<span id="lnameE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Email</label>
  	<input type="text" name="email" value="${udata.getEmail()}" class="form-control" id="email" onblur="validation()">
  	<span id="emailE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Mobile</label>
  	<input type="text" name="mobile" value="${udata.getMobile()}" class="form-control" id="mobile" onblur="validation()">
  	<span id="mobileE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Gender</label>
  	<input type="text" name="gender" value="${udata.getGender()}" class="form-control" id = "gender" onblur="validation()">
  	<span id="genderE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Password</label>
  	<input type="text" name="pass" value="${udata.getPassword()}" class="form-control" id="pass" onblur="validation()">
  	<span id="passE" class="text-danger"></span>
  	</div>
  	<br>
  	<input type="submit" class="btn btn-success" id="sbtn">
  	<input type="reset" class="btn btn-info">
  	</form>
  	<h2><a href="show">Show Data</a></h2>
  	</div>
  	<div class="col-md-4"></div>
  	</div>
  	
  	</div>
</body>
</html>