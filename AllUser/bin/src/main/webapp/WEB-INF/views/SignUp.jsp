<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/webjars/bootstrap/4.6.1/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	  <form:form action="/do-signup" modelAttribute="user" method="POST" >
		<table>
			<tr>
				<td><label>User name</label> <form:input path="userName" type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td><label>Email</label> <form:input path="email" type="text" id="email" name="email" /></td>
			</tr>
			<tr>
				<td><label>Ph No</label> <form:input path="phNo" type="text" id="phNo" name="phNo" /></td>
			</tr>
			<tr>
				<td><label>Role</label> <form:input path="role" type="text" id="role" name="role" /></td>
			</tr>
			<tr>
				<td><label>Password</label> <form:input path="password" type="text" id="password" name="password" /></td>
			</tr>
			<tr>
				<td><form:input type="text" path="emailVerified" id="emailVerified" value="false"/></td>
			</tr>
			<tr>
				<td><form:input type="text" path="phnoVerified" id="phnoVerified" value="false"/></td>
			</tr>
			<tr>
			   <td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
<script type="text/javascript" src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/bootstrap/4.6.1/css/bootstrap.min.js" ></script>
</html>