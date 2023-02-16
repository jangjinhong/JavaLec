package Book;

public class Book {
	private String bookName;
	private String author;

	public Book() { 
		this.bookName = "책이름없음";
		this.author = "저자명없음";
	}
	
	public Book(String bookName, String author) { 
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

}
