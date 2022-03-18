package com.dev;

public class Calculator {
	private String color; //계산기의 색은 각각 다르니가 인스턴스로 선언하였다.
	public static double PI = 3.14; //계산기라는 클래스에 소속되어있어서 일일이 인스턴스마다 만들 필요가 없다.
	
//	Calcurator.sum(10,20); 와 같이 static 메소드를 호출해서 출력하도록 한다.
//  c1.sum(10,30); 와 같이 인스턴스 메소드를 호출해서 출력하도록 한다.
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	public static double getArea(int r) {
		return PI * r;
	}
// Calculator.getArea(10); getArea라는 static 메소드를 호출하였다.
}
