package Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Pojo.ProfileDetails;

public class ProfileDetailsDao {

	public static SessionFactory sf=util.Util.getSessionFactory();
	
	public static  Serializable insertProfileDetails(ProfileDetails profileDetails)
	{
		Serializable status=null;
		try {
			
			Session session = sf.openSession();
			Transaction t= session.beginTransaction();
			status=session.save(profileDetails);
			t.commit();session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	 public static List<ProfileDetails> getAllProfileDetails()
	 {
		 List<ProfileDetails> list=null;
		 try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			list=session.createCriteria(ProfileDetails.class).list();
			t.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 return list;
	 }
	 public static ProfileDetails getbyIdProfileDetails(int id)
	 {
		 ProfileDetails profileDetails=null;
		 try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			profileDetails=(ProfileDetails)session.get(ProfileDetails.class,id);
			t.commit();
			session.close();
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 return  profileDetails;
	 }
	 
	 
	 public static void updateProfileDetails(ProfileDetails profileDetails)
	 {
		 try {
			Session session=sf.openSession();
			Transaction t=session.beginTransaction();
			session.update(profileDetails);
			t.commit();
			session.close();
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	 }
	 public static void deleteProfileDetails(ProfileDetails profileDetails)
	 {
		 try {
			Session session= sf.openSession();
			Transaction t=session.beginTransaction();
			session.delete(profileDetails);
			t.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	 }
}
