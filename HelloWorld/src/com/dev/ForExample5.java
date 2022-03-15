package com.dev;

import java.util.Scanner;

public class ForExample5 {
	public static void main(String[] args) {
		// 두 수를 입력받는다. 두 수의 최대공약수를 구한다.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("수를 입력하세요.");
		int a , b, c = 0; //c의 값만 0으로 설정한다. 
		a = scn.nextInt();
		b = scn.nextInt();
		
		for(int i=1; i<=b; i++) {  
			if(a % i == 0 && b % i == 0) {
				c=i;
			}
			
		}
		System.out.println(c);
	}
}
