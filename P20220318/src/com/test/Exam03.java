package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int[] number = new int [3];
//		int max = number[0];
//		
//		System.out.println("첫 번째 값을 입력하세요.");
//		number[0] = scn.nextInt();
//		System.out.println("두 번째 값을 입력하세요.");
//		number[0] = scn.nextInt();
//		System.out.println("세 번째 값을 입력하세요.");
//		number[0] = scn.nextInt();
//		
//		for(int i=0; i<3; i++) {
//			if(max<number[i]) {
//				max=number[i];
//			System.out.println();
//			}
//		}
		
//		System.out.println("최대값: " + max);
		//-------------------------------------------//
		
		int[] intAry = new int[3]; //배열을 선언할 때는 new 라는 연산자 사용
		Scanner scn = new Scanner(System.in);
		
		for(int i=0; i<intAry.length; i++) {
			System.out.println("정수를 입력하세요>>"); //반복문이니까 3번 자동으로 메시지가 출력되기 때문에 출력메시지를 굳이 3번 적지 않아도 된다
			intAry[i] = scn.nextInt();
		}
		//배열의 값이 3개 저장이 완료되었다.
		
		int maxValue = intAry[0]; //제일 큰 값을 담기 위한 변수를 지정하는데, 첫번째 값이 제일 크다고 가정한다. 이거보다 큰 값이면 그걸로 바꿔주면 되니까
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i]>maxValue) {
				maxValue = intAry[i];
			}
		}
		System.out.println("최대값: " + maxValue);
		
	}
}
