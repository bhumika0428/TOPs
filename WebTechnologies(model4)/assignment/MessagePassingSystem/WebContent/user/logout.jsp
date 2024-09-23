<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MessagePassingSystem</title>
</head>
<body>
<%
session.removeAttribute("data");
session.invalidate();
response.sendRedirect("singin.jsp");
%>
</body>
</html>