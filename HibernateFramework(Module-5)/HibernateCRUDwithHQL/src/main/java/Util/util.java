package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class util {

	public static final SessionFactory sf;
	static
	{
		sf=new Configuration().configure("/Resources/hibernate.cfg.xml").buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		
	
		return sf;
	}
}
