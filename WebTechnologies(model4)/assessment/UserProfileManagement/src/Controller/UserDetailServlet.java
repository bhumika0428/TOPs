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


import Bean.UserDetailBean;
import Dao.UserDetailsDao;
import Services.EmailServices;

/**
 * Servlet implementation class UserDetailServlet
 */
@WebServlet("/User/UserDetailServlet")
public class UserDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		/*
		 * if ("added".equals(action)) { handleSignup(request, response); } else if
		 * ("verifyOtp".equals(action)) { handleOtpVerification(request, response); }
		 */
		if(action.equalsIgnoreCase("added"))
		{
			try {
				String fname=request.getParameter("fname");
				String lname=request.getParameter("lname");
				String email=request.getParameter("email");
				String mobile=request.getParameter("moblie");
				String gender=request.getParameter("gender");
				String address=request.getParameter("address");
				String pwd=request.getParameter("np");
				String estatus=request.getParameter("status");
				
			
				
				
				
				UserDetailBean userDetailBean=new UserDetailBean();
				userDetailBean.setFirstname(fname);
				userDetailBean.setLastname(lname);
				userDetailBean.setEmail(email);
				userDetailBean.setMobile(mobile);
				userDetailBean.setGender(gender);
				userDetailBean.setAddress(address);
				userDetailBean.setPassword(pwd);
				userDetailBean.setStatus(estatus);
				
				Serializable status=UserDetailsDao.insertUser(userDetailBean);
				if(status!= null)
				{
					response.sendRedirect("EmailVerify.jsp");
				}else
				{
					response.sendRedirect("signup.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(action.equalsIgnoreCase("verifyemail"))
		{
			
			String email=request.getParameter("email");
			boolean flag=UserDetailsDao.checkEmail(email);
			if(flag == true)
			{
				Random random=new Random();
				int num=random.nextInt(9999);
				EmailServices emailServices=new EmailServices();
				emailServices.sendmail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				
				System.out.println("done");
				request.getRequestDispatcher("OtpVerify.jsp").forward(request, response);
			}else
			{
				
				request.getRequestDispatcher("EmailVerify.jsp").forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("verifyotp"))
		{
			System.out.println("hello");
			String email=request.getParameter("email");
			
			int otp1=Integer.parseInt(request.getParameter("otp_1"));
			int otp2=Integer.parseInt(request.getParameter("otp_2"));
		    
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				
					UserDetailsDao.updatestatus(email);
				  request.getRequestDispatcher("singin.jsp").forward(request, response); 
				  } else
				  {
				 
				
				request.getRequestDispatcher("EmailVerify.jsp").forward(request, response);
				
			}
			
		}
		else if(action.equalsIgnoreCase("login"))
		{
			System.out.println("hello");
			UserDetailBean userDetailBean=new UserDetailBean();
			userDetailBean.setEmail(request.getParameter("email"));
			userDetailBean.setPassword(request.getParameter("password"));
			String email=request.getParameter("email");
			boolean flag=UserDetailsDao.checkEmail(email);
			
			if(flag == true)
			{
			    UserDetailBean userDetailBean1=UserDetailsDao.login(userDetailBean);
			    if(userDetailBean1 == null)
			    {
			    	
			    	request.setAttribute("msg", "password is incorrect");
			    	request.getRequestDispatcher("singin.jsp").forward(request, response);
					
			    }else
			    {
			    	
					HttpSession session=request.getSession();
			    	session.setAttribute("data", userDetailBean1);
			    	request.getRequestDispatcher("index.jsp").forward(request, response);
			   }
			}else
			{
				request.setAttribute("msg", "password is incorrect ");
				request.getRequestDispatcher("singin.jsp").forward(request, response);
			}

			
		}else if(action.equalsIgnoreCase("changepwd"))
		{
			//System.out.println("hello");
			int id=Integer.parseInt(request.getParameter("cid"));
			String old=request.getParameter("old");
			String np=request.getParameter("np");
			String ncp=request.getParameter("ncp");
			
			boolean flag=UserDetailsDao.checkPassword(old);
			if(flag == true)
			{
				if(np.equals(ncp))
				{
					
					UserDetailsDao.updatePassword(np, id);
					response.sendRedirect("index.jsp");
					
				}else
				{
					request.setAttribute("msg", "new password and confim password not match");
					request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
				}
			}else
			{
				request.setAttribute("msg", "old password is incorrect");
				request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
				
			}
		}else if(action.equalsIgnoreCase("fpwd"))
		{
			System.out.println("hello");
			String email=request.getParameter("email");
			boolean flag=UserDetailsDao.checkEmail(email);
			if(flag == true)
			{
				Random random=new Random();
				int num=random.nextInt(9999);
				EmailServices emailServices=new EmailServices();
				emailServices.sendmail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				
				request.getRequestDispatcher("fpwd_otpverity.jsp").forward(request, response);
			}else
			{
				request.setAttribute("msg", "coludn't find account");
				request.getRequestDispatcher("ForgetPassword.jsp").forward(request, response);
			}
		}else if(action.equalsIgnoreCase("verify"))
		{
			System.out.println("hello");
			String email=request.getParameter("email");
			int otp1=Integer.parseInt(request.getParameter("otp_1"));
			int otp2=Integer.parseInt(request.getParameter("otp_2"));
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("NewPassword.jsp").forward(request, response);
			}else
			{
				request.setAttribute("msg", "OTP is not matched");
				request.setAttribute("otp1", otp1);
				request.getRequestDispatcher("ForgetPassword.jsp").forward(request, response);
				
				
			}
			
		}else if(action.equalsIgnoreCase("update"))
		{
			String email=request.getParameter("email");
			String np=request.getParameter("np");
			String cnf=request.getParameter("ncp");
			
			if(np.equals(cnf))
			{
				
				UserDetailsDao.updateNewPWD(email, np);
				request.getRequestDispatcher("singin.jsp").forward(request, response);
			}else
			{
				request.setAttribute("msg", "np and cnp not same");
				request.setAttribute("email", email);
				request.getRequestDispatcher("NewPassword.jsp").forward(request, response);
				
			}
		}
		
		
	}

}
