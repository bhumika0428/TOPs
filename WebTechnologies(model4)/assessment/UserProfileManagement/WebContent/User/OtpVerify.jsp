 <%@page import="Bean.UserDetailBean"%>
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
<body>
 
  <div class="wrapper">
    <h2>OTP Verify</h2>
    
    <form action="UserDetailServlet" method="post">
    <div class="row">
   <div class="input-box col-lg-12">
     <% String email= (String)request.getAttribute("email"); %>
     <% int otp1=(Integer)request.getAttribute("otp"); %>
     
      <input type="hidden" name="email" value="<%=email %>"  required>
      <input type="hidden" name="otp_1" value="<%=otp1 %>" required>
     
    
      <label>Enter The OTP </label>  
     
      <input type="text" name="otp_2" placeholder="OTP" required>
      </div>
  	
     </div>
     
       <br>
      
       <div style="text-align: center;" >
    <button type="submit" class="btn btn-primary" value="verifyotp" name="action" >Verify</button>
     
      </div>
      <br>
     
    </form>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
    