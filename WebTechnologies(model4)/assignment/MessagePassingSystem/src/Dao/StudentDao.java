package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Bean.StudentBean;
import Bean.UserBean;
import Util.util;

public class StudentDao {

	public static int insertStudent(StudentBean studentBean)
	{
		int status=0;
		try {
			Connection con=util.getConnection();
			String sql="insert into student (firstname,lastname,email,mobile,gender,password) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, studentBean.getFirstname());
			ps.setString(2, studentBean.getLastname());
			ps.setString(3, studentBean.getEmail());
			ps.setString(4, studentBean.getMobile());
			ps.setString(5, studentBean.getGender());
			ps.setString(6, studentBean.getPassword());
			
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
			String sql="select * from student where email= ?";
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
	public static StudentBean login(StudentBean s)
	{
		StudentBean studentBean=null;
		try {
			Connection con=util.getConnection();
			String sql="select * from student where email=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, s.getEmail());
			ps.setString(2, s.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{ 
				studentBean=new StudentBean();
				studentBean.setEmail(rs.getString("email"));
				studentBean.setPassword(rs.getString("password"));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return studentBean;
	}
	
	
	public static List<StudentBean> getAllStudentDetails()
	{
		List<StudentBean> list=new ArrayList<>();
		try {
			Connection con=util.getConnection();
			String sql="select * from student";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=(ResultSet) ps.executeQuery();
			while (rs.next()) {
				StudentBean studentBean=new StudentBean();
				studentBean.setStudentid(rs.getInt("studentid"));
				studentBean.setFirstname(rs.getString("firstname"));
				studentBean.setLastname(rs.getString("lastname"));
				studentBean.setEmail(rs.getString("email"));
				studentBean.setMobile(rs.getString("mobile"));
				studentBean.setGender(rs.getString("gender"));
				list.add(studentBean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static StudentBean getByStudentId(int id)
	{ StudentBean studentBean=null;
		try {
			Connection con=util.getConnection();
			String sql="select * from student where studentid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=(ResultSet) ps.executeQuery();
			while(rs.next())
			{
				studentBean=new StudentBean();
				studentBean.setStudentid(rs.getInt("studentid"));
				studentBean.setFirstname(rs.getString("firstname"));
				studentBean.setLastname(rs.getString("lastname"));
				studentBean.setEmail(rs.getString("email"));
				studentBean.setMobile(rs.getString("mobile"));
				studentBean.setGender(rs.getString("gender"));
				
			}
			
		} catch (Exception e) {
			
		   e.printStackTrace();
		}
		return studentBean;
	}
	public static void updateStudentDetails(StudentBean s)
	{
		try {
			Connection con=util.getConnection();
			String sql="update student set firstname=?,lastname=?,email=?,mobile=?,gender=? where studentid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getMobile());
			ps.setString(5, s.getGender());
			ps.setInt(6, s.getStudentid());
			ps.executeUpdate();
			System.out.println("Update student Details");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteUserDetails(int id )
	{
		try {
			Connection con=util.getConnection();
			String sql="delete from student where studentid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Delete Student Details");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
