<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/webjars/bootstrap/4.6.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
		<span class="navbar-brand mb-0 h1">Esports-Management-System</span>

		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/aboutus"><span>About
								Us</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/aboutus"><span>Teams</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/aboutus"><span>Social
								Media</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/signup"><span>Join
								Us</span></a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container text-center">
		<h3>You have signed up successfully!</h3>
		<p>Please check your email to verify your account.</p>
		<h4>
			<a href="/home">Go back to Home</a>
		</h4>
	</div>
</body>
<script type="text/javascript" src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="/webjars/bootstrap/4.6.1/css/bootstrap.min.js"></script>
</html>