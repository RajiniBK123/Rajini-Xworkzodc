<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to SignIn Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Including the bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
.foot {
	width: 100%;
	background-color: black;
	color: white;
	left: 0;
	bottom: 0;
	position: fixed;
}
body {
	background-image: url("https://image.shutterstock.com/image-photo/beautiful-abstract-grunge-decorative-navy-260nw-539880832.jpg");
	background-size: 100%;
	background-repeat: no-repeat;
}
</style>
</head>
<body >
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
<div class="container">
<div class="navabar-brand" class="nav-link" style="text-transform:uppercase;">
<img src="https://ceblog.s3.amazonaws.com/wp-content/uploads/2012/05/20172622/ce-travel.jpg"
alt="Logo" style="width:100px;">

</div>
<div>
<ul class="nav navbar-nav navbar-right">
<li class = "nav-item-active"><a href="signUp.jsp" class="nav-link">signUp</a></li>
<li class = "nav-item-active"><a href="index.jsp" class="nav-link">Home</a></li>
</ul>
</div>
</div>
</nav>
<div>
<h1 style="text-align: center; ">${Msg}</h1>
<h2>${Data}</h2>
<form action="login" method = "post" style="text-align: center;">
<h2>Enter User Details Below</h2><br>
<pre>
UserEmail:<input type="email" name="userEmail" placeholder="Enter Your Email_Id" required/><br>
Password:<input type="text" name="password" placeholder="Enter Your password" required/><br>
		<input type="submit" value="Sign In" style="background-color: blue; color:white;position:relative;" ><br>
        <a href="otpGenerator.jsp">Forgot Password</a><br><br>
	</form>
	</div>
 <br><br>
</pre>
<ul class="nav navbar-nav ml-auto">
<li class="nav-items"><a class="nav-link" href="resetPassword.jsp">Reset Password</a></li>
		</ul>
</form>

<div class="foot">
	<footer class="page-footer font-small blue">

		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">
			© 2022 Rajini: <a href="index.jsp">Home</a>
		</div>
		<!-- Copyright -->
	</footer>
	</div>
</body>
</html>