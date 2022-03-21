package com.edu.axcept;

public class Book {
	//필드
	private String title;
	private String author;
	private int price;
	
	//생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//매소드
	public void showInfo() {
		System.out.println("=====================================");
		System.out.println("책제목은 " + this.title + "저자는 " + this.author + "가격은 " + this.price + "입니다." );
		System.out.println("=====================================");
	}
}
