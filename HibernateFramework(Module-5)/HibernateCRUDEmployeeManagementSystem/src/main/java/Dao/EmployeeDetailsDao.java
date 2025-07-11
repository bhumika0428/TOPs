package Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Pojo.EmployeeDetails;

public class EmployeeDetailsDao {

	public static SessionFactory sf=util.Util.getSessionFactory();
	
	public static Serializable insertEmployeeDetails(EmployeeDetails emp)
	{
		Serializable status=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			status=session.save(emp);
			t.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	public static List<EmployeeDetails> getAllEmployeeDetails()
	{
		List<EmployeeDetails> list=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			list=session.createCriteria(EmployeeDetails.class).list();
			t.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return list;
	}
	public static EmployeeDetails getbyIdEmployeeDetails(int id)
	{
		EmployeeDetails employeeDetails=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			employeeDetails=(EmployeeDetails)session.get(EmployeeDetails.class, id);
			t.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return employeeDetails;
	}
	public static void updateEmployeeDetails(EmployeeDetails e)
	{ try {
		Session session=sf.openSession();
		   Transaction t=session.beginTransaction();
		   session.update(e);
		   t.commit();
		   session.close();
	} catch (Exception ex) {
		// TODO: handle exception
		System.out.println(ex);
	}
		   
	}
	public static void deleteEmployeeDetails(EmployeeDetails employeeDetails)
	{
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			session.delete(employeeDetails);
			t.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
