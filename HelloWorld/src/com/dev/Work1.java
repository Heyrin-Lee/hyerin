package com.dev;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요.");
		int num1 = scn.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int num2 = scn.nextInt();
		
		if(num2 > num1) {
			System.out.println("두 수의 차는" + (num2 - num1) + "입니다.");
		}
	}
}
