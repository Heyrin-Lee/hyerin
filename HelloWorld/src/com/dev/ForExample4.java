package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		
		// 1 ~ 10 까지의 수 중에서 짝수의 값 => evenSum, 홀수의 값 => oddSum
		int evenSum = 0; 
		int oddSum = 0;
		//evenSum = oddSum = 0; // 변수에 초기값을 할당(초기화)
		for(int i=1; i<=10; i++) {
			if (i % 2 ==1) {
				oddSum +=i;
			} else {
				evenSum +=i;
			}
		}
		System.out.println("홀수의 합: " + oddSum + ", 짝수의 합: " + evenSum);
		
		// 홀수의 합: ? , 짝수의 합: ? 입니다.
		
		// int num = 48; 의 약수 구하기.
		
		int num = 48;
		for(int i=1; i<=48; i++) { 
			if (num % i ==0) {     // 변수 i로 48을 나눴을 때 나머지가 0이어야 한다.
				System.out.println(i); // 1,2,3,4,6,8,12,16,24,48
			}
		} 
	}
}
