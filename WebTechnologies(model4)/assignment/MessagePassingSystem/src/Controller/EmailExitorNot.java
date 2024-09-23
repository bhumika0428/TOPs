package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailExitorNot
 */
@WebServlet("/student/EmailExitorNot")
public class EmailExitorNot extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EmailExitorNot() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		  String emailid = request.getParameter("email");
			System.out.println(emailid);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("hello");
		  String emailid = request.getParameter("emailId");
		
	}

}
