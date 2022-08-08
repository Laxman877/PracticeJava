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
				<h1 class="text-success">Registartion From</h1>
				<form action="reg">
					<div class="form-group">
						<label>First Name</label> <input type="text" name="fname"
							class="form-control" id="fname" value="<%if(request.getParameter("fname")!=null){%><%=request.getParameter("fname")%><%}%>"> <span id="fnameE"
							class="text-danger">${fnameE}</span>
					</div>
					<div class="form-group">
						<label>Last Name</label> <input type="text" name="lname"
							class="form-control" id="lname" value="<%if(request.getParameter("lname")!=null){%><%=request.getParameter("lname")%><%}%>"> <span id="lnameE"
							class="text-danger">${lnameE}</span>
					</div>
					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control" id="mobile" value="<%if(request.getParameter("mobile")!=null){%><%=request.getParameter("mobile")%><%}%>"> <span id="mobileE"
							class="text-danger">${mobileE}</span>
					</div>
					<div class="form-group">
						<label>Email</label> <input type="text" name="email"
							class="form-control" id="email" value="<%if(request.getParameter("email")!=null){%><%=request.getParameter("email")%><%}%>"> <span id="emailE"
							class="text-danger">${emailE}</span>
					</div>
					<div class="form-group">
						<label>Password</label> <input type="text" name="pass"
							class="form-control" id="pass" value="<%if(request.getParameter("pass")!=null){%><%=request.getParameter("pass")%><%}%>"> <span id="passE"
							class="text-danger">${passE}</span>
					</div><br>
					<input type="submit" class="btn btn-success" id="sbtn">
					<input type="reset" class="btn btn-primary" id="rbtn">
				</form>
			</div>
		</div>
	</div>
</body>
</html>