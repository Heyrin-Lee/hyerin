package com.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		
		System.out.println("start");
//		System.exit(0); // 프로그램을 강제로 종료시키겠다.
		System.out.println("end");
		
		long currentTime =  System.currentTimeMillis(); //현재 시간을 1970.1.1부터의 밀리세컨드를 생성
		System.out.println(currentTime);
		//24*60*60*1000 => 하루를 의미하는 밀리세컨드 값
		long days = currentTime/(24*60*60*1000);
		System.out.println(days); // 19073
		long years = 19073/365;
		System.out.println(years); 
		
		
		currentTime =  System.currentTimeMillis();
		long sum = 0;
		for(int i=0; i<100000; i++) {
			sum += i; // sum은 i의 누적합
		}
		System.out.println("summary: " + sum);
		long endTime = System.currentTimeMillis();
		
		System.out.println("연산에 걸린시간: " + (endTime - currentTime) + "msec"); // 2밀리세컨드
	}
}
