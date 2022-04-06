package Library;

import java.util.List;
import java.util.Scanner;

public class LibExee {
	public static void main(String[] args) {
		LibDAO dao = new LibDAO();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴: 1.관리자 로그인 2.회원 로그인");
			System.out.println("메뉴 선택>> ");
			int menu = scn.nextInt();
			// 관리자 아이디,비밀번호는 int타입
			// 관리자 아이디: 11
			// 관리자 비밀번호: 1111
			if (menu == 1) {
				System.out.println("관리자 아이디 입력>> ");
				int adminNo = scn.nextInt();
				System.out.println("관리자 비밀번호 입력>> ");
				int adminPw = scn.nextInt();
				Login l = dao.loginin(adminNo, adminPw);
				if (l == null) {
					System.out.println("관리자 로그인 실패");
				} else {
					dao.loginin(adminNo, adminPw);
					System.out.println("관리자 로그인 성공");
					if (l != null) {
						while (true) {
							System.out.println("메뉴: 1.도서등록 2.도서정보수정 3.도서삭제 4.도서목록조회 0.종료");
							System.out.println("메뉴 선택>> ");
							int choice = scn.nextInt();
							// 도서등록
							if (choice == 1) {
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
								String bookBorrow = scn.next();

								Book books = new Book(bookNo, bookTitle, bookAuthor, bookPublish, bookPlace,
										bookBorrow);
								dao.insertBook(books);
								System.out.println("도서번호: " + books.getBookNumber() + "책 이름: " + books.getBookTitle()
										+ "지은이: " + books.getBookAuthor() + "출판사: " + books.getBookTitle() + "책 위치: "
										+ books.getBookPlace() + "도서대여가능여부: " + books.getBookBorrow());

								// 도서정보수정
							} else if (choice == 2) {
								System.out.println("도서번호 입력>>");
								int bookNo = scn.nextInt();
								System.out.println("수정할 책 위치 입력>> ");
								String bookPlace = scn.next();

								Book books = new Book();

								books.setBookNumber(bookNo);
								books.setBookPlace(bookPlace);

								dao.updateBook(books);
								System.out.println("수정되었습니다.");
								// 도서 삭제
							} else if (choice == 3) {
								System.out.println("삭제할 도서번호 입력>> ");
								int bookNo = scn.nextInt();

								dao.deleteBook(bookNo);
								System.out.println("삭제되었습니다.");
								// 도서목록조회
							} else if (choice == 4) {
								List<Book> books = dao.bookList();
								for (Book bs : books) {
									System.out.println(bs.toString());
								}
							} else if (choice == 0) {
								System.out.println("프로그램을 종료합니다.");
								break;
							}
						}
					}
				}
			} else if (menu == 2) {
				// 회원 아이디,비밀번호는 int타입
				// 회원 아이디: 22
				// 회원 비밀번호: 2222
				System.out.println("회원 아이디 입력>> ");
				int memberNo = scn.nextInt();
				System.out.println("회원 비밀번호 입력>>");
				int memberPw = scn.nextInt();
				Login l = dao.loginin2(memberNo, memberPw);
				if (l == null) {
					System.out.println("회원 로그인 실패");
				} else {
					dao.loginin2(memberNo, memberPw);
					System.out.println("회원 로그인 성공");
					if (l != null) {
						while (true) {
							System.out.println("메뉴: 1.도서대여 2.도서반납 3.도서목록조회 0.종료");
							System.out.println("메뉴 선택>> ");
							int choice2 = scn.nextInt();
							// 도서대여
							if (choice2 == 1) {
								// 도서목록 먼저보기
								List<Book> books = dao.bookList();
								for (Book bs : books) {
									System.out.println(bs.toString());
								}

								System.out.println("대여할 도서번호 입력>> ");
								int bookNo = scn.nextInt();
								Book check = dao.check(bookNo);
								if (check == null) {
									System.out.println("없는 도서번호입니다.");
								} else {
									if (check.getBookBorrow().equals("y")) {
										dao.borrow(bookNo);
										System.out.println("대여 완료되었습니다.");
									} else if (check.getBookBorrow().equals("n")) {
										System.out.println("대여 불가도서입니다.");
									}
								}
								// 도서반납
							} else if (choice2 == 2) {
								// 도서목록 먼저보기
								List<Book> books = dao.bookList();
								for (Book bs : books) {
									System.out.println(bs.toString());
								}
								
								System.out.println("반납할 도서번호 입력>> ");
								int bookNo = scn.nextInt();
								Book check2 = dao.check(bookNo);
								if(check2 == null) {
									System.out.println("없는 도서번호입니다.");
								} else {
									if(check2.getBookBorrow().equals("n")) {
										dao.borrow(bookNo);
										System.out.println("반납 완료되었습니다.");
									} else if(check2.getBookBorrow().equals("y")) {
										System.out.println("대여중인 도서가 아닙니다.");
									}
								}
								
							} else if (choice2 == 3) { // 도서목록조회
								List<Book> books = dao.bookList();
								for (Book bs : books) {
									System.out.println(bs.toString());
								}
							} else if (choice2 == 0) {
								System.out.println("프로그램을 종료합니다.");
								break;
							} else {
								System.out.println("잘못된 번호를 선택했습니다.");
								scn.close();
							}
						}
					}
				}
			} //end of menu==2 else if
		} //end of while
	} //end of main
} //end of class