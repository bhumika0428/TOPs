<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MessagePassingSystem </title>
    <link rel="stylesheet" href="style.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
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
<script type="text/javascript">
function check_fname(){
	var f = document.signupForm.fname.value;
	var reg = /^[A-Za-z]+$/;
	if(f.trim()==""){
		document.getElementById("errorfname").innerHTML="Please enter your First name";
	}
	else if(!reg.test(f)){
		document.getElementById("errorfname").innerHTML="Please enter only Alphabet";
		
	}else{
		document.getElementById("errorfname").innerHTML="";
	}
}

function check_lname(){
	var f = document.signupForm.lname.value;
	var reg = /^[A-Za-z]+$/;
	if(f.trim()==""){
		document.getElementById("errorlname").innerHTML="Please enter your Last name";
	}
	else if(!reg.test(f)){
		document.getElementById("errorlname").innerHTML="Please enter only Alphabet";
		
	}else{
		document.getElementById("errorlname").innerHTML="";
	}
}
function check_email(){
	var f = document.signupForm.email.value;
	var reg = /^[A-Za-z]+$/;
	if(f.trim()==""){
		document.getElementById("erroremail").innerHTML="Please enter your email";
	}
	else if(!reg.test(f)){
		document.getElementById("erroremail").innerHTML="";
		
	}else{
		document.getElementById("erroremail").innerHTML="";
	}
}
function check_contact(){
	var f = document.signupForm.moblie.value;
	var reg = /^[0-9]{10}$/;
	if(f.trim()==""){
		document.getElementById("errorcontact").innerHTML="Please enter your contact";
	}
	else if(!reg.test(f)){
		document.getElementById("errorcontact").innerHTML="Please Enter the 10 digit number";
		
	}else{
		document.getElementById("errorcontact").innerHTML="";
	}
}
function validateGender() {
    var genderSelected = document.querySelector('input[name="gender"]:checked');
    var errorElement = document.getElementById("errorGender");

    // Clear previous error message
    errorElement.innerHTML = "";

    // Check if a gender radio button is selected
    if (!genderSelected) {
        errorElement.innerHTML = "Please select a gender.";
        return false; // Validation failed
    }
    
    return true; // Validation passed
}
function check_np(){
	var f = document.signupForm.np.value;
	
	if(f.trim()==""){
		document.getElementById("errorpwd").innerHTML="Please enter your password";
	}
	else{
		document.getElementById("errorpwds").innerHTML="";
	}
}

function validatePassword() {
    var password = document.getElementById('np').value;
    var confirmPassword = document.getElementsByName('ncp')[0].value;
    var errorElement = document.getElementById('errorPassword');

    
    errorElement.innerHTML = "";
	if(confirmPassword.trim()=="")
	{
		errorPassword.innerHTML="Please enter your Confirm password";
		
	}else if (password !== confirmPassword) {
        errorElement.innerHTML = "Passwords do not match.";
        return false; 
    }else
        {
    	errorElement.innerHTML="";
        }
    
    return true; 
}

function validateForm() {
    var isValid = true;

    check_fname();
    check_lname();
    check_email();
    check_contact();
   
    if (!validateGender()) {
        isValid = false;
    }
    check_np();
    validatePassword();
    return isValid; 
}

