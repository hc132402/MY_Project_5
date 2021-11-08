package model;

public class Book {
	private String title;
	private String author;
	// Õº È∑‚√Ê
	private String covePath;
	// Õº ÈºÚΩÈ
	private String bookIntoduc;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String covePath, String bookIntoduc) {
		super();
		this.title = title;
		this.author = author;
		this.covePath = covePath;
		this.bookIntoduc = bookIntoduc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCovePath() {
		return covePath;
	}

	public void setCovePath(String covePath) {
		this.covePath = covePath;
	}

	public String getBookIntoduc() {
		return bookIntoduc;
	}

	public void setBookIntoduc(String bookIntoduc) {
		this.bookIntoduc = bookIntoduc;
	}

}
