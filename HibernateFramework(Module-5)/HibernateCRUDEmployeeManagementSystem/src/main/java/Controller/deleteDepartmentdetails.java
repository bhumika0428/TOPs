package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DepartmentDetailsDao;
import Pojo.DepartmentDetails;

/**
 * Servlet implementation class deleteDepartmentdetails
 */
@WebServlet("/EmployeeManagementSystem/deleteDepartmentdetails")
public class deleteDepartmentdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteDepartmentdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int did=Integer.parseInt(request.getParameter("id"));
		DepartmentDetails obj=DepartmentDetailsDao.getbyIdDepartmentDetails(did);
		DepartmentDetailsDao.deleteDepartmentDetails(obj);
		response.sendRedirect("ListDepartmentDetails.jsp");
		
	}

	

}