</script>	 
<body>
<script>  
var request=new XMLHttpRequest();  
function searchInfo()
{  
	var name=document.signupForm.email.value;  
	var url="EmailExitorNot.jsp?val="+name;  
  	try
  	{  
		request.onreadystatechange=function()
		{  
			if(request.readyState==4)
			{  
				var val=request.responseText;  
				document.getElementById('tops').innerHTML=val;  
			}  
		}  
		request.open("GET",url,true);  
		request.send();  
	}
  	catch(e)
  	{
  		alert("Unable to connect to server");
  	}  
}  
</script>  
  <div class="wrapper col-lg-6">
    <h2>SignUp</h2>
    
    <form action="StudentController" method="post"   name="signupForm" onsubmit="return validateForm();">
    <div class="row">
   <div class="input-box col-lg-6">
     <label> Firstname</label>   <input type="text" name="fname" placeholder="First Name" onblur="check_fname();" >
     <span id="errorfname" class="error"></span>
      </div>
  	 <div class="input-box col-lg-6">
   <label>    Lastname </label> <input type="text" name="lname" placeholder=" Last Name" onblur="check_lname();">
      <span id="errorlname" class="error"></span>
     
     </div>
     </div><br>
     <div class="row">
   
       <div class="input-box col-lg-6">
      <label>  Email </label>
      <input type="text" placeholder="Email" name="email" onblur="searchInfo()" onblur="check_email();">
      <span id="tops" class="error"></span>
       <span id="erroremail" class="error"></span>
      </div>
       <div class="input-box col-lg-6">
        <label>  Moblie </label>
        <input type="text" placeholder="Moblie" name="moblie" onblur="check_contact();">
         <span id="errorcontact" class="error"></span>
      </div>
      </div><br><br>
      <label>Gender</label>
     <div class="row">
       
       <div class="col">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" id="gridRadios1" value="male"  onblur="validateGender();">
          <label class="form-check-label" for="gridRadios1">
           Male
          </label>
          </div>
        <div class="form-check">
       
           <input class="form-check-input" type="radio" name="gender" id="gridRadios2" value="female"  onblur="validateGender();">
          <label class="form-check-label" for="gridRadios2">
            Female
          </label>
       </div>
        <span id="errorGender" style="color: red;"></span>
   
        </div>
        
       </div> 
       <div class="row">
   
      <div class="input-box col-lg-6">
     	<label>New password</label>
        <input type="password" id="np" name="np" placeholder="New password" onblur="check_np();">
        <span id="errorpwd" class="error"></span>
      </div>
      <div class="input-box col-lg-6">
      <label>Confirm password</label>
        <input type="password" name="ncp" placeholder="Confirm password"  onblur="validatePassword();">
         <span id="errorPassword" class="error"></span>
   
      </div>
     </div>
     <br>
      
      <br>
      
       <div style="text-align: center;" >
    <!-- <button type="submit" class="btn btn-primary"  >SingUp</button>
     --> 
     <input type="submit"  class="btn btn-primary"  value="register" name="action"/>
			
      </div>
      <br>
      <div class="text">
        <h3>Already have an account? <a href="singin.jsp">SingIn</a></h3>
      </div>
    </form>
  </div>
  <script type="text/javascript">
  /* $(document).ready(function(){
      $("#submitform").click(function(){
	       var form = $("#signupForm");
	       var email=$("#email");
	       console.log(email);
          form.validate();
           
          if (form.valid() || email.valid()) {
          	return true;
            
          } else {
             
             return false;
          } 
      });
  });  */
<!--    $("#signupForm").validate({

	         rules: {
	        	 fname: "required",
	        	 lname: "required",
	        	 email: {
	                 required: true,
	                 email: true 
	             },
	            moblie: {
	                required: true,
	                maxlength: 10
	            },
	            gender:{
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
	        	fname: " Please enter your firstname",
	        	lname: " Please enter your lastname",
	        	email: {
	                required: "Please enter an email",
	                email: "Please enter a valid email address"
	            }, 
	            moblie: {
		                required: " Please enter a Mobile",
		                maxlength:"Please Enter the 10 digit number"
		               },
		         gender: {
			                required: " Please enter a Gender",
			               },
			               np: {
	                required: " Please enter a password",
	                minlength:
	                    " Your password must be consist of at least 5 characters"
	            },
	            ncp: {
	                required: " Please enter a password",
	                minlength:
	                    " Your password must be consist of at least 5 characters",
	                equalTo: " Please enter the same password as above"
	            }
	        }
	    }); 
	 
   $('#email').change(function()
			{
			
				 var email = $(this).val();
		         console.log(email);
		         $.ajax(
		          {
		             url:'EmailExitorNot.jsp?val="+name', 
		             method: 'GET',
		             data : {
		            	 email : email
						},
		             success: function(response) {
		                 console.log("Server response: " + response);

		                 if (response == 'true') {
		                     $("#emailError").html("Email already exists");
		                 } else {
		                     $("#emailError").html("");
		                 }
		             },
		             error: function() {
		                 $("#emailError").html("An error occurred while validating the email");
		             }		         });
		     }); -->
  </script>
  
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
    