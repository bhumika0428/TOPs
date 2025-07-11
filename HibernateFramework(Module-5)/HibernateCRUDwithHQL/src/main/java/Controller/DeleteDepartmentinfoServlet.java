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
 * Servlet implementation class DeleteDepartmentinfoServlet
 */
@WebServlet("/jsp/DeleteDepartmentinfoServlet")
public class DeleteDepartmentinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteDepartmentinfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		departmentinfomatation dobj=DepartmentInfoDao.getByIdDepartmentinfomatation(id);
		DepartmentInfoDao.delete(dobj);
		response.sendRedirect("ListDepartmentInfo.jsp");
	
	}

	

}
