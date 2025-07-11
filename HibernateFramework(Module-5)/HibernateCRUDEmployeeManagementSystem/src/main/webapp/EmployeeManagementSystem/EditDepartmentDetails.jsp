<%@page import="org.hibernate.mapping.DependantValue"%>
<%@page import="Pojo.DepartmentDetails"%>
<%@page import="Dao.DepartmentDetailsDao"%>
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
<br>
<% int id=Integer.parseInt(request.getParameter("id"));
DepartmentDetails d=DepartmentDetailsDao.getbyIdDepartmentDetails(id);
session.setAttribute("dep", d);
%>
<div>
<form action="editDepartmentdetails" method="post">
<div style="text-align: center;" class="container-fluid" >
<h2>Department Details</h2>	
<br><br>

<div class="row " >
<div class="col"></div>
	<div class="col-lg-4  col-sm-12" style="text-align: center;">
	<input type="text" name="id"  value="<%=d.getDepartmentId()%>"><br>
	<label class="form-label">Department Name</label>
		<select class="form-control" class="btn btn-light btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" name="edepartment">
			<option><%=d.getDepartmentName()%></option>
			<option>Select Option</option>
			<option  value="Java">Java</option>
			<option value=".net">.net</option>
		<option value="python">python</option>
		<option value="react">react</option>
		
		</select>
		
	</div>
	<div class="col"></div>
	</div><br>
	<div >
		<button class="btn btn-success">Update</button>
	</div>
</div>
</form>
</div>
<!-- <footer class="footer"><h4>Footer</h4></footer> -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>