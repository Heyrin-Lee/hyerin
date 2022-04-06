package Library;

public class Book {

	private int bookNumber;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublish;
	private String bookPlace;
	private String bookBorrow;
	//생성자
	public Book() {
		
	}
	
	public Book(int bookNumber, String bookTitle, String bookAuthor, String bookPublish, String bookPlace,
			String bookBorrow) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
		this.bookPlace = bookPlace;
		this.bookBorrow = bookBorrow;
	}


	public Book(int bookNumber, String bookBorrow) {
		super();
		this.bookNumber = bookNumber;
		this.bookBorrow = bookBorrow;
	}
	

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublish() {
		return bookPublish;
	}

	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}

	public String getBookPlace() {
		return bookPlace;
	}

	public void setBookPlace(String bookPlace) {
		this.bookPlace = bookPlace;
	}
	
	public String getBookBorrow() {
		return bookBorrow;
	}

	public void setBookBorrow(String bookBorrow) {
		this.bookBorrow = bookBorrow;
	}

	@Override
	public String toString() {
		return "Book [도서번호=" + bookNumber + ", 책 제목=" + bookTitle + ", 지은이=" + bookAuthor
				+ ", 출판사=" + bookPublish + ", 도서 위치=" + bookPlace + ", 도서대여가능여부=" + bookBorrow + "]";
	}

	
	
	
}
