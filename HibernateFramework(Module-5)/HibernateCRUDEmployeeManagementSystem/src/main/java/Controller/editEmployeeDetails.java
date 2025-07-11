package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DepartmentDetailsDao;
import Dao.EmployeeDetailsDao;
import Pojo.DepartmentDetails;
import Pojo.EmployeeDetails;

/**
 * Servlet implementation class editEmployeeDetails
 */
@WebServlet("/EmployeeManagementSystem/editEmployeeDetails")
public class editEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public editEmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		EmployeeDetails obj=(EmployeeDetails)session.getAttribute("update");
		
		String name=request.getParameter("ename");
		String email=request.getParameter("email");
		Long phone=Long.parseLong(request.getParameter("emoblie"));
		String gender=request.getParameter("egender");
		String salary=request.getParameter("esalary");
		int did=Integer.parseInt(request.getParameter("edepartment"));
		DepartmentDetails dobj=DepartmentDetailsDao.getbyIdDepartmentDetails(did);
		
		
		obj.setEmployeeName(name);
		obj.setEmail(email);
		obj.setPhone(phone);
		obj.setSalary(salary);
		obj.setGender(gender);
		obj.setDepartmentDetails(dobj);
		
		
		EmployeeDetailsDao.updateEmployeeDetails(obj);
		response.sendRedirect("ListEmployeeDetails.jsp");
		
		
		
	}

}
