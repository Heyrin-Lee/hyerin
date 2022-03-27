package com.edu.lambda;

interface Runnable {
	public void run(); // 추상매소드 설정,, 매개변수,반환타입 둘 다 없다
}

class RunImpl implements Runnable { // Runnable이라는 인터페이스를 구현하는 RunImpl이라는 클래스,,
	// 할 때마다 실행되는 내용이 달라지면 클래스 선언의 용이성이 떨어진다. 그렇기 때문에 가상의

	@Override
	public void run() {
		System.out.println("run");
	}

}

public class RunExample {
	public static void main(String[] args) {
		// 람다표현식 :매개값(String s 와 같은 값) -> 받아서 {구현코드};에 넣겠다
		
		Runnable runnable = new RunImpl();
		runnable.run();
		
		runnable = new Runnable() { //Runnable이라는 인터페이스를 구현시키기 위해서는 매소드를 만들어줘야한다 클래스 이름 없이 runnable이라는 인터페이스를 구현하는 객체가 아래의 매소드이다.

			@Override
			public void run() {
				System.out.println("호랑이가 달립니다.");
				
			}
			
		}; //익명구현개체
		runnable.run();
		
		runnable = () -> {System.out.println("사자가 달립니다."); //runnable은 Runnable이라는 인터페이스의 변수,,()에 있는 매개변수를 받아서 {} 속 코드를 실행시키겠다.
			
		};
		runnable.run();
	}
}
