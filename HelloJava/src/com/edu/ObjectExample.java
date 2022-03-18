package com.edu;
//객체지향 프로그램언어..
//절차프로그램(데이터,함수: 하나하나 데이터를 불러와서 함수에 적용시키고..) -> 데이터와 함수를 하나로 묶고싶어서 객체지향프로그램을 고안(데이트,기능(함수))
// Object(객체) -> class(도면,틀): object의 특징들을 나열할 수 있는 틀을 만드는 것이 class(객체를 프로그램으로 만들기 위해서 필요한 특징들을 class로 만든다) -> class를 기반으로 실체를 만드는 것을 인스턴트생성 이라고 함(이전의 실습에서는 초기화라고 하였다) 
// 학생(객체:Object) -> class Student -> 인스턴스(new Student()) new Student 라는 실체를 구현을 한 것이다.
// 객체의 특징들을 설정해서 모은 것이 class, 이고 그 class를 기반으로 구현한 것이 인스턴스이다.
public class ObjectExample {
	public static void main(String[] args) {
		int num1 = 10; //자바에서 변수를 사용하려면 데이터 타입을 필수로 입력.
		double num2 = 12.34;
		double num3 = 20; // 작은 범위에서 큰 범위로 갈 때에는 (double)20 을 입력하지 않아도 자동형변환이 된다.
		int num4 = (int) 23.4; // 큰 범위에서  작은 범위로 갈 때에는 자동형변환이 되지 않지만 (int)23.4 로 입력하면 소수점은 버려도 된다고 하는 것이다. 강제형변환
		
		String str1 = "Hello"; // class는 대문자로 시작하는 규칙. heap(인스턴스) = 인스턴스가 heap 영역에 생성됨.
		Car car1 = new Car(); // 초기화(인스턴스 생성). Car라는 클래스의 변수를 지정하고 싶으면 new를 사용. car라는 객체의 실체를 car1로 새롭게 하나 만듦.
		car1.setModel("Sonata");
		car1.setPrice(10000000);
		
		Student s1 = new Student(); //초기화 시점에 값을 지정.
		s1.setStudNo(100); // 값들을 필드에 넣는 것. set메소드로 값을 설정하였음.
		s1.setStudName("김형민");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(70);
		
		System.out.println("영어점수 초기값은 " + s1.getEngScore());
		System.out.println("이름의 초기값: " + s1.getStudName());
		System.out.println(s1.getStudName() +"의 합계점수는 " + s1.getSumScore());
		System.out.println(s1.getStudName() + "의 평균은  " + s1.getAvgScore());
	}
	
}
