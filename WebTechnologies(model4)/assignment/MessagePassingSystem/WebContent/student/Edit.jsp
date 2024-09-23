<%@page import="Dao.StudentDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com-->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MessagePassingSystem </title>
    <!-- <link rel="stylesheet" href="style.css">
    -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   </head>
<body>

<%@include file="header.jsp" %>
 
<div style="background-color: lightblue ; text-align: center; t">
 
 
 <h4>Student Details </h4>
 
 </div>


<%int id=Integer.parseInt(request.getParameter("id"));%>
 <%StudentBean s= StudentDao.getByStudentId(id); %>         

<form action="StudentController" method="post">
<div class="container">
    <div class="row">
   <div class="form-group col-lg-6">
   <input type="hidden" value="<%=s.getStudentid()%>" name="sid">
     <label> Firstname</label>   <input type="text" class=" form-control"  name="fname" value="<%=s.getFirstname() %>" required>
      </div>
     
  	 <div class="form-group col-lg-6">
   <label>    Lastname </label> <input type="text" class=" form-control" name="lname" value="<%=s.getLastname() %>" required>
      
     </div>
     </div>
     <div class="row">
   
       <div class="form-group col-lg-6 ">
      <label>  Email </label>
      <input type="text" class=" form-control" value="<%=s.getEmail() %>" name="email" required>
      </div>
      
   
       <div class="form-group col-lg-6">
        <label>  Moblie </label>
        <input type="text" class=" form-control" value="<%=s.getMobile() %>" name="moblie" required>
      </div>
      </div><br>
      <label>Gender</label>
       
       <div class="form-group ">
        <c:set var="x" value="<%=s.getGender() %>" />
       <c:choose>
      <c:when test="${x == 'male'}"> 
        <div class="form-check">
       
          <input class="form-check-input" type="radio" name="gender" id="gridRadios1" value="male"  checked="checked">
          <label class="form-check-label" for="gridRadios1">
           Male
          </label>
          </div>
          <div class="form-check">
       
           <input class="form-check-input" type="radio" name="gender" id="gridRadios2" value="female">
          <label class="form-check-label" for="gridRadios2">
            Female
          </label>
       </div>
       </c:when>
  
   <c:otherwise> 
   <div class="form-check">
       
          <input class="form-check-input" type="radio" name="gender" id="gridRadios1" value="male"  >
          <label class="form-check-label" for="gridRadios1">
           Male
          </label>
          </div>
          <div class="form-check">
       
           <input class="form-check-input" type="radio" name="gender" id="gridRadios2" value="female" checked="checked">
          <label class="form-check-label" for="gridRadios2">
            Female
          </label>
       </div>
    </c:otherwise>
    </c:choose>
        </div>
       </div> 
         
      
      
      
       <div style="text-align: center;" >
    <button type="submit" class="btn btn-primary" value="update" name="action" >Update</button>
     
      </div>
     
     </div>
    </form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
    