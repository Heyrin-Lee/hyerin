package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int num1 = 10;
		// String name = "홍길동";
		// ?? member = "홍길동" , 10;
		
		Member mem1 = new Member(); // name, age는 속성을 가지지 않고 있다. 값을 가지기 위해 변수를 초기화한 것.
		mem1.name = "홍길동";
		mem1.age = 20;
		
		Member mem2 = new Member();
		mem2.name = "김민수";
		mem2.age = 25;
		
		System.out.println("mem1의 name 속성: " + mem1.name);
		System.out.println("mem1의 age 속성: " + mem1.age);
		
		Student st1 = new Student(); //초기화..
		st1.studentNo = "22-123456";
		st1.studentName = "김영희";
		st1.korScore = 90;
		st1.engScore = 80; 
	}
}
