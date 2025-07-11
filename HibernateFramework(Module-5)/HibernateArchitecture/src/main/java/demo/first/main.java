package demo.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("demo/first/hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		StudentDetails obj=new StudentDetails();
		//obj.setStudentid(1);
		obj.setName("bhumika");
		obj.setAge("23");
		obj.setPhone("763476");
		
		session.save(obj);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
