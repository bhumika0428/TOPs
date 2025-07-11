package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DepartmentInfoDao;
import Dao.EmployeeInfoDao;
import Pojo.departmentinfomatation;
import Pojo.employeeinfomatation;

/**
 * Servlet implementation class insertEmployeeInfoServlet
 */
@WebServlet("/jsp/insertEmployeeInfoServlet")
public class insertEmployeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public insertEmployeeInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("ename");
		String email=request.getParameter("email");
		String moblie=request.getParameter("emoblie");
		String salary=request.getParameter("esalary");
		int id=Integer.parseInt(request.getParameter("edepartment"));
		departmentinfomatation did= DepartmentInfoDao.getByIdDepartmentinfomatation(id);
		
		employeeinfomatation obj=new employeeinfomatation();
		obj.setEmployeeName(name);
		obj.setEmail(email);
		obj.setMoblie(moblie);
		obj.setSalary(salary);
		obj.setDepartmentInfo(did);
		
		EmployeeInfoDao obj1=new EmployeeInfoDao();
		obj1.insertEmployeeinfo(obj);
		
		response.sendRedirect("ListEmployeeInfo.jsp");
		
		
	}

}
