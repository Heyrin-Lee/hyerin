package com.test;

import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	public static void main(String[] args) {
		
	
//	public class Book{
//		String name;
//		String by;
//		String from;
//		int price;
//		
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getBy() {
//			return by;
//		}
//		public void setBy(String by) {
//			this.by = by;
//		}
//		public String getFrom() {
//			return from;
//		}
//		public void setFrom(String from) {
//			this.from = from;
//		}
//		public int getPrice() {
//			return price;
//		}
//		public void setPrice(int price) {
//			this.price = price;
//		}
//		
//		
//		
//	}
//	public static void main(String[] args) {
//	
//	Book b1 = new Book ();
//	
//-------------------------------------------------//	
		 Scanner scn = new Scanner(System.in);
		 
		 System.out.println("책 제목>> "); //사용자가 입력한 값을 변수에 담는다
		 String title = scn.next();
		 System.out.println("저자>> ");
		 String author = scn.next();
		 System.out.println("출판사>> ");
		 String press = scn.next();
		 System.out.println("가격>> ");
		 int price = scn.nextInt();
		 
		 //인스턴스 생성
		 Book book = new Book(title, author, press, price); //만들어진 인스턴스를 book이라는 변수에 담는다.
		 book.showInfo(); //Book클래스에서 만든 매소드를 여기서 불러온다 => 책 제목 입력 기능
	}
}
