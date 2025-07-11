package Controller;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DepartmentDetailsDao;
import Dao.EmployeeDetailsDao;
import Pojo.DepartmentDetails;
import Pojo.EmployeeDetails;

/**
 * Servlet implementation class insertEmployeeDetails
 */
@WebServlet("/EmployeeManagementSystem/insertEmployeeDetails")
public class insertEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public insertEmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("ename");
		String email=request.getParameter("email");
		Long phone=Long.parseLong(request.getParameter("edepartment"));
		String gender=request.getParameter("egender");
		String salary=request.getParameter("esalary");
		int did=Integer.parseInt(request.getParameter("edepartment"));
		DepartmentDetails dobj=DepartmentDetailsDao.getbyIdDepartmentDetails(did);
		
		
		EmployeeDetails obj=new EmployeeDetails();
		
		obj.setEmployeeName(name);
		obj.setEmail(email);
		obj.setPhone(phone);
		obj.setGender(gender);
		obj.setSalary(salary);
		obj.setDepartmentDetails(dobj);
		
		EmployeeDetailsDao save=new EmployeeDetailsDao();
		save.insertEmployeeDetails(obj);
		
		response.sendRedirect("ListEmployeeDetails.jsp");
		
		
		
	}

}
