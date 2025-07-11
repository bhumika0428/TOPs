package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DepartmentInfoDao;

import Pojo.departmentinfomatation;

/**
 * Servlet implementation class insertDepartmentInfoServlet
 */
@WebServlet("/jsp/insertDepartmentInfoServlet")
public class insertDepartmentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertDepartmentInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("edepartment");
		
		departmentinfomatation obj=new departmentinfomatation();
		obj.setDepartmentName(name);
		
		
		DepartmentInfoDao obj1=new DepartmentInfoDao();
		obj1.insertDepartmentInfo(obj);
		
		
		response.sendRedirect("ListDepartmentInfo.jsp");
		
		
		
	}

}
