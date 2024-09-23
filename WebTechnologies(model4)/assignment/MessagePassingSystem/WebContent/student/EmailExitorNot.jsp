<%@ page import="java.sql.*" %>
<%@page import="Util.util"  %>
<%
String name=request.getParameter("val");
if(name==null||name.trim().equals(""))
{  
	out.print("<p>Please enter Email!</p>");  
}else
{
	try
	{
		Connection con=util.getConnection();
		String sql="select * from student where email= ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			out.println("<p>Email Id Already Used</p>");
		}
		con.close();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
%>