package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1을 누르면 입금처리, 2를 누르면 출금처리, 3을 누르면 종료하는 기능을 추가한다.
		// 입금의 경우: "입금액을 입력하세요" 메시지를 출력하고 account 라는 변수에 값을 누적시킨다.
		// 출금의 경우: "출금액을 입력하세요" 메시지를 출력하고 account 라는 변수에서 값을 차감한다.
		// 종료의 경우: 프로그램 종료

		Scanner scn = new Scanner(System.in); // 스캐너 선언
		int account = 0; // account 변수를 0으로 초기화한다. 누적/차감시킬 변수를 선언한다.
		while (true) { // while 반복문을 true로 선언한다.
			System.out.println("1: 입금, 2: 출금, 3: 종료"); // 1: 입금, 2: 출금, 3: 종료 메시지를 출력시킨다.

			int menu = scn.nextInt(); // menu라는 변수 선언하고 1,2,3 중에서 입력하도록 한다.
			int no = 0; //0으로 초기화. -> scn.nextInt(); 에서 입력할 때 원하는 값 지정 가능

			if (menu == 1) {
				System.out.println("입금액을 입력하세요.");
				account += scn.nextInt();
				System.out.println("잔액: " + account);
				
			} else if (menu == 2) {
				// 마이너스 통장이 안되도록 처리한다. "잔액부족" 메시지 띄우기.
				System.out.println("출금액을 입력하세요.");
				no = scn.nextInt();
				if (no > account) { //잔액 부족.
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 잔액: " + account); // 현재 잔액 조회
					//continue; <-구문 아래를 무시하고 다음순번으로 넘어간다. ex. 잔액이 부족할 경우 1번으로 돌아가서 출금이 되지 않도록한다.
				} else {
					account -=no; // no로 지정한 변수에 입력한 값=출금하려는 금액이다.
					System.out.println("잔액: " + account);
				}

			} else if (menu == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}