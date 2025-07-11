package Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import Pojo.departmentinfomatation;
import Pojo.employeeinfomatation;

public class DepartmentInfoDao {

	public static  SessionFactory sf=Util.util.getSessionFactory();
	
	public static Serializable insertDepartmentInfo(departmentinfomatation departmentInfo)
	{
		Serializable status=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			
			/*
			 * String hql =
			 * "INSERT INTO departmentinfomatation (DepartmentName) SELECT : departmentName"
			 * ; Query query = session.createQuery(hql);
			 * query.setParameter("departmentName", departmentInfo.getDepartmentName());
			 * 
			 * int result = query.executeUpdate(); System.out.println("Rows affected: " +
			 * result);
			 */ 
			session.save(departmentInfo);
			t.commit();
			session.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		return status;
	}
	
	public static List<departmentinfomatation> getAllDepartmentinfomatation()
	{
		List<departmentinfomatation> list=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			Query query=session.createQuery("from departmentinfomatation");
			list = query.list();  
			t.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return list;
	}
	
	public static departmentinfomatation getByIdDepartmentinfomatation(int id)
	{
		departmentinfomatation dobj=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			
			String hql = "FROM departmentinfomatation WHERE DepartmentId = :id";
	        Query query = session.createQuery(hql);
	        query.setParameter("id", id);
	        
	        // Fetch the result
	        dobj = (departmentinfomatation) query.uniqueResult();
			
			t.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return dobj;
	}
	
	 public static departmentinfomatation update(departmentinfomatation obj)
	  { 
		 departmentinfomatation departmentinfomatation=null;
		 try{ 
			  Session session=sf.openSession();
	          Transaction t=session.beginTransaction(); 
				
	          session.update(obj);
	          t.commit(); 
	          session.close(); 
	         }
		  catch (Exception e) 
		  { 
			  // TODO: handle exception 
			  System.out.println(e);
		 } 
		  return departmentinfomatation; 
		  }
	 
	  	
	
	 public static departmentinfomatation delete(departmentinfomatation obj)
	  { 
		 departmentinfomatation departmentinfomatation=null;
		 try{ 
			  Session session=sf.openSession();
	          Transaction t=session.beginTransaction(); 
				
	          session.delete(obj);
	          t.commit(); 
	          session.close(); 
	         }
		  catch (Exception e) 
		  { 
			  // TODO: handle exception 
			  System.out.println(e);
		 } 
		  return departmentinfomatation; 
		  }
	 
}
