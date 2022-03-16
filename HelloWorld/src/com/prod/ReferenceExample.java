package com.prod;

public class ReferenceExample {
	public static void main(String[] args) {
		
		//참조타입 VS 기본(데이터)타입
		int num1 = 10; // 리터럴
		int num2 = 10; //
		//int, double, (byte, short, long, float, char, boolean) -기본 데이터 타입
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2); //true
		
		String str1 = new String("hello"); //문자열 만들기. 
		String str2 = new String("hello");
		System.out.println(str1 == str2); //class 타임(참조타입)은 가지고 있는 주소가 다르기 때문에 false이다. 참조타입은 같은 값이 들어가있어도 주소가 다름.
		
		System.out.println(str1); // 주소값: 123afbc35(임의로..)
		System.out.println(str2);
		System.out.println(str1.equals(str2)); //참조타입 안에 있는 값(내용)을 비교하고 싶을 때 사용한다. (위 실습에서의 값(내용) hello를 비교한다.)
		//참조타입 변수에는 실제값이 아니라 주소값이 들어간다.
		
		
	}
}
