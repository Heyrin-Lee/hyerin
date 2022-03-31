package com.prod;

public class Book {
	private int bookNumber;
	private String bookTitle;
	private String bookAtuhor;
	private String bookPublish;
	private String bookPlace;
	private String bookRental;
	
	//생성자
	public Book(int bookNumber, String bookTitle, String bookAtuhor, String bookPublish, String bookPlace,
			String bookRental) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookAtuhor = bookAtuhor;
		this.bookPublish = bookPublish;
		this.bookPlace = bookPlace;
		this.bookRental = bookRental;
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

	public String getBookAtuhor() {
		return bookAtuhor;
	}

	public void setBookAtuhor(String bookAtuhor) {
		this.bookAtuhor = bookAtuhor;
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

	public String getBookRental() {
		return bookRental;
	}

	public void setBookRental(String bookRental) {
		this.bookRental = bookRental;
	}
	
	
	
	
}
