package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DepartmentDetailsDao;
import Pojo.DepartmentDetails;
import Pojo.EmployeeDetails;


@WebServlet("/EmployeeManagementSystem/insertDepartmentdetails")
public class insertDepartmentdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DepartmentDetails obj=new DepartmentDetails();
		obj.setDepartmentName(request.getParameter("edepartment"));
		DepartmentDetailsDao obj1=new DepartmentDetailsDao();
		obj1.insertDepartmentDetails(obj);
		request.getRequestDispatcher("ListDepartmentDetails.jsp").forward(request,response);
		//response.sendRedirect("ListDepartmentDetails.jsp");
	}

}