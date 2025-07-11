package demo.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure("demo/manytomany/hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Studentinfo s1=new Studentinfo();
		s1.setName("bhumika chauhan");
		s1.setPhone("3435345");
		s1.setAge("25");
		
		
		Studentinfo s2=new Studentinfo();
		s2.setName("sahin solanki");
		s2.setPhone("34353778745");
		s2.setAge("26");
		
		
		Courseinfo c1=new Courseinfo();
		c1.setCourseName("java");
		c1.setDurtion("1year");
		c1.setFees("34000");
		
		Courseinfo c2=new Courseinfo();
		c1.setCourseName("php");
		c1.setDurtion("1year");
		c1.setFees("30000");
		
		List<Studentinfo> studentlist=new ArrayList<Studentinfo>();
		studentlist.add(s1);
		studentlist.add(s2);
		
		
		
		
		
		
		  List<Courseinfo> courselist=new ArrayList<Courseinfo>();
		  courselist.add(c1);
		  courselist.add(c2);
		  
		  s1.setCourseinfos(courselist); 
		  s2.setCourseinfos(courselist);
		 
		c1.setStudentinfos(studentlist);
		c1.setStudentinfos(studentlist);
		
		
		List<Studentinfo> students = session.createQuery("from Studentinfo").getResultList();
		
		System.out.println("Student: " + students.get(0)); 
		  for (Studentinfo student : students) 
		  { System.out.println("Student: " + student.getName()); 
		  for (Courseinfo course : student.getCourseinfos()) {
		  System.out.println("  Enrolled in: " + course.getCourseName()); } }
		 
		
		
		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);
		
		tx.commit();
		session.close();
		sf.close();
	}
}

