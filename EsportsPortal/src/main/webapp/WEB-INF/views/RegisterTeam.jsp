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
					<li class="nav-item"><a class="nav-link" href="/aboutus"><span>Games</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/aboutus"><span>Calender</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/signup"><span>Sponsors</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/signup"><span>News</span></a></li>
					<li class="nav-item"><a class="nav-link" href="/signup"><span>Contact Us</span></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container text-center">
	   	  <form:form action="/do-registerteam" modelAttribute="team" method="GET" >
		<table>
			<tr>
				<td><label>NAME(LEADER)</label> <input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td><label>TEAM_NAME</label> <form:input path="teamName" type="text" id="teamName" name="teamName" /></td>
			</tr>
			<tr>
				<td><label>EMAIL</label> <input type="text" id="email" name="phNo" /></td>
			</tr>
			<tr>
				<td><label>PHNO</label> <input type="phno" id="phno" name="phno" /></td>
			</tr>
			<tr>
				<td><label>Game</label> <form:input path="game.gameName" type="text" id="game" name="game" /></td>
			</tr>
			<tr>
				<td><label>TOURNAMENT_NAME(tournament/match)</label> <input path="password" type="text" id="password" name="password" /></td>
			</tr>
			<tr>
			   <td><input type="submit" value="Submit"></td>
			</tr> 
		</table>
		</form:form>
	</div>
</body>
<script type="text/javascript" src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="/webjars/bootstrap/4.6.1/css/bootstrap.min.js"></script>
</html>