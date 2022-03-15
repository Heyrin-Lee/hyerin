package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		// for
		for(int i=1; i<=5; i++) {
			System.out.println("1의 값 => " + i);
		}
		
		//while
		int i = 1; // 초기화
		while(i<=5) { // 조건식
			System.out.println("1의 값 =>" + i);
			i++; // 증감식 ->의 위치에 따라 i의 수가 달라지므로 반복문의 시작점이 달라진다.
		}
		
		//while
		int num = 0;
		while(true) { // true로 설정해두면 무조건 반복문을 실행한다. 
			System.out.println("num의 값 => " + num);
			num++;
			if (num>5) {
				break; // 반복문을 빠져나온다.
			}
		}
		
		//while
		while(true) {
			int rand = (int) (Math.random() * 10) + 1; // 1 ~ 10을 포함하는 임의의 값이 만들어진다.
			System.out.println("임의의 생성된 값: " + rand);
			if(rand == 8) {
				break;
			}
		}
		
		// 수를 맞출 때까지 계속 반복한다.
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;
		while(true) {
			randomVal = (int) Math.random() * 5 + 1;
			System.out.println("1 ~ 5 사이의 임의의 값을 입력하세요");
			userVal = scn.nextInt();
			
			if(randomVal == userVal ) {
				System.out.println("생성된 임의의 값과 같습니다.");
				break;
			}
		}
		
		System.out.println("end of Prog");
	}
}
