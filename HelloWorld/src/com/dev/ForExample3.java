package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		// 입력받는 두수를 num1, num2
		
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		System.out.println("수를 입력하세요.");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		for(int i= num1; i<=num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "부터" + num2 + "까지의 합: " + sum);
	}
}
