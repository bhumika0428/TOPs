package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeInfoDao;

import Pojo.employeeinfomatation;

/**
 * Servlet implementation class deleteEmployeeInfoServlet
 */
@WebServlet("/jsp/deleteEmployeeInfoServlet")
public class deleteEmployeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteEmployeeInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
	employeeinfomatation obj=EmployeeInfoDao.getbyIdemEmployeeinfomatation(id);
		EmployeeInfoDao.deleteEmployeeinfomatation(obj);
		response.sendRedirect("ListEmployeeInfo.jsp");
		
	}

}
