package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
	// 초(ex. 100초) 입력 -> 시/분/초 로 변경하기.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("초 단위 입력");
		int inputval = scn.nextInt();
		int hour = inputval / 3600;
		int minute = (inputval%3600) / 60;
		int second = (inputval%3600) % 60;
		
		System.out.println(inputval + "초 ->" + hour + "시간" + minute + "분" + second + "초");
		scn.close();
				}
}
