package com.prod;
// 클래스를 정의하는 부분. add라는 class를 정의하였음.
public class Calculator {

	double PI = 3.14; // 속성
	//        매개변수,   매개변수
	int add(int n1, int n2) { //add라는 기능이 있는데, 매개변수가 두 개로 설정되어있다.
		return n1 + n2; // n1과n2를 더해서 그 값을 반환해주도록 기능을 설정.
	}
	
	//반환하는 타입은 int, 메소드 이름은 minus, minus는 두개의 매개변수를 받는다(v1,v2) v1-v2를 뺀 값을 반환받도록
	
	int minus(int v1, int v2) {
		return v1 - v2;
	}
	
	// 사각형의 넓이 계산..
	double getRectArea(double x, double y) {
		return x * y;
	}
	
	// 원의 넓이를 계산..
	double getCircleArea(double radius){
		return PI * radius * radius;
	}
}
