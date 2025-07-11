package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProjectDetailsDao;
import Pojo.ProjectDetails;

/**
 * Servlet implementation class deleteProjectDetails
 */
@WebServlet("/EmployeeManagementSystem/deleteProjectDetails")
public class deleteProjectDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteProjectDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.parseInt(request.getParameter("id"));
		ProjectDetails obj=ProjectDetailsDao.getbyIdProjectDetails(id);
		ProjectDetailsDao.deleteProjectDetails(obj);
		response.sendRedirect("ListProjectDetails.jsp");
	}

	
}
