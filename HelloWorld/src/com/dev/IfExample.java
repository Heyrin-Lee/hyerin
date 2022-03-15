package com.dev;

public class IfExample { // WhichExample 클래스이름은 대문자로 시작한다. firstName, first_name 과 같이 대소문자가 영향을 받지 않는 경우 언더바로 구분한다. 
	public static void main(String[] args) {
		// 조건문 if ..
		//60점 이상이면 Pass
		int score = 83;
		
		if(score > 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		//90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점이상이면 D, 그 외는 F
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (score >= 80) {
			if (score >=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			if (score >=75) {
				System.out.println("C+");
			} else {
			System.out.println("C");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+");
			} else {
			System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
		
		System.out.println("end of Program");
	}
}
