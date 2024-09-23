package Controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.StudentBean;
import Bean.UserBean;
import Dao.StudentDao;
import Dao.UserDao;
import Services.EmailServices;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/student/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentController() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			try {
				String fname=request.getParameter("fname");
				String lname=request.getParameter("lname");
				String email=request.getParameter("email");
				String moblie=request.getParameter("moblie");
				String gender=request.getParameter("gender");
				String np=request.getParameter("np");
				
				StudentBean studentBean=new StudentBean();
				studentBean.setFirstname(fname);
				studentBean.setLastname(lname);
				studentBean.setEmail(email);
				studentBean.setMobile(moblie);
				studentBean.setGender(gender);
				studentBean.setPassword(np);
				
			   Serializable status=StudentDao.insertStudent(studentBean);
			   if(status != null)
				{
						response.sendRedirect("EmailVerify.jsp");
			     }
					else {
						
						response.sendRedirect("signup.jsp");
					}
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else
		if(action.equalsIgnoreCase("verifymail"))
		{
			//System.out.println("hello");
			String email=request.getParameter("email");
			boolean flag=StudentDao.checkEmail(email);
			if(flag == true)
			{
				Random random=new Random();
				int num=random.nextInt(9999);
				EmailServices emailServices=new EmailServices();
				emailServices.sendmail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				
				request.getRequestDispatcher("OtpVerify.jsp").forward(request, response);
				
				
			}else
			{
				request.setAttribute("msg", "coludn't find account");
				
			request.getRequestDispatcher("EmailVerify.jsp").forward(request, response);	
			}
		}
		else if(action.equalsIgnoreCase("verifyotp"))
		{
			//System.out.println("hello");
			String email=request.getParameter("email");
			int otp1=Integer.parseInt(request.getParameter("otp_1"));
			int otp2=Integer.parseInt(request.getParameter("otp_2"));
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("singin.jsp").forward(request, response);
			}
			else {
				
				request.getRequestDispatcher("EmailVerify.jsp").forward(request, response);
				
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			//System.out.println("hello");
			StudentBean studentBean=new StudentBean();
			studentBean.setEmail(request.getParameter("email"));
			studentBean.setPassword(request.getParameter("password"));
			String email=request.getParameter("email");
			
			
			boolean flag=StudentDao.checkEmail(email);
			
			if(flag == true)
			{
			    StudentBean studentBean2=StudentDao.login(studentBean);
			    if(studentBean2 == null)
			    {
			    	request.setAttribute("msg", "password is incorrect");
			    	request.getRequestDispatcher("singin.jsp").forward(request, response);
					
			    }else
			    {
			    	HttpSession session=request.getSession();
			    	session.setAttribute("data", studentBean2);
			    	request.getRequestDispatcher("index.jsp").forward(request, response);
					
			    }
				
			}else
			{
				request.setAttribute("msg", "password is incorrect s");
				request.getRequestDispatcher("singin.jsp").forward(request, response);
			}
		}
	else if(action.equalsIgnoreCase("update"))
	{
	 StudentBean obj=new StudentBean();
		obj.setStudentid(Integer.parseInt(request.getParameter("sid")));
		obj.setFirstname(request.getParameter("fname"));
		obj.setLastname(request.getParameter("lname"));
		obj.setEmail(request.getParameter("email"));
		obj.setMobile(request.getParameter("moblie"));
		obj.setGender(request.getParameter("gender"));
		 
		StudentDao.updateStudentDetails(obj);

		HttpSession session =request.getSession();
		session.setAttribute("data", obj);
		request.getRequestDispatcher("show.jsp").forward(request,response);
	}
}

}
