<%@page import="Dao.DepartmentDetailsDao"%>
<%@page import="Pojo.DepartmentDetails"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeManagementSystem</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
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
<%
List<DepartmentDetails>list=DepartmentDetailsDao.getAllDepartmentDetails();
request.setAttribute("list",list);

%>
<div style="text-align: center;" class="col-md-8 col-lg-12 col-xxl-3" >
<h2>Employee Details</h2>
<br>
<form action="insertEmployeeDetails" method="post">
<div class="row">
    <div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Employee Name</label>
		<input class="form-control" type="text" name="ename" placeholder="Enter The Name">
	</div>
	</div>
	<div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Email</label>
		<input class="form-control" type="email" name="email" placeholder="Enter The Email">
	</div>
	</div>
	<div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> phone</label>
		<input class="form-control" type="text" name="emoblie" placeholder="Enter The Phone">
	</div>
	</div>
	</div> 
	<div class="row">
    <div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Salary</label>
		<input class="form-control"  type="text" name="esalary" placeholder="Enter The Salary">
	</div><br>
	</div>
	<div class="col mb-2">
	<div class="form-group">
		<label class="form-label"> Gender</label><br>
		<input type="radio" name="egender"  value="male"  >Male
		<input type="radio" name="egender"  value="female" >Female
		
	</div>
	</div>
	<div class="col mb-2">
	<div>
		<label class="form-label">Department Details</label><br>
		<select  name="edepartment" class="form-control">
		<option>Select Option</option>
		<c:forEach items="${list }" var="x">
			<option value="${x.getDepartmentId() }">${x.getDepartmentName() }</option>
		</c:forEach>
		</select>
		
	</div>
	
	</div>
	</div>
	<div >
		<button class="btn btn-success" class="form-control">Submit</button>
	</div>
	</form>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>