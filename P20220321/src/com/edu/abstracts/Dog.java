package com.edu.abstracts;

public class Dog extends Animal {
	
	public Dog() {
		super(); //Dog 클래스를 만들면 알아서 부모클래스 값이 만들어져서 부모 클래스 기능+자식 클래스 기능 둘 다 가지게 된다.. 부모 생성자를 호출해서 자식이 존재하도록 한다. 여기에서 super();은 있어도 없어도 상관없다.
		System.out.println("Dog() 생성자 호출.");
	}
	
	@Override
	public void eat() {
		System.out.println("멍멍이가 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("멍멍이는 멍멍");
	}
	
	

}
