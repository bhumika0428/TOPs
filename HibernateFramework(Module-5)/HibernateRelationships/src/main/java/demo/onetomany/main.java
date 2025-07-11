package demo.onetomany;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure("demo/onetomany/hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Book book1=new Book();
		book1.setBookName("java core");
		book1.setPrices("344");
		book1.setYear("2008");
		
		Book book2=new Book();
		book2.setBookName("maths");
		book2.setPrices("353");
		book2.setYear("2009");
		
		Author author=new Author();
		author.setAuthorName("js");
		author.setAddress("pune");
		
		
		List<Book> booklist=new ArrayList<Book>();
		booklist.add(book1);
		booklist.add(book2);
		
		author.setBook(booklist);
		book1.setAuthor(author);
		book2.setAuthor(author);
		
		session.save(book1);
		session.save(book2);
		session.save(author);
		
		
		Author retrievedAuthor=session.get(Author.class, author.getAuthorId());
		System.out.println("Author Details");
		System.out.println(retrievedAuthor.getAuthorId());
		System.out.println(retrievedAuthor.getAuthorName());
		System.out.println(retrievedAuthor.getAddress());
		
		
		System.out.println("Books written by this author:");
		for(Book bookinfo:retrievedAuthor.getBook())
		{
			System.out.println(bookinfo.getBookName());
			System.out.print(bookinfo.getPrices());
			System.out.print(bookinfo.getYear());
		}
		
		tx.commit();
		session.close();
		sessionFactory.close();
	}
	
}
