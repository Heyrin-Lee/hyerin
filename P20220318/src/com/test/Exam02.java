package com.test;

import java.util.Scanner;

//문제2) 정수형 변수 n1, n2를 선언하고 Scanner 클래스를 통하여 두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째까지 구하는 기능 작성. 
public class Exam02 {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);

//		int n1, n2;
//		System.out.println("첫 번째 수를 입력하세요.");
//		n1 = scn.nextInt();
//		System.out.println("두 번째 수를 입력하세요.");
//		n2 = scn.nextInt();
//		
//		if(n1 > n2) {
//			System.out.printf("n1을 n2로 나눈 값: %.2f" , (double)(n1/n2));
//		}
		// -------------------------------//
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double result;
		
		System.out.println("첫 번째 값을 입력하세요.");
		n1 = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		n2 = scn.nextInt();

		if (n1 > n2) {
			result = n1 / (double) n2; // 정수연산을 하면 결과값도 정수(4byte) 실수(8byte).. n2를 더블타입으로 캐스팅하면 결과값도 자동으로 더블타입으로 나오도록 한다
		} else {
			result = n2/ (double) n1;
		}
		System.out.printf("결과: %.1f", result ); //f: result 값을 읽어들인다. .1f: 소수점 첫번째자리까지 
	}
}
