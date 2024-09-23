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

import Bean.UserBean;
import Dao.UserDao;
import Services.EmailServices;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
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
				String np=request.getParameter("np");
				
				UserBean userBean=new UserBean();
				userBean.setFirstname(fname);
				userBean.setLastname(lname);
				userBean.setEmail(email);
				userBean.setMobile(moblie);
				userBean.setPassword(np);
				
			   Serializable status=UserDao.insertUser(userBean);
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
			boolean flag=UserDao.checkEmail(email);
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
			UserBean userBean=new UserBean();
			userBean.setEmail(request.getParameter("email"));
			userBean.setPassword(request.getParameter("password"));
			String email=request.getParameter("email");
			
			
			boolean flag=UserDao.checkEmail(email);
			
			if(flag == true)
			{
			    UserBean userBean2=UserDao.login(userBean);
			    if(userBean2 == null)
			    {
			    	request.setAttribute("msg", "password is incorrect");
			    	request.getRequestDispatcher("singin.jsp").forward(request, response);
			    	//request.getRequestDispatcher("EmailVerify.jsp").forward(request, response);
			    	
			    	
			    }else
			    {
			    	HttpSession session=request.getSession();
			    	session.setAttribute("data", userBean2);
			    	
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
			UserBean obj=new UserBean();
			obj.setUserId(Integer.parseInt(request.getParameter("sid")));
			obj.setFirstname(request.getParameter("firstname"));
			obj.setLastname(request.getParameter("lastname"));
			obj.setEmail(request.getParameter("email"));
			obj.setMobile(request.getParameter("mobile"));
			
			UserDao.updateUser(obj);

			HttpSession session =request.getSession();
			session.setAttribute("data", obj);
			request.getRequestDispatcher("ProfileEdit.jsp").forward(request,response);
		}
	}

	}


