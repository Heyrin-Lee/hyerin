package com.edu.lambda;
interface Runnable4 {
	public int run(); //매개변수는 없고 반환타입은 있다,,
}
public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random()*10); // 0~9까지 임의의 정수를 생성 =>매개값이 없기때문에
		};
		int result = runnable.run(); //Math.random에서의 임의의 값이 반환될 것이다
		System.out.println(result);
		
		runnable = () -> { //또 다른 기능.. function을 runnable 이라는 변수에 담겠다라는 것을 간단한 식으로 표현하는 것을 람다 표현식이다.(함수적인 프로그램 작성: 간단하게 표현)
			return (int) (Math.random()*100);
		};
		result = runnable.run();
		System.out.println(result);
	}
}
