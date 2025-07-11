package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DepartmentInfoDao;
import Pojo.departmentinfomatation;

/**
 * Servlet implementation class EditDepartmentinfoServlet
 */
@WebServlet("/jsp/EditDepartmentinfoServlet")
public class EditDepartmentinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EditDepartmentinfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		departmentinfomatation obj=(departmentinfomatation)session.getAttribute("update");
		
		String name=request.getParameter("edepartment");
		
		
		obj.setDepartmentName(name);
		
		DepartmentInfoDao.update(obj);
		response.sendRedirect("ListDepartmentInfo.jsp");
		
	}

}
