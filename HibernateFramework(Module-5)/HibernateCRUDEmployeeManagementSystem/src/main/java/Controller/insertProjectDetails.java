package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDetailsDao;
import Dao.ProjectDetailsDao;
import Pojo.EmployeeDetails;
import Pojo.ProjectDetails;

/**
 * Servlet implementation class insertProjectDetails
 */
@WebServlet("/EmployeeManagementSystem/insertProjectDetails")
public class insertProjectDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public insertProjectDetails() {
        super();
         }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("ename"));
		System.out.println(id);
		EmployeeDetails eid=EmployeeDetailsDao.getbyIdEmployeeDetails(id);
		System.out.println(eid);
		
		  List<EmployeeDetails> employeeList = new ArrayList<>();
		  employeeList.add(eid);
		 System.out.println(employeeList);
		
		String  pname=request.getParameter("pName");
		String  pdetais=request.getParameter("pdetails");
		String  pstatus=request.getParameter("eStatus");
		String planguage=request.getParameter("pLanguage");
		String  pstart=request.getParameter("start");
		String  pend=request.getParameter("end");
		
		
		ProjectDetails obj=new ProjectDetails();
		obj.setEmployeeDetails(employeeList);
		
		obj.setProjectName(pname);
		obj.setProjectDetails(pdetais);
		obj.setProjectLanguage(planguage);
		obj.setProjectStatus(pstatus);
		obj.setStartDate(pstart);
		obj.setEndDate(pend);
		
		System.out.println(obj);
		
		ProjectDetailsDao obj1=new ProjectDetailsDao();
		obj1.insertProjectDetails(obj);
		
		
		response.sendRedirect("ListProjectDetails.jsp");
	}

}
