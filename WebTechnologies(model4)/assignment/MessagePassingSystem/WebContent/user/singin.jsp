<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com-->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MessagePassingSystem </title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   </head>
   
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!--validation Link  -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/additional-methods.min.js"></script> 
	 </head>
	 
	 <style type="text/css">
.error {
	color: red;
}
</style>
<body>
 
  <div class="wrapper">
    <h2>SignIn</h2>
     <%String msg = (String)request.getAttribute("msg"); %>
				<%if(msg!=null){ %>
					<h3 style="color: red;"><%out.print(msg ); %></h3>
				<%} %>
    <form action="UserController" id="signinForm" method="post">
    <div class="row">
   <div class="input-box col-lg-12">
     <label>Email </label>  
      <input type="text" name="email" placeholder=" User Name" >
      </div>
  	
     </div><br>
     
      <div class="row">
   
      <div class="input-box col-lg-12 ">
     	<label> password</label>
        <input type="password" name="password" placeholder=" password" >
      </div>
     
     
     
      </div><br><br>
      
       <div style="text-align: center;" >
    <button type="submit" class="btn btn-primary" name="action" value="login"  >SingIn</button>
     
      </div>
      <br>
      <div class="text">
        <h3>Don't have an account? <a href="signup.jsp">SingUp</a></h3>
      </div>
    </form>
  </div>
  
  
  <script type="text/javascript">
   $("#signinForm").validate({
	
	         rules: {
	        	email: {
	                required: true,
	             },
	           
		         password: {
	                required: true,
	                minlength: 5
	            },
	           
	        },
	        messages: {
	        	email: {
	                required: " Please enter a Email",
	               },
	               password: {
	                required: " Please enter a password",
	                minlength:
	                    " Your password must be consist of at least 5 characters"
	            }
	        }
	    });
	

  </script>
  
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
    