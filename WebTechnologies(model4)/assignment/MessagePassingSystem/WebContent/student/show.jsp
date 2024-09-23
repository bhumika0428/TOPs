<%@page import="Dao.StudentDao"%>
<%@page import="Bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MessagePassingSystem</title>
 
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

   
</head>
<body>
<%@ include file="header.jsp" %>
 <div style="background-color: lightblue ; text-align: center; t">
 
 <h4>Student Details </h4>
 
 </div>
 
<% List<StudentBean> list = StudentDao.getAllStudentDetails(); %>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Firstname</th>
      <th scope="col">Lastname</th>
      <th scope="col">Email</th>
       <th scope="col">Gender</th>
       <th scope="col">Moblie</th>
        <th scope="col">Action</th>
      
    </tr>
  </thead>
  
  <tbody>
 <%-- <c:forEach var="x" items="${requestScope.list}">
  --%>
   <% for(StudentBean s:list){ %>
    <tr>
  
   
      <th scope="row"><c:out value="<%=s.getStudentid() %>"></c:out> </th>
      <td><%=s.getFirstname() %></td>
      <td><%=s.getLastname() %></td>
      <td><%=s.getEmail() %></td>
      <td><%=s.getGender() %></td>
      <td><%=s.getMobile()%></td>
      <td>
      <a class="btn btn-warning" href="Edit.jsp?id=<%=s.getStudentid()%>">EDIT </a>
      <a class="btn  btn-danger" href="delete.jsp?id=<%=s.getStudentid()%>">DELETE</a>
      </td>
      
    </tr>
   <%-- </c:forEach> 
      --%>
      <%} %>
  </tbody>
</table>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>