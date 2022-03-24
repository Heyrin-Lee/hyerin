package com.test;

import java.util.Arrays;
import java.util.Scanner;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {
//		int ranNum = (int) (Math.random()*6) + 1;
//		System.out.println(ranNum); // 1~6까지 임의의 정수 생성
//		
//		int[] random = new int[5];
//		
//		for(int i=1; i<random.length; i++) {
//			int ranNum = (int) (Math.random()*6) + 1;
//			random[i] = ranNum;
//		}
//		Arrays.sort(random);
		//--------------------------------------------//
		int[] intAry = new int[5];
		
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = (int) (Math.random()*6)+1; // 0<= x <1 의 수를 만들어준다. Math.random()*6을 해주면 0<=x<6 이라는 범위가 만들어진다.. (int)를 해주면 강제로 정수로 변환해준다.1~6까지의 임의의 수니까 6도 포함되게 +1
		}
		
		int maxValue = intAry[0]; //제일 큰 값을 담기 위한 변수를 지정하는데, 첫번째 값이 제일 크다고 가정한다. 이거보다 큰 값이면 그걸로 바꿔주면 되니까
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i]>maxValue) {
				maxValue = intAry[i];
			}
		
		}
		System.out.println("최대값: " +maxValue);
	}
}
