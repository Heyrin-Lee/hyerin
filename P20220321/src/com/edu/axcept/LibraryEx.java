package com.edu.axcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryEx {
	private static LibraryEx singleton = new LibraryEx(); 
	private LibraryEx() {
		
	}
	
	public static LibraryEx getInstance() { 
		return singleton;
	}
//	public static void main(String[] args) {	
//	}
	public void run() {
		// 책제목, 저자, 가격 => 저장.
		// 리스트 보여주기
		Scanner scn = new Scanner(System.in);
		Book[] library = new Book[5];
		
		while(true) {
			int menu = 0;
			
			while(true) {
			try {
				showMessage("메뉴 선택: 1. 책 정보 입력, 2. 리스트 보기, 3. 종료"); // 오류가 나면 다시 메뉴를 보여줘야 하기 때문에 while문안에 넣었다.
				menu = scn.nextInt(); //int 타입의 menu라는 변수를 설정해서 입력값을 받도록 한다.. 숫자를 입력하라고했는데 문자를 입력할 에러가 발생할 가능성이 있다.
				break; //에러가 안 나면 반복문 멈춤
			} catch (InputMismatchException e) { // 이것도 클래스
				System.out.println("숫자를 입력하세요.");
				scn.next(); // a를 넣었다면 a의 값(사용자가 입력한 값)을 처리하여 다시 새로운 입력값을 넣도록 한다.
			}
		}	
			
			if(menu == 1) {
				showMessage("책 제목을 입력하세요.");
				String title = scn.next();
				showMessage("저자를 입력하세요.");
				String author = scn.next();
				int price = 0; //초기값을 줬다
				
				while(true) {
					try {
					showMessage("가격을 입력하세요."); //에러 발생 가능성이 있다.
					price = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					scn.next();
					}
				
				
				Book book = new Book(title, author, price); //book이라는 생성자를 호출한다.
				for(int i=0; i<library.length; i++) {
					if(library[i] == null) {
						library[i] = book; //book이라는 인스턴스에 입력한 갑의 배열을 담는다.
						break;
					}
				}
				showMessage("저장완료");
				}	
			}else if (menu == 2) {
				for(int i=0; i<library.length; i++) {
					if(library[i] != null) {
						library[i].showInfo(); //책제목, 저자, 가격의 리스트를 보여준다.
					}
				}
						
		
			}else if (menu == 3) {
				showMessage("프로그램을 종료합니다.");
				break;
			}
		} // end of prog
		showMessage("=== end of program ===");
		
		scn.close();
	}
	
	public void showMessage(String str) {
		for (int i=0; i<str.length(); i++)
		System.out.print(str.charAt(i));
		try {
			Thread.sleep(100); 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
