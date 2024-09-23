<%@page import="Bean.UserBean"%>
<%
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
<%
UserBean userBean = null;
if(session.getAttribute("data")!=null){
	userBean = (UserBean)session.getAttribute("data");
	
}
else{
	response.sendRedirect("SignIn.jsp");
}

%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">MessagePassingSystem</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="ProfileEdit.jsp">Profile</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="Message.jsp">Massage</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logout.jsp">Logout</a>
      </li>
     
      
    </ul>
     
    
  </div>
   <h1 style="text-align: right;">User </h1>
</nav>
 