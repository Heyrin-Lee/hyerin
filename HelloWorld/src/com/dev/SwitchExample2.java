package com.dev;

public class SwitchExample2 {
	public static void main(String[] args) {
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 외는 F;
		
		int score = 75; // => 하나의 값으로 어떻게 만들 수 있을까. 70점 대는 C로 만들고 싶다. :score는 int로 정수이므로 10으로 나누어주면 6~9 사이의 값으로 구분 가능.
		
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default:
			System.out.println("F");
		}
		
	}
}
