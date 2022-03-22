package com.edu.nested;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
//		outer.method1();
//		outer.method3();
		outer.method4();
		
		
		System.out.println("------Inner------");
		Outer.Inner inner = outer.new Inner(); //아우터 클래스 속 이너클래스의 객체를 설정한다. 아우터 클래스의 참조변수에 new를 붙여서 Inner클래스의 인스턴스를 만든다.
//		inner.method2();
	}
}
