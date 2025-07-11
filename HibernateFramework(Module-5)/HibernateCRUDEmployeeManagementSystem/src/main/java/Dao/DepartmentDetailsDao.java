package Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Pojo.DepartmentDetails;


public class DepartmentDetailsDao {
	
	public static SessionFactory sf = util.Util.getSessionFactory();

	public Serializable insertDepartmentDetails(DepartmentDetails d)
	{
		Serializable status=null;
		try {
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			s.save(d);
			tx.commit();
			s.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static List<DepartmentDetails> getAllDepartmentDetails()
	{
		List<DepartmentDetails>  list=null;
		try {
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			list=s.createCriteria(DepartmentDetails.class).list();
			t.commit();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	public static DepartmentDetails getbyIdDepartmentDetails(int id)
	{
		DepartmentDetails departmentDetails=null;
		try {
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			departmentDetails=(DepartmentDetails)s.get(DepartmentDetails.class, id);
			t.commit();
			s.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return departmentDetails;
	}
	
	public static void UpdateDepartmentDetails(DepartmentDetails d)
	{
		try {
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			s.update(d);
			t.commit();
			s.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void deleteDepartmentDetails(DepartmentDetails d)
	{
		try {
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			s.delete(d);
			t.commit();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
