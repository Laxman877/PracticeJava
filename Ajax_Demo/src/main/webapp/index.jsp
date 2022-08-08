<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  <script type="text/javascript">
  $(document).ready(function(){
	alert("ajax calling...");  
  })
  function sendData(){
	  var uname=$("#uname").val();
	  alert(uname);
  }
  </script>
</head>
<body>
	<input type="text" id="uname">
	<button onclick="sendData()">Send</button>
</body>
</html>