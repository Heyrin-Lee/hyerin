package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args) {
		// 2개의 값을 입력. 
		int price, cash;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("가격을 입력하세요.");
		
		// 가격을 입력하세요.
		price = scn.nextInt(); // 5500원은 10% 포함된 금액.
		
		
		// 손님이 낸 금액
		System.out.println("손님이 낸 금액");
		cash = scn.nextInt(); // 10000원
		
		System.out.println("부가세: " + (price * 1/11));
		System.out.println("거스름돈: " + (cash - price));
		
		// 하나는 상품의 부가세, 하나는 거스름돈
		// 부가세 : 500원.
		// 거스름돈: 4500원.
	}
}
