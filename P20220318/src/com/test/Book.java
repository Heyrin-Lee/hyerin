package com.test;

public class Book {
//책제목, 저자, 출판사, 금액
	
	private String title;
	private String author;
	private String press;
	private int price;
	
	//생성자 선언****
	public Book(String title, String author, String press, int price) { //클래스이름+변수를 이용하여 생성자 생성.. 매개값에 따라서 필드를 채워주는 역할을 한다.. 생성자는 필요한 만큼 생성 가능.. 지금은 모든 필드가 다 들어가있는 생성자를 만들었다.
		super();
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}
	
	//매소드 생성.. 이 매소드를 호출하면 위의 정보들을 보여준다.
	public void showInfo() {
		System.out.printf("책정보 [제목: %10s 저자: %10s 출판사: %10s 가격: %5d]\n", title, author, press, price); //여기서 쓴 title~ 들은 필드를 가져온 것이다..%10s는 문자열을 %10d는 숫자..\n은 줄바꿈..
	
	}
}
