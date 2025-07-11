<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration </title>
</head>
<body>
<br>
<h1 style="text-align: center;">UserDetails</h1><br>
<div style="text-align: center;">  
<f:form action="register" modelAttribute="user" method="post" >
<label>Username</label>
<f:input path="username" /><br>
<f:errors path="username" style="color:red"/><br>
<label>Email</label>
<f:input path="email"/><br><f:errors path="email" style="color:red"/><br>
<label>Password</label>
<f:input path="password"/><br><f:errors path="password" style="color:red"/><br>
<input type="submit" value="Register"/>
</f:form>
</div>
</body>
</html>