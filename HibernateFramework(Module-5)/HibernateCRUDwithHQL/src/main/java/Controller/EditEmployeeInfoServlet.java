package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DepartmentInfoDao;
import Dao.EmployeeInfoDao;
import Pojo.departmentinfomatation;
import Pojo.employeeinfomatation;

/**
 * Servlet implementation class EditEmployeeInfoServlet
 */
@WebServlet("/jsp/EditEmployeeInfoServlet")
public class EditEmployeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EditEmployeeInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		employeeinfomatation obj=(employeeinfomatation)session.getAttribute("update");
		System.out.println(obj);
		
		String name=request.getParameter("ename");
		String email=request.getParameter("email");
		String moblie=request.getParameter("emoblie");
		String salary=request.getParameter("esalary");
		int did=Integer.parseInt(request.getParameter("edepartment"));
		departmentinfomatation dobj=DepartmentInfoDao.getByIdDepartmentinfomatation(did);
		
		obj.setEmployeeName(name);
		obj.setEmail(email);
		obj.setMoblie(moblie);
		obj.setSalary(salary);
		obj.setDepartmentInfo(dobj);
		
		
	   EmployeeInfoDao.updateEmployeeinfomatation(obj);
	   response.sendRedirect("ListEmployeeInfo.jsp");
		
	}

}
