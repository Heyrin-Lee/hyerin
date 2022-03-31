package com.prod;

import java.util.Scanner;

public class LibraryExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//메뉴: 1.로그인 2.도서등록 3.도서정보수정 4.도서삭제 5.도서목록조회 6.도서대여 7.회원의 대여도서 목록 조회 9.종료
		while (true) {
			System.out.println("메뉴: 1.로그인 2.도서등록 3.도서정보수정 4.도서삭제 5.도서목록조회 6.도서대여 7.회원의 대여도서 목록 조회 9.종료");
			System.out.println("메뉴 선택>> ");
			
			int menu = scn.nextInt();
			
			if(menu ==1) {
				
			} else if(menu == 2) {
				System.out.println("도서등록번호 입력>> ");
				
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else if(menu ==5)  {
				
			} else if(menu == 6) {
				
			} else if(menu == 7) {
				 
			} else if(menu == 9) {
				
			}
		}
	}
}
