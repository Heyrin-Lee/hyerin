package Library;

import java.util.List;
import java.util.Scanner;

public class LibExee {
	public static void main(String[] args) {
		LibDAO dao = new LibDAO();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴: 1.회원가입 2.관리자 로그인 3.회원 로그인");
			System.out.println("메뉴 선택>> ");
			int menu = scn.nextInt();
			// 관리자 아이디,비밀번호는 int타입
			// 관리자 아이디: 11
			// 관리자 비밀번호: 1111
			if (menu == 1) {
				System.out.println("가입할 회원 아이디 입력(숫자만 입력하세요)>> ");
				int joinNo = scn.nextInt();
				System.out.println("가입할 회원 비밀번호 입력(숫자만 입력하세요)>> ");
				int joinPw = scn.nextInt();

				dao.joinin(joinNo, joinPw);
				
				System.out.println("가입을 환영합니다!");
			} else if (menu == 2) {
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
							System.out.println("메뉴: 1.도서등록 2.도서정보수정 3.도서삭제 4.도서목록조회 5.회원리스트 0.종료");
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
								System.out.println("도서대여가능여부 입력(대여가능:y / 대여불가: n)>> ");
								String bookBorrow = scn.next();

								Book books = new Book(bookNo, bookTitle, bookAuthor, bookPublish, bookPlace,
										bookBorrow);
								dao.insertBook(books);
								System.out.println("도서번호: " + books.getBookNumber() + "책 이름: " + books.getBookTitle()
										+ "지은이: " + books.getBookAuthor() + "출판사: " + books.getBookTitle() + "책 위치: "
										+ books.getBookPlace() + "도서대여가능여부: " + books.getBookBorrow());

								// 도서정보수정
							} else if (choice == 2) {
								System.out.println("정보를 수정할 도서번호 입력>>");
								int bookNo = scn.nextInt();
								System.out.println("책제목 수정>> >> ");
								String bookTitle = scn.next();
								System.out.println("지은이 수정>> ");
								String bookAuthor = scn.next();
								System.out.println("출판사 수정>> ");
								String bookPublish = scn.next();
								System.out.println("책 위치 수정>> ");
								String bookPlace = scn.next();
								
								Book books = new Book();
								books.setBookNumber(bookNo);
								books.setBookTitle(bookTitle);
								books.setBookAuthor(bookAuthor);
								books.setBookPublish(bookPublish);
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
							} else if (choice == 5) { //회원리스트
								List<Login> members = dao.memList();
								for (Login ms : members) {
									System.out.println(ms.toString());
								}
							} else if (choice == 0) {
								System.out.println("프로그램을 종료합니다.");
								break;
							} else {
								System.out.println("잘못된 번호를 선택했습니다.");
							}
						}
					}
				}
			} else if (menu == 3) {
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
							System.out.println("메뉴: 1.도서대여 2.도서반납 3.도서목록조회 4.책제목 검색 -> 책 위치/대여가능여부 조회 5.비밀번호변경 0.종료");
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
								// 대여중인 도서목록 먼저보기
								List<Book> renting = dao.bookList2();
								for (Book rt : renting) {
									System.out.println(rt.toString3());
								}

								System.out.println("반납할 도서번호 입력>> ");
								int bookNo = scn.nextInt();
								Book check2 = dao.check(bookNo);
								if (check2 == null) {
									System.out.println("없는 도서번호입니다.");
								} else {
									if (check2.getBookBorrow().equals("n")) {
										dao.turn(bookNo);
										System.out.println("반납 완료되었습니다.");
									} else if (check2.getBookBorrow().equals("y")) {
										System.out.println("대여중인 도서가 아닙니다.");
									}
								}

							} else if (choice2 == 3) { // 도서목록조회
								List<Book> books = dao.bookList();
								for (Book bs : books) {
									System.out.println(bs.toString());
								} 
							} else if (choice2 == 4) { //책 제목 -> 첵 위치/대여가능여부 조회
								System.out.println("책 제목 검색>> ");
								String title = scn.next();
								List<Book> titles = dao.titlelist(title);
								
								System.out.println("검색한 책의 정보");
								for (Book info : titles) {
									System.out.println(info.toString2());
								}
								
							} else if (choice2 == 5) { //회원정보수정
								System.out.println("수정할 회원번호 입력>>");
								int membernom = scn.nextInt();
								System.out.println("비밀번호 변경>> ");
								int memberpsw = scn.nextInt();
								Login change = new Login();
								change.setMemberNumber(membernom);
								change.setMemberPassword(memberpsw);

								dao.updateMember(change);
								System.out.println("비밀번호가 변경되었습니다.");
								
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
			} // end of menu==2 else if
		} // end of while
	} // end of main
} // end of class