package Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Pojo.ProjectDetails;

public class ProjectDetailsDao {

	
	public static SessionFactory sf=util.Util.getSessionFactory();
	
	
	public static Serializable insertProjectDetails(ProjectDetails projectDetails)
	{
		Serializable status=null;
		
		try {
			Session session=sf.openSession();
			Transaction t =session.beginTransaction();
			status=session.save(projectDetails);
			t.commit();
			session.close();
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	
	public static  List<ProjectDetails> getAllProjectDetail()
	{
		List<ProjectDetails> list=null;
		try {
			
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			list=session.createCriteria(ProjectDetails.class).list();
			t.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return list;
	}
	public static ProjectDetails getbyIdProjectDetails(int Id)
	{
		ProjectDetails projectDetails=null;
		try {
			Session session=sf.openSession();
			Transaction t= session.beginTransaction();
			projectDetails=(ProjectDetails)session.get(ProjectDetails.class, Id);
			t.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return projectDetails;
	}
	public static void updateProjectDetails(ProjectDetails projectDetails)
	{
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			session.update(projectDetails);
			t.commit();
			session.close();
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void deleteProjectDetails(ProjectDetails projectDetails)
	{
		try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			session.delete(projectDetails);
			
			t.commit();
			session.close();
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
