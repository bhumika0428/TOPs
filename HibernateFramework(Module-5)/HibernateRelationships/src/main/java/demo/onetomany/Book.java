package demo.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookdetails")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int bookId;
	private String bookName;
	private String prices;
	private String year;
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPrices() {
		return prices;
	}
	public void setPrices(String prices) {
		this.prices = prices;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", prices=" + prices + ", year=" + year
				+ ", author=" + author + "]";
	}
	public Book(int bookId, String bookName, String prices, String year, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.prices = prices;
		this.year = year;
		this.author = author;
	}
	 Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
