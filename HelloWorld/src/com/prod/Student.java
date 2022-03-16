package com.prod;

public class Student {
	// 22-123456
	//필드(field) - 어떠한 정보를 담아놓기 위해 사용된다.
	String studentNo;
	String studentName;
	int korScore;
	int engScore; // 이것들은 속성
	
	//void 는 int(or, double) return과 달리 값을 반환하지 않는다.
	// method : 기능.. 함수    기능을 먼저 정해두어야(정의해두어야) example에서 기능을 호출 가능.
	void study(String gwamok) { // study 는 method 이름
		System.out.println(gwamok + "을(를) 합니다.");
	}
	
	void eat(String food) { //String food 는 매개변수
		System.out.println(food + "을 먹습니다.");
	}
	
	int getkorScore() {
		return korScore; // 국어점수에 대한 값을 int 타입으로 돌려주겠다.국어 점수를 반영하는 기능이 담겨있는 method
	}
	
	int getengScore() {
		return engScore;
	}
	
	
}
