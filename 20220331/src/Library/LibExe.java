package Library;

import java.util.List;
import java.util.Scanner;

public class LibExe {
public static void main(String[] args) {
	LibDAO dao = new LibDAO();
	Scanner scn = new Scanner(System.in);
	
	while(true) {
		System.out.println("메뉴: 1.로그인 2.도서등록 3.도서정보수정 4.도서삭제, 5.도서목록족회 6.도서대여 7.회원의 대여도서 목록조회 9.종료");
		System.out.println("메뉴 선택>> ");
		int menu = scn.nextInt();
		
		if(menu == 1) {
			System.out.println("1.관리자 로그인 2.회원 로그인");
			int choice = scn.nextInt();
				if(choice == 1) {
					System.out.println("관리자 아이디 입력>> ");
					int adminNo = scn.nextInt();
					System.out.println("관리자 비밀번호 입력>> ");
					int adminPw = scn.nextInt();
					Login l = dao.loginin(adminNo, adminPw);
					if(l == null) {
						System.out.println("관리자 로그인 실패");
					} else {
//						System.out.println(l.toString());
						dao.loginin(adminNo, adminPw);
					}
				} else if(choice == 2) {
					System.out.println("회원 아이디 입력>> ");
					int memberNo = scn.nextInt();
					System.out.println("회원 비밀번호 입력>>" );
					int memberPw = scn.nextInt();
					Login l = dao.loginin2(memberNo, memberPw);
					if(l == null) {
						System.out.println("회원 로그인 실패");
					} else {
//						System.out.println(l.toString());
						dao.loginin2(memberNo, memberPw);
					}
				}
		}else if(menu == 2) { //도서정보입력
			System.out.println("도서번호 입력>> ");
			int bookNo = scn.nextInt();
			System.out.println("책 이름 입력>> ");
			String bookTitle = scn.next();
			System.out.println("지은이 입력>> ");
			String bookAuthor = scn.next();
			System.out.println("출판사 입력>> ");
			String bookPublish = scn.next();
			System.out.println("책 위치 입력>> ");
			String bookPlace = scn.next();
			System.out.println("도서대여가능여부 입력>> ");
			String bookRental = scn.next();
			
			Book books = new Book (bookNo, bookTitle, bookAuthor, bookPublish, bookPlace, bookRental);
			dao.insertBook(books);
			System.out.println("도서번호: " + books.getBookNumber() + "책 이름: " + books.getBookTitle() + "지은이: " + books.getBookAuthor() + "출판사: " + books.getBookTitle() + "책 위치: " + books.getBookPlace() + "도서대여가능여부: " + books.getBookRental());
			
		}else if(menu == 3) { //도서정보수정
			System.out.println("도서번호 입력>>");
			int bookNo = scn.nextInt();
			System.out.println("수정할 책 위치 입력>> ");
			String bookPlace = scn.next();
			System.out.println("도서대여가능여부 수정>> ");
			String bookRental = scn.next();
			
			Book books = new Book();
			
			books.setBookNumber(bookNo);
			books.setBookPlace(bookPlace);
			books.setBookRental(bookRental);
			
			dao.updateBook(books);
			System.out.println("수정되었습니다.");
			
		}else if(menu == 4) {
			System.out.println("삭제할 도서번호 입력>> ");
			int bookNo = scn.nextInt();
			
			Book books = new Book();
			dao.deleteBook(bookNo);
			System.out.println("삭제되었습니다.");
			
		}else if(menu == 5) {
			List<Book> books = dao.bookList();
			System.out.println("도서목록");
			for(Book bookls : books) {
				System.out.println(bookls.toString());
			}
		}else if(menu == 6) {
			
		}else if(menu == 7) {
			
		}else if(menu == 9) {
			System.out.println("프로그램을 종료합니다.");
		}
 	}
}
}
