<%@page import="com.tops.Model.UserDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot MVC</title>
</head>
<body>
<%List<UserDetails> l= (List) request.getAttribute("list");%>
<h1 style="text-align: center;">User Details</h1>
<table style="text-align: center;">
<thead>
<tr>
	<th>User Id</th>
	<th>Username</th>
	<th>Email</th>
	<th>Password</th>
	<th>Action</th>
</tr>
</thead>
<tbody>
<% for(UserDetails u: l){ %>
<tr>
	
	<th><%=u.getUserId() %></th>
	<th><%=u.getUsername() %></th>
	<th><%=u.getEmail() %></th>
	<th><%=u.getPassword() %></th>
</tr>
<%} %>
 </tbody>
</table>
</body>
</html>