package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Services.MailServices;
import Util.util;

/**
 * Servlet implementation class MeassageController
 */
@WebServlet("/user/MeassageController")
public class MeassageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MeassageController() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello");
		HttpSession session = request.getSession();
		/*
		 * String sender_email = (String) session.getAttribute("userBean");
		 */  
	
		String sender_email = request.getParameter("email");
        String recipient_email = request.getParameter("to");
        String message = request.getParameter("message");
		/*
		 * int userid=Integer.parseInt(request.getParameter("uid"));
		 */ try {
            Connection conn =  util.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO message(`from`, `to`, `message`) VALUES(?, ?, ?)");
            MailServices mailServices=new MailServices();
            mailServices.sendmassage(sender_email, recipient_email, message);
            ps.setString(1, sender_email);
            ps.setString(2, recipient_email);
            ps.setString(3, message);
          //  ps.setInt(4, userid);
            ps.executeUpdate();
            response.sendRedirect("index.jsp");
        } catch(Exception e) {
            e.printStackTrace();
            response.sendRedirect("Message.jsp");
        }

	}

}
