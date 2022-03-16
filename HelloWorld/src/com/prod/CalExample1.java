package com.prod;

public class CalExample1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		
		int number1 = 10;
		int number2 = 20;
		// 호출하는 부분. add return 기능을 호출하였다.  => number1,2 매개값
		int result = cal.add(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 합계: " + result);
		
		result = cal.minus(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 차: " + result);
		
		// int 타입의 매개값은 double 형태로 자동변환된다. 10 -> 10.0
		double area = cal.getRectArea(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 너비: " + area);
		
		double r = 4.5;
		area = cal.getCircleArea(r);
		System.out.println("반지름" + r + "의 넓이: " + area);
	}
}
