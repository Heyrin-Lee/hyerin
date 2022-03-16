package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 정수를 담을 수 있는 배열을 만든다. 변수 이름은 ages->int이며 나이를 담는다.크기는 3개의 값을 넣을 수 있도록
		// 20 / 23 / 27
		int[] ages = new int [3];
		
		ages[0] = 20;
		ages[1] = 23;
		ages[2] = 27;
		
		ages[0] = 30; // 기존의 데이터값에 덮어쓰기
		ages[1] = 32;
		ages[2] = 35;

		
		for(int i=0; i<3; i++) {
			System.out.println("나이는 " +ages[i]);
		}
		
		 // 전체나이를 저장할 수 있는 sumAge 라는 변수를 생성하고 나이를 누적시킨다.
		//sumAge의 값을 avgAge 반복문을 활용해서 평균을 구한다.
		
		double avgAge =0;
		int sumAge = 0;
		for(int i=0; i<3; i++) {
			sumAge += ages[i];
		}
		avgAge = sumAge / (double) 3;
		System.out.println("평균은 " + avgAge);
		
		for(int i=0; i<3; i++) {
			sumAge += ages[i];
		}
		avgAge = sumAge / (double)3;
		System.out.println("평균은 " + avgAge);
		System.out.printf("%.3f", avgAge); //반올림 3f 소숫점 세번째 자리에서 반올림함.
		
		
	}
}
