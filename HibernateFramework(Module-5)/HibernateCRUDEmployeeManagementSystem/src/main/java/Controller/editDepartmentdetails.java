package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DepartmentDetailsDao;
import Pojo.DepartmentDetails;

/**
 * Servlet implementation class editDepartmentdetails
 */
@WebServlet("/EmployeeManagementSystem/editDepartmentdetails")
public class editDepartmentdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public editDepartmentdetails() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession(false);
		DepartmentDetails obj=(DepartmentDetails)session.getAttribute("dep");
		
		String name=request.getParameter("edepartment");
		obj.setDepartmentName(name);
		DepartmentDetailsDao.UpdateDepartmentDetails(obj);
		response.sendRedirect("ListDepartmentDetails.jsp");
		
	}

}
