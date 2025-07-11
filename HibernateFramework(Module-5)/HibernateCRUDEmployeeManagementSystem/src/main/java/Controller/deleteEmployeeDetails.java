package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDetailsDao;
import Pojo.EmployeeDetails;

/**
 * Servlet implementation class deleteEmployeeDetails
 */
@WebServlet("/EmployeeManagementSystem/deleteEmployeeDetails")
public class deleteEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteEmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("id"));
	EmployeeDetails obj=EmployeeDetailsDao.getbyIdEmployeeDetails(id);
	EmployeeDetailsDao.deleteEmployeeDetails(obj);
	response.sendRedirect("ListEmployeeDetails.jsp");
	}

	

}
