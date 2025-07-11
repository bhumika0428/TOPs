package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProfileDetailsDao;
import Pojo.ProfileDetails;

/**
 * Servlet implementation class deleteProfileDetails
 */
@WebServlet("/EmployeeManagementSystem/deleteProfileDetails")
public class deleteProfileDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteProfileDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		ProfileDetails obj=ProfileDetailsDao.getbyIdProfileDetails(id);
		ProfileDetailsDao.deleteProfileDetails(obj);
		response.sendRedirect("ListProfileDetails.jsp");
		
		}

	
}
