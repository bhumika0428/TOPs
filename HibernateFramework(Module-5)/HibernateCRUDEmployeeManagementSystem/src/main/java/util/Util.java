package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	public static final  SessionFactory sf;
	static {
		sf = new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory();

		
	}
	public static SessionFactory getSessionFactory() {
		
		return sf;

	}
}
