package com.edu;

public class Variables {
	public static void main(String[] args) {
		//변수 : 메모리공간 이름지정 값을 할당.
		int age = 20; // 20 == 30
		int num1 = 30;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("age변수: " + age);
		System.out.println("20 + 10 = 30");
		
		String name = "홍길동"; // 문자열.
		name = "최민규";
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
		final String myName = "이혜린"; // 상수(Constance)
		//myName = "김창호"
		
		// 전화번호, 이메일 값을 담을 수 있는 변수. 010-1234 
		String phone = "010-3933-0535";
		String mail = "zzzang1302@naver.com";
		System.out.println(myName + "의 전화번호: " + phone + "이고 이메일은 " + mail);
		
	}
}
