package demo.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure("demo/onetoone/hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		
		User obj=new User();
		obj.setUsername("bhumichauhan");
		
		
		
		Profile obj1=new Profile();
		obj1.setName("bhumika chauhan");
		obj1.setAddress("pune");
		obj1.setAge("24");
		obj1.setMoblie("3525345345");
		
		obj.setProfile(obj1);
		session.save(obj1);
		session.save(obj);
	
		
		User retrievedUser = session.get(User.class, obj.getUserId());

        System.out.println("Retrieved User: ");
        System.out.println("Username :"+retrievedUser.getUsername());
         System.out.println("Retrieved Profile: " + retrievedUser.getProfile());

		
		
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
