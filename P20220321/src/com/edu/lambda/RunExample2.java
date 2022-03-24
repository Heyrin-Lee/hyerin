package com.edu.lambda;
interface Runnable2 {
	public void run(String animal); //매개값이 있는 추상매소드
}

public class RunExample2 {
	public static void main(String[] args) {
//		Runnable2 runnable = new Runnable2() {
		
//			@Override
//			public void run(String animal) { //Runnable2의 추상매소드이다
//				System.out.println(animal + "이 달립니다.");
//			}
			
//		};
		
		Runnable2 runnable = (String animal) -> {
			System.out.println(animal + "이 달립니다.");
		};
		runnable.run("호랑이");
	}
}
