<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<title>Hello world</title>
<script type="text/javascript">
function validation()
{
	var fname = document.getElementById("fname").value;
	var lname = document.getElementById("lname").value;
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;
    var gender = document.getElementById("gender").value;
    var pass = document.getElementById("pass").value;
	var btn = document.getElementById("sbtn");
	
    var fnameE = document.getElementById("fnameE");
    var lnameE = document.getElementById("lnameE");
    var emailE = document.getElementById("emailE");
    var mobileE = document.getElementById("mobileE");
    var genderE = document.getElementById("genderE");
    var passE = document.getElementById("passE");
	
    
    var fnameExp = /^[a-zA-Z]+$/;
    var emailExp = /^[A-Za-z0-9+_.-]+@(.+)$/;
    var passExp = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$/;
    
    if(fname=="" || fname==null)
	{
		fnameE.innerHTML="First name Required!!!"
		btn.disabled=true;
	}
    else if(!fnameExp.test(fname))
    {
    	fnameE.innerHTML="Only char. allowed"
    	btn.disabled=true;
   	}
    else
    {
    	fnameE.innerHTML="";
    	
    }
    if(lname=="" || lname==null)
	{
		lnameE.innerHTML="Last name Required!!!"
		btn.disabled=true;
	}
    else if(!fnameExp.test(lname))
    {
    	lnameE.innerHTML="Only char. allowed"
    	btn.disabled=true;
   	}
    else
    {
    	lnameE.innerHTML="";
    	
    }
    if(email=="" || email==null)
	{
    	emailE.innerHTML="Email Required!!!"
    		btn.disabled=true;
	}
    else if(!emailExp.test(email))
    {
    	emailE.innerHTML="Please enter valid email"
    		btn.disabled=true;
    }
    else
    {
    	emailE.innerHTML="";
    	
    }
    if(mobile=="" || mobile==null)
	{
    	mobileE.innerHTML="mobile Required!!!"
    	btn.disabled=true;
	} 
    else
    {
    	mobileE.innerHTML="";
    	
    }
    
    if(gender=="" || gender==null)
	{
    	genderE.innerHTML="gender Required!!!"
    	btn.disabled=true;
	}
    else if(!fnameExp.test(gender))
    {
    	genderE.innerHTML="Only char. allowed"
    	btn.disabled=true;
   	}
    else
    {
    	genderE.innerHTML="";
    	btn.disabled=false;
    }
    
    if(pass=="" || pass==null)
	{
    	passE.innerHTML="Password Required!!!"
    		btn.disabled=true;
	}
    else
    {
    	passE.innerHTML="";
    	
    }	
}

</script>


    <style type="text/css">
    
    .err
    {
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
  	<span class="text-success">${msg}</span>
  	<div class="form-group">
  	<label>First Name</label>
  	<input type="text" name="fname" class="form-control" id="fname" onblur="validation()">
  	<span id="fnameE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  	<label>Last Name</label>
  	<input type="text" name="lname" class="form-control" id="lname" onblur="validation()">
  	<span id="lnameE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Email</label>
  	<input type="text" name="email" class="form-control" id="email" onblur="validation()">
  	<span id="emailE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Mobile</label>
  	<input type="text" name="mobile" class="form-control" id="mobile" onblur="validation()">
  	<span id="mobileE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Gender</label>
  	<input type="text" name="gender" class="form-control" id = "gender" onblur="validation()">
  	<span id="genderE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Password</label>
  	<input type="text" name="pass" class="form-control" id="pass" onblur="validation()">
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