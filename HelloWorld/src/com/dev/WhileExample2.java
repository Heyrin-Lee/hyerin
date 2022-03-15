package com.dev;

public class WhileExample2 {
	public static void main(String[] args) {
		// 1 ~ 10 까지의 수 중에서 짝수만 출력한다.
		// while 문으로 작성한다.
		
		int i = 1;// 초기화..
		while(i<=10) { // 조건식
			if (i % 2 == 0) {
				System.out.println("i의 값 => " +i );
			}
			i++; // 증감식 : i가 1~10 사이에서 출력되니까.
		}
	}

}
