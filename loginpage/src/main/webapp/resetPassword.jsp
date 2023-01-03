<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Including the bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Resetting Password</title>
<style>
form{
width:400px;
height:475px;
margin: 10px 500px 75px 450px;
background-color:snow;
border-radius: 22px;
padding-top: 40px;
opacity: 0.8
}
form label{
color:black;
display:flex;
margin-top:25px;
font-size: 15px;
margin-left: 25px;
}
form input
{
width: 300px;
padding: 2px;
border-radius: 7px;
margin-right: 50px;
}
h4{
text-align: Center;
padding-top: -10px;
}
.footer
{
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: black;
	color: white;
	text-align: center;
}
</style>
</head>
<body style= "background-image: url('https://media.istockphoto.com/id/1309040743/photo/travel-planning-background.jpg?b=1&s=170667a&w=0&k=20&c=oYsf4vJ1lCmKJAwq1DAIte1KH56qCmiyNDvoysDHUhQ='); background-repeat: no-repeat;background-size: cover;">
<nav class="navbar navbar-expand-md bg-dark navbar-dark">

		<a class="navbar-brand" href="#"> 
		<img src="https://img.jakpost.net/c/2018/09/24/2018_09_24_54541_1537763236._large.jpg" alt="Logo" style="width:150px;">
		</a>
		
		<ul class="nav navbar-nav ml-auto">
			<li class="nav-items"><a class="nav-link" href="index.jsp">Home</a></li>
			<li class="nav-items"><a class="nav-link" href="signIn.jsp">Sign In</a></li>
		</ul>
	</nav>
		<h2>Reset Password</h2>
	${msg}
	<form action="pass" method="get" style="text-align: center;">
	    <h4>Reset Password</h4>
	    <p>Password Should contain characters between 10-12</p>
	   <label>Email:</label><input type="email" placeholder="Enter Your Email" name="email" required><br> 
	   <label>Enter OTP</label><input type="text" placeholder="Enter OTP" name="otp"><br>
		<label>Enter New Password:</label> <input type="text" placeholder="Enter your password" name="password"><br><br>
		<input type="submit" value="Reset Password" style="background-color: blue; color: white">
	</form>
	<div class="footer">
		<p>&copy; 2022 Rajini,All Rights Reserved</p>
	</div>

</body>
</html>
		