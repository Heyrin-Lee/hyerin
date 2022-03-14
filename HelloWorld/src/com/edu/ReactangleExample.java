package com.edu;

import java.util.Scanner;

public class ReactangleExample {
public static void main(String[] args) {
	 //가로, 세로, 길이 입력 -> 너비 계산.
	 Scanner scn = new Scanner(System.in);
	 
	 System.out.println("가로 길이:");
	 int xLength = scn.nextInt();
	 
	 System.out.println("세로 길이:");
	 int yLength = scn.nextInt();
	 
	 int area = xLength * yLength;
	 System.out.println("너비 결과: " + area + "입니다.");
	 
	 scn.close();
}
}
