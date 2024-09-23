<%@page import="Bean.UserDetailBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com-->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UserProfileManagement </title>
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
  <%
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
<%
UserDetailBean userDetailBean = null;
if(session.getAttribute("data")!=null){
	userDetailBean = (UserDetailBean)session.getAttribute("data");
	
}
else{
	response.sendRedirect("signin.jsp");
}

%>
  <div class="wrapper">
    <h2>ChangePassword</h2>
    <%String msg = (String)request.getAttribute("msg"); %>
				<%if(msg!=null){ %>
					<h3 style="color: red;"><%out.print(msg ); %></h3>
				<%} %>
    <form action="UserDetailServlet" id="changeform" method="post">
    <div class="row">
   <div class="input-box col-lg-12">
   <input type="hidden"  name="cid" value="<%=userDetailBean.getUserid() %>"> 
     <label>Old Password </label>   
     <input type="password"  name="old" placeholder="Old Password" >
      </div>
  	
     </div><br>
      <div class="row">
   <div class="input-box col-lg-12 ">
     	<label>New Password</label>
        <input type="password" name="np" id="np" placeholder="New Password" >
      </div>
      </div><br><br>
      <div class="row">
   <div class="input-box col-lg-12 ">
     	<label>Confirm Password</label>
        <input type="password" name="ncp" placeholder="Confirm Password" >
      </div>
      </div><br><br>
       <div style="text-align: center;" >
    <button type="submit" class="btn btn-primary" name="action" value="changepwd">Submit</button>
     
      </div>
      <br>
      
    </form>
  </div>
  
  
  <script type="text/javascript">
   $("#changeform").validate({
	
	         rules: {
	        	 old: {
	                required: true,
	             },
	           np: {
	                required: true,
	                minlength: 5
	            },
	            ncp: {
	                required: true,
	                minlength: 5,
					equalTo: "#np"
	            },
	            
	        },
	        messages: {
	        	old: {
	                required: " Please enter a old password",
	               },
	            np: {
	                required: " Please enter a password",
	               minlength:" Your password must be consist of at least 5 characters"
	            },ncp: {
	                required: " Please enter a password",
	                minlength: " Your password must be consist of at least 5 characters",
	                equalTo: " Please enter the same password as above"
	            }

	            
	        }
	    });
	

  </script>
  
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
    