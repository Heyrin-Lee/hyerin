package com.dev;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// 물건의 가격이 50,000원 이상이면 배송비가 무료.
		// 그 외에는 배송비가 3,000원.
		
		// 결재할 금액이 얼마인지를 보여주는 코드.
		
		// 결재할 금액은 ?입니다. 
		
		System.out.println("물건의 금액을 입력하세요.");
		
		int shippingFee = 3000;
		
		int price = scn.nextInt();
		
		if (price >= 50000) {
			price = price;
			//System.out.println("결재할 금액은 " + price);
		} else {
			price = price + shippingFee;
			//System.out.println("결재할 금액은 " + (price + shippingFee) );
		}
		
		//price = (price>=50000) ? price : price + shippingFee;
		System.out.println("결재할 금액은 " + price + "원 입니다.");
		scn.close();
	}
}
