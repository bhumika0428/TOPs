<%@page import="Dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int id=Integer.parseInt(request.getParameter("id"));%>
<%StudentDao.deleteUserDetails(id); %>
<%response.sendRedirect("show.jsp"); %>
</body>
</html>