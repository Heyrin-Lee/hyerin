package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //Animal 이라는 생성자를 만들었음에도 불구하고 추상클래스는 인스턴스 생성이 불가능하다.
		Animal animal = null;
		animal = new Dog(); //Dog라는 클래스는 실체이다(Animal 클래스로부터 상속받지만)
		animal.setName("백구"); 
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("두부");
		animal.eat();
		animal.speak();
	}
}
