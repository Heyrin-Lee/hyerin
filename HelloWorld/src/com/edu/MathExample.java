package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a,b;
		//두 수를 입력받는다.
		System.out.println("첫 번째 숫자를 입력하세요.");
		a = scn.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		b = scn.nextInt();
		
		//두 수의 합을 출력한다.
		System.out.println("두 수의 합: " + (a + b) );
		System.out.println("두 수의 차: " + (a - b) );
		System.out.println("두 수의 곱: " + (a * b) );
		System.out.println("두 수의 몫: " + (a / b) );
		System.out.println("나눈 나머지: " + (a % b) );
		scn.close();
	}
}
