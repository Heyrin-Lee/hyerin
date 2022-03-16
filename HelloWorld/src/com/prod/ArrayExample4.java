package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] numbers = {35, 22, 17, 40, 28, 33};
		// 변수.length 은 배열의 데이터의 수이다. 배열의 데이터 크기가 변해도 따로 수정해주지 않아도 되는 편리함.
		int sum = 0;
		int cnt = 0; // if 조건이 몇번 실행됐는지 카운트 하는 용도의 변수
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] % 2 == 0) { // 짝수일 경우
				sum+= numbers[i];
				cnt++;
			}
		}
		System.out.println("짝수의 합은 " + sum);
		System.out.println("짝수값의 평균: " + (sum / (double) cnt));
	}
}
