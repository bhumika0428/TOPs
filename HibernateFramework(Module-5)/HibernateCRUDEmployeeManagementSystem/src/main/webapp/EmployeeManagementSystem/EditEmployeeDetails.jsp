<%@page import="Dao.DepartmentDetailsDao"%>
<%@page import="Pojo.DepartmentDetails"%>
<%@page import="java.util.List"%>
<%@page import="Dao.EmployeeDetailsDao"%>
<%@page import="Pojo.EmployeeDetails"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeManagementSystem</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}

.footer {
  background-color: black;
  color: white;
  display: flex;
  justify-content: center;
  flex-shrink: 0;
  padding: 5px
}
</style>
</head>
<body>
<%@ include file="header.jsp" %> 
<% List<DepartmentDetails> list=DepartmentDetailsDao.getAllDepartmentDetails();
request.setAttribute("list", list);
%>
<% 
 int eid= Integer.parseInt(request.getParameter("id"));
EmployeeDetails eobj=EmployeeDetailsDao.getbyIdEmployeeDetails(eid);
session.setAttribute("update", eobj);
%>

<div style="text-align: center;">
<h5>Employee Details</h5>
	<form action="editEmployeeDetails" method="post">
<div class="row">
    <div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Employee Name</label>
		<input class="form-control" type="text" name="ename" value="<%=eobj.getEmployeeName()%>">
	</div>
	</div>
	<div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Email</label>
		<input class="form-control" type="text" name="email" value="<%=eobj.getEmail()%>">
	</div>
	</div>
	<div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> phone</label>
		<input class="form-control" type="text" name="emoblie" value="<%=eobj.getPhone()%>">
	</div>
	</div>
	</div> 
	<div class="row">
    <div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Salary</label>
		<input class="form-control"  type="text" name="esalary" value="<%=eobj.getSalary()%>">
	</div><br>
	</div>
	<div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Gender</label><br>
		<c:set var="x" value="<%=eobj.getGender() %>">
		</c:set>
		<c:choose>
		<c:when test="${x=='male'}">
		<input type="radio" name="egender"  value="male"  checked="checked" >Male
		<input type="radio" name="egender"  value="female" >Female
		
		</c:when>
		<c:otherwise>
		<input type="radio" name="egender"  value="male"   >Male
		<input type="radio" name="egender"  value="female" checked="checked" >Female
		
		</c:otherwise>
		</c:choose>
		
	</div>
	</div>
	<div class="col mb-2">
	<div>
		<label class="form-label">Department Details</label><br>
		<select  name="edepartment" class="form-control">
		<option value="<%=eobj.getDepartmentDetails().getDepartmentId() %>"><%=eobj.getDepartmentDetails().getDepartmentName() %></option>
		<option>Select Option</option>
		<c:forEach items="${list }" var="x">
			<option value="${x.getDepartmentId() }">${x.getDepartmentName() }</option>
		</c:forEach>
		</select>
		
	</div>
	
	</div>
	</div>
	<div >
		<button class="btn btn-success" class="form-control">Update</button>
	</div>
	</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>