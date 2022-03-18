package com.dev;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance(); //Singleton.getInstance의 형태로 호출해야 한다.
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
