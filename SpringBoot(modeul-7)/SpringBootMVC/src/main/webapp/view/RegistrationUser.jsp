<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot MVC</title>
</head>
<body>
<h1 style="text-align: center;">Registration User</h1>
<div style="text-align: center;">
	<f:form action="addUser" method="post" modelAttribute="user">
		<label>Username</label>
		<f:input path="Username" /><br><br>
		<label>Email</label>
		<f:input  path="Email" /><br><br>
		<label>Password</label>
		<f:password  path="Password"  /><br><br>
		<button type="submit">Submit</button>
	</f:form>
</div>
</body>
</html>