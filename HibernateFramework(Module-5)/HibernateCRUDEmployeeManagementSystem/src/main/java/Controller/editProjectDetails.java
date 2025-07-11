package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.EmployeeDetailsDao;
import Dao.ProjectDetailsDao;
import Pojo.EmployeeDetails;
import Pojo.ProjectDetails;

/**
 * Servlet implementation class editProjectDetails
 */
@WebServlet("/EmployeeManagementSystem/editProjectDetails")
public class editProjectDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public editProjectDetails() {
        super();
        }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		ProjectDetails obj=(ProjectDetails)session.getAttribute("update");
		
		/*
		 * int id=Integer.parseInt(request.getParameter("ename")); EmployeeDetails
		 * eobj=EmployeeDetailsDao.getbyIdEmployeeDetails(id);
		 */	
		String pname=request.getParameter("pName");
		String pdetails=request.getParameter("pdetails");
		String plangauge=request.getParameter("pLanguage");
		String status=request.getParameter("eStatus");
		String start=request.getParameter("start");
		String end=request.getParameter("end");
		
		obj.setProjectName(pname);
		obj.setProjectDetails(pdetails);
		obj.setProjectLanguage(plangauge);
		obj.setProjectStatus(status);
		obj.setStartDate(start);
		obj.setEndDate(end);
		
		ProjectDetailsDao.updateProjectDetails(obj);
		response.sendRedirect("ListProjectDetails.jsp");
		
	}

}
