package com.dev;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		int ranVal = (int) (Math.random() *3) + 1; // 0~10 사이에 임의의 값을 만들어준다.
		System.out.println(ranVal);
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("0~3 사이의 숫자를 하나 입력하세요");
		int num = scn.nextInt();
		
		if (num == ranVal) {
			System.out.println("same");
		} else {
			System.out.println("false");
		}
		scn.close();
	}
}
