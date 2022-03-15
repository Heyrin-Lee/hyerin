package com.dev;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int arr[] = new int[3]; // arr 라는 변수에 담기는 배열 생성
		int num1, num2, num3, temp; // 입력받을 정수의 변수를 선언한다.
		
		System.out.println("첫 번째 수를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세 번째 수를 입력하세요.");
		num3 = scn.nextInt();
		
		if( num1 < num2 && num2 < num3) {
			System.out.println(num3 + num2 + num1);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println( num2 + num1 + num3);
		}
		
	}
}