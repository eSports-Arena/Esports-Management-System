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
	<div class="container text-center">
		<h3>Congratulations, your account has been verified.</h3>
		<h4>
			<a th:href="/login">Click here to Login</a>
		</h4>
	</div>
</body>
<script type="text/javascript" src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="/webjars/bootstrap/4.6.1/css/bootstrap.min.js"></script>
</html>