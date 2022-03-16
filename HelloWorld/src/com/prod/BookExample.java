package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책(책 제목, 저자, 출판사, 가격)
		Book book1 = new Book();
		book1.name = "혼공자";
		book1.by = "신용권";
		book1.from = "한빛미디어";
		book1.price = 24000;

		Book book2 = new Book();
		book2.name = "PowerJava";
		book2.by = "천인국";
		book2.from = "인피니티";
		book2.price = 35000;

		Book book3 = new Book();
		book3.name = "재밌는 Java";
		book3.by = "이호준";
		book3.from = "인피니티";
		book3.price = 20000;

		Book[] books = { book1, book2, book3 };

		for (int i = 0; i < books.length; i++) {
			if (books[i].from == "인피니티") {
				System.out.println("제목: " + books[i].name);
				System.out.println("저자: " + books[i].by);
				System.out.println("가격: " + books[i].price);
			}
		}

		for (int i = 0; i < books.length; i++) {
			if (books[i].by == "신용권") {
				System.out.println("제목: " + books[i].name);
				System.out.println("저자: " + books[i].by);
				System.out.println("가격: " + books[i].price);

			}

		}
	}

}
