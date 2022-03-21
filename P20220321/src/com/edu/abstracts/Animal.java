package com.edu.abstracts;

public abstract class Animal { //abstract를 붙임으로써 추상클래스로 선언된다.
	private String name; //필드
	
	public Animal() { //생성자
		System.out.println("Animal() 생성자 호출.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 추상메소드 정의
	public abstract void eat(); //eat 이라는 매소드이고 리턴타입은 void로 없다. 구현되는 부분(= {} )이 없고 선언부분만 있다. 그런데 왜 정의하는가? Animal 클래스를 상속받는 클래스들은 반드시 이 메소드를 따라야 한다. 그러므로 상속받는 클래스를 생성할 때 오버라이드하여 구문을 추가시켜야한다. 강제로 기능을 구현하도록 하기 위함이다.
	
	public abstract void speak();
}
