package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 숫자를 계속 입력할 수 있도록 한다.
		// -1 값을 입력하면 더 이상 입력하는 작업을 멈추겠다.
		// sum 이라는 변수에 -1 전까지 입력했던 값들을 담는다
		
		Scanner scn = new Scanner(System.in); // 스캐너 선언.
		int sum = 0; // sum이라는 변수를 0으로 초기화 선언.
		while(true) {
			
			System.out.println("숫자를 입력하세요."); // 숫자를 입력하세요 출력
			int inputVal = scn.nextInt(); // inputVal 이라고 변수에 담는다.
			sum +=inputVal; //0으로 초기화한 sum은 변수인 inputVal의 합이다. 라고 입력해두어야 한다. 
			
			if(inputVal == -1) { // 입력값이 -1이면 반복문을 종료
				break;
			}
		}
		System.out.println("합계는 " + sum + "입니다.");
	}
}
