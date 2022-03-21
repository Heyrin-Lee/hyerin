package com.edu.axcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		//오류 : Error , Exception(예외) 이라는 종류로 나뉜다.
		// compile error, runtime error(실제로 실행을 해봐야 알 수 있는 에러) "예외처리"
		
		try { //에러가 날 수 있는 구문에 "에러가 발생하면 에러발생 메시지를 출력하고 끝까지 프로그램이 수행될 수 있도록 한다"
		double result = 13/0;
		System.out.println("결과: " + result);
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다."); //에러가 난다면 출력되는 메시지
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		try {
		 int menu = scn.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("숫자를 입력하지 않았습니다.");
			
		}
		
		System.out.println("end of prog"); //에러가 나더라도 프로그램이 끝까지 실행되면 출력되는 메시지
	}
}
