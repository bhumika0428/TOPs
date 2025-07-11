package Dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Pojo.employeeinfomatation;

public class EmployeeInfoDao {

	public static SessionFactory sf=Util.util.getSessionFactory();
	
	public static Serializable insertEmployeeinfo(employeeinfomatation obj)
	{
		Serializable status=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			session.save(obj);
			t.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	public static List<employeeinfomatation> getAllemployeeinfo()
	{
		List<employeeinfomatation> list=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			Query query=session.createQuery("from employeeinfomatation");
			list=((org.hibernate.query.Query) query).list();
			t.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}
	public static employeeinfomatation getbyIdemEmployeeinfomatation(int id)
	{
		employeeinfomatation obj=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			String hql="from employeeinfomatation where EmployeeId=:id";
			Query query=session.createQuery(hql);
			query.setParameter("id", id);
			 obj=(employeeinfomatation)((org.hibernate.query.Query) query).uniqueResult();
			
			t.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return obj;
	}
	
	
	  public static employeeinfomatation updateEmployeeinfomatation(employeeinfomatation obj)
	  { 
		  employeeinfomatation employeeinfomatation=null; 
		  try { 
			  Session session=sf.openSession();
	          Transaction t=session.beginTransaction(); 
				/*
				 * Query query = session.
				 * createQuery("update employeeinfomatation set EmployeeName=:?,Email=:?,moblie=:?,Salary=:?,departmentInfo=? where EmployeeId=:id"
				 * ); query.executeUpdate();
				 */
	          session.update(obj);
	          t.commit(); 
	          session.close(); 
	         }
		  catch (Exception e) 
		  { 
			  // TODO: handle exception 
			  System.out.println(e);
		 } 
		  return employeeinfomatation; 
		  }
	 
	  	
	
	public static employeeinfomatation deleteEmployeeinfomatation(employeeinfomatation emp)
	{
		employeeinfomatation employeeinfomatation=null;
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			
			/*
			 * Query query =
			 * session.createQuery("delete from employeeinfomatation where EmployeeId=:id");
			 * query.setParameter("id", 1); query.executeUpdate();
			 */
			session.delete(emp);
			t.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return employeeinfomatation;
	}
}
