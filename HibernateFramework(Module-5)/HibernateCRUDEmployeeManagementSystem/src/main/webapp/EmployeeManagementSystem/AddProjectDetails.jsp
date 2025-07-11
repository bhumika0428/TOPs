<%@page import="Dao.EmployeeDetailsDao"%>
<%@page import="Pojo.EmployeeDetails"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeManagementSystem</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

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
	<%@ include file="header.jsp"%>
	<%
	List<EmployeeDetails> list = EmployeeDetailsDao.getAllEmployeeDetails();
	request.setAttribute("list", list);
	%>
	<br>
	<div>
		<form action="insertProjectDetails" method="post">
			<div style="text-align: center;">
				<h2>Project Details</h2>
				<div class="row ">

					<div class="col-lg-4 col-sm-12" style="text-align: center;">
						<label class="form-label">Employee Name</label> <select
							class="form-control" class="btn btn-light btn-lg dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
							name="ename">
							<option>Select Option</option>

							<c:forEach items="${list}" var="x">
								<option value="${x.getEmployeeId() }">${x.getEmployeeName()}</option>
							</c:forEach>
						</select>

					</div>

					<div class="col-lg-4  col-sm-12" style="text-align: center;">
						<label class="form-label">Project Name</label> <input type="text"
							name="pName" class="form-control">

					</div>
					<div class="col-lg-4 col-sm-12" style="text-align: center;">
						<label class="form-label">ProjectDetails</label>
						<textarea class="form-control" name="pdetails"></textarea>

					</div>
				</div>
				<br>
				<div class="row ">

					<div class="col-lg-3 col-sm-12" style="text-align: center;">
						<label class="form-label">Project Language</label> <select
							class="form-control" class="btn btn-light btn-lg dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
							name="pLanguage">
							<option>Select Option</option>

							<option value="java">Java</option>

							<option value="php">php</option>
							<option value=".net">.net</option>
						</select>
					</div>

					<div class="col-lg-3  col-sm-12" style="text-align: center;">
						<label class="form-label">Project Status</label> <select
							class="form-control" class="btn btn-light btn-lg dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
							name="eStatus">
							<option>Select Option</option>

							<option value="current working">Current Working</option>

							<option value="padding">Padding</option>
							<option value="completed">Completed</option>
						</select>

					</div>
					<div class="col-lg-3 col-sm-12" style="text-align: center;">
						<label class="form-label">Start Date</label> <input
							class="form-control" type="date" name="start">

					</div>
					<div class="col-lg-3 col-sm-12" style="text-align: center;">
						<label class="form-label">End Date</label> <input
							class="form-control" type="date" name="end">

					</div>
				</div>

				<br>
				<div>
					<button class="btn btn-success">Submit</button>
				</div>
			</div>
		</form>

	</div>
	<!-- <footer class="footer"><h4>Footer</h4></footer> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>

</body>
</html>