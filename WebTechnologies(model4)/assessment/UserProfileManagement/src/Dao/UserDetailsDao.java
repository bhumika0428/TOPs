package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.UserDetailBean;
import Util.util;

public class UserDetailsDao {

	public static int insertUser(UserDetailBean userDetailBean)
	{
		int status =0;
		try {
			Connection con=util.getConnection();
			String sql="insert into userdetails(firstname,lastname,email,gender,mobile,address,password,status) values (?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userDetailBean.getFirstname());
			ps.setString(2, userDetailBean.getLastname());
			ps.setString(3, userDetailBean.getEmail());
			ps.setString(4, userDetailBean.getGender());
			ps.setString(5, userDetailBean.getMobile());
			ps.setString(6, userDetailBean.getAddress());
			ps.setString(7, userDetailBean.getPassword());
			ps.setString(8, userDetailBean.getStatus());
			status = ps.executeUpdate();
			System.out.println(status);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static boolean checkEmail(String email)
	{
		boolean flag=false;
		try {
			Connection con=util.getConnection();
			String sql="select * from userdetails where email= ? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static UserDetailBean login(UserDetailBean u)
	{
		UserDetailBean userDetailBean=null;
		try
		{
			Connection con=util.getConnection();
			String sql="select * from userdetails where  email=? and password=?   ";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				userDetailBean=new UserDetailBean();
				userDetailBean.setUserid(rs.getInt("userid"));
				userDetailBean.setFirstname(rs.getString("firstname"));
				userDetailBean.setLastname(rs.getString("lastname"));
				userDetailBean.setEmail(rs.getString("email"));
				userDetailBean.setPassword(rs.getString("password"));
				
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return userDetailBean;
	}
	
	public static boolean checkPassword(String pwd)
	{
		boolean flag=false;
		try {
			Connection con=util.getConnection();
			String sql="select * from userdetails where password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	  public static void updatestatus (String email)
	  { 
		  try 
		  {
			  Connection con=util.getConnection(); 
			  String sql="update userdetails set status='verify' where email=? "; 
			  PreparedStatement ps=con.prepareStatement(sql); 
			 
			  ps.setString(1,email);
	          ps.executeUpdate();
	          System.out.println("password update"); 
	       }
		  catch(SQLException e) { 
			  // TODO Auto-generated catch block
			  e.printStackTrace(); 
			 }
		  }
	  
	 
	
	public static void updatePassword(String pwd,int id)
	{
		try {
			Connection con=util.getConnection();
			String sql="update userdetails set password=? where userid=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, pwd);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("password update");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updateNewPWD(String email,String pwd)
	{
		try {
			Connection con=util.getConnection();
			String sql="update userdetails set password=? where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pwd);
			ps.executeUpdate();
			System.out.println("update");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
