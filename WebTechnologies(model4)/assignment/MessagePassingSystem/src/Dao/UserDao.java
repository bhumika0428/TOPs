package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Bean.UserBean;
import Util.util;

public class UserDao {

	public static int insertUser(UserBean userBean)
	{
		int status=0;
		try {
			Connection con=util.getConnection();
			String sql="insert into user (firstname,lastname,email,mobile,password) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userBean.getFirstname());
			ps.setString(2, userBean.getLastname());
			ps.setString(3, userBean.getEmail());
			ps.setString(4, userBean.getMobile());
			ps.setString(5, userBean.getPassword());
			
			ps.executeUpdate();
			System.out.println("add");
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
			String sql="select * from user where email= ?";
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
	public static UserBean login(UserBean u)
	{
		UserBean userBean=null;
		try {
			Connection con=util.getConnection();
			String sql="select * from user where email=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{ 
				
				userBean=new UserBean();
				userBean.setUserId(rs.getInt("userid"));
				userBean.setFirstname(rs.getString("firstname"));
				userBean.setLastname(rs.getString("lastname"));
				userBean.setEmail(rs.getString("email"));
				userBean.setMobile(rs.getString("mobile"));
				userBean.setPassword(rs.getString("password"));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return userBean;
	}
	public static void updateUser(UserBean u)
	{
		try
		{
			Connection con=util.getConnection();
			String sql="update user set firstname=?,lastname=?,email=?,mobile=? where userid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, u.getFirstname());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getMobile());
			ps.setInt(5, u.getUserId());
			
			ps.executeUpdate();
			System.out.println("data is update");
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}
