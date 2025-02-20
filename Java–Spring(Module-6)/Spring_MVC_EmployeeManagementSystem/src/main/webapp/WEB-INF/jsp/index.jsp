
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  
</head>
<body>
<h1>Register</h1>
<div class="wapper">
<form action="register" method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Name </label> <input
				type="text" name="name" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Contact </label> <input
				type="text" name="mobile" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Address </label> <input
				type="text" name="address" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Email
				address</label> <input type="email" name="email" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" name="password" class="form-control"
				id="exampleInputPassword1">
		</div>
		<button type="submit" class="btn btn-primary">Register</button>
	</form>
	</div>
	
	<div class="text-center">
	<h5><a  href="list">EmployeeList</a></h5>
	</div>
</body>
</html>