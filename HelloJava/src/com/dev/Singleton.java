package com.dev;

public class Singleton {
	private static Singleton instance = new Singleton(); //싱글턴 타입의 인스턴스라는 필드를 하나 선언했다.
	
	private Singleton() { //생성자를 private으로 막아버렸다.
		
	}
	
	public static Singleton getInstance() { //인스턴스에 담겨있는 값을 하나 받아와서 싱글턴 타입으로 반환하겠다.
		return instance; //Singleton.getInstance
	}
}
