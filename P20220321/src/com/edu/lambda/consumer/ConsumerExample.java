package com.edu.lambda.consumer;

import java.util.function.*; //일일이 임폴트 해주지 않아도 된다-function 밑에부터는 계속 임폴트하겠다


public class ConsumerExample {
	public static void main(String[] args) {
		
		// 함수적 인터페이스(functional interface) : 람다표현식 가능 //<>은 generic으로 타입을 지정
		Consumer<String> consumer = (t) -> {
			System.out.println(t + " 출력합니다.");
			
		}; 
		consumer.accept("메세지"); //consumer가 참조하는 건 (t)->{}의 기능이다: consumer는 (t)->{}이라는 기능을 담은 변수
		
		BiConsumer<Integer, Integer> biCon = (t, u) -> {
			System.out.println("result: " + (t + u));
			
		};
		biCon.accept(20, 40);
	}
}
