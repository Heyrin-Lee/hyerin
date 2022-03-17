package com.dev;

import java.util.Scanner;

// BankApp(main method를 포함하는 클래스),Account(계좌번호,예금주,잔액확인 기능)를 여러개 설정하여 배열
public class BankApp {
	static Account[] banks = new Account[100]; //main메소드에서 바로 쓰려면 필드에서 static 으로 지정해두어야 한다.
	static Scanner scn = new Scanner(System.in);
	
	//메뉴를 선택할 수 있도록 보여준다: 
	//1.계좌생성(계좌번호,예금주,예금액 입력하도록) 
	//2.예금(계좌번호,예금액 입력) -> 최고예금액은 10만원. 이상이면 불가능하다는 메시지 출력
	//3.출금(계좌번호,출금액 입력) -> 현재잔액보다 큰 금액은 출금할 수 없다.
	//4.잔액조회(계좌번호 입력)
	//5.종료
	
	public static void main(String[] args) {
		
		while(true) {
			printMenu();
			int menu = scn.nextInt();
			if(menu == 1) {
				creatAccount();
			}else if (menu == 2) {
				deposit();
			}else if (menu == 3) {
				withdraw();
			}else if (menu == 4) {
				findAccountMoney();
			}else if (menu == 9) {
				showList();
			}
			else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("=== End of Prog ===");
	} // end of main()
	
	//메뉴출력 기능
	public static void printMenu() {
		String menu = "====================================\r\n"
				+ "    1.계좌생성(계좌번호,예금주,예금액 입력하도록) \r\n"
				+ "    2.예금(계좌번호,예금액 입력) -> 최고예금액은 10만원. 이상이면 불가능하다는 메시지 출력\r\n"
				+ "    3.출금(계좌번호,출금액 입력) -> 현재잔액보다 큰 금액은 출금할 수 없다.\r\n"
				+ "	   4.잔액조회(계좌번호 입력)\r\n"
				+ "	   5.종료.\r\n"
				+ "================================\r\n"
				+ "선택> ";
		System.out.println(menu);
	}
	
	//계좌생성
	public static void creatAccount() {
		System.out.println("계좌생성기능");
		System.out.print("계좌번호입력> ");
		String accNo = scn.next();
		System.out.println("예금주 입력> ");
		String accName = scn.next();
		System.out.println("예금액 입력> ");
		int accMoney = scn.nextInt();
		Account accnt = new Account(accNo, accName, accMoney); //새로운 인스턴스 accnt를 초기값(accNo~)을 바탕으로 만들었다.
		
		for(int i=0; i<banks.length; i++) {
			if(banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		System.out.println("계좌가 정상적으로 생성되었습니다.");
		}
	}
	
	 //예금기능
	public static void deposit() { 
		System.out.println("예금기능");
		System.out.print("계좌번호입력> ");
		String ano = scn.next(); //변수를 새롭게 다시 설정한다.
		System.out.println("예금액 입력> ");
		int amt = scn.nextInt();
		int checkCnt = 0; //조회가 됐는지 체크 여부를 확인하는 변수.
		for(int i=0; i<banks.length; i++) { //반복문을 돌면서 banks 배열 속 ano와 똑같은 계좌번호가 있는지 찾는다.
			if(banks[i] != null && banks[i].getAccNo().equals(ano)) { //계좌번호가 있을 경우
				//계좌번호가 조회됐을 때
				checkCnt = 1; //조회한 결과가 한 건 있습니다.
				int currAmt = banks[i].getMoney();
				
				//예금액이 10만원을 초과하지 못하도록 초과메시지를 출력해준다.
				if(currAmt + amt > 100000) {
					checkCnt = 2; //초과금액이라서 2번으로 넣고 반복문을 빠져나온다. 1000000 안 넘으면 정상 입금되지만, 초과하면 2번 값인 한도메시지 출력되고 반복문을 빠져나온다.
					break;
				}
				banks[i].setMoney(currAmt + amt); //잔액+입금액
				break;
			}
		}	
		if(checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		}else if (checkCnt == 2) {
			System.out.println("한도금액을 초과했습니다.");
		}else {
			System.out.println("계좌번호가 없습니다.");
		}
	}
	
	//출금기능
	public static void withdraw() {	
		System.out.println("출금기능");
		System.out.println("");
	}
	
	//잔액조회 메소드
	public static void findAccountMoney() { 
		System.out.println("잔액조회 기능");
	}
	
	//전체리스트 출력
	public static void showList() {
		for(int i=0; i<banks.length; i++) {
			if(banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}
}
