package com.edu.nested;

public class Outer {
	private String field1;
	private int field2;
	
	class Inner {  //클래스 안에 또 다른 클래스 선언(중첩).. 멤버 클래스
		String field3;
		int field4;
		
		void method2() {
			System.out.println("Inner.method2()");
		}
	}
	
	//함수적 인터페이스: 구현해야 할 메소드가 하나인 것.
	interface Runnable { //인터페이스 선언
		void run(); // 추상 매소드
	}
	
	class Bus implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Bus가 달립니다.");
		}
	}
	
	
	public String getfield1() {
		return field1;
	}
	
	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}
	
	public void method3() {
		System.out.println("Outer.method3()");
		
		class Local {  //메소드 안에도 클래스를 선언 할 수 있다.(로컬클래스).. method3안에 선언된 클래스는 method3 안에서만 사용가능하다.
			
			void method4() {
				System.out.println("Local.method4()");
				}
			}
		
		Local local = new Local();
		local.method4();
		}	
	
		public void method4() {
			Runnable runnable = new Bus(); // 인터페이스의 구현객체이기 때문에 가능.. 인터페이스를 new 연산자를 이용해서 새로운 객체를 만들었다.
			runnable.run();
			
			// 익명구현객체**.. 매소드 안에서만 선언할 수 있다
			runnable = new Runnable() {  //Runnable이라는 인터페이스를 구현하는 객체를 여기에 바로 선언하겠다.

			//Lambda 표현식
//			runnable = () -> system.out.println("임의의 객체를 실행합니다."); ..function 이라고 한다.
				@Override
				public void run() { //
					// TODO Auto-generated method stub
					System.out.println("임의의 객체를 실행합니다.");
				}
				
			};
			
			runnable.run();
		}
	}
