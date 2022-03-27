package com.edu.lambda;
interface Runnable3 {
	public int run(String str); //매개변수,반환타입 모두 있다
}
public class RunExample3 {
	public static void main(String[] args) {
		Runnable3 runnable = (String str) -> { //매개값을 받은 문자의 크기를 리턴
			return str.length(); //입력받은 문자열의 크기
		};
		int inth = runnable.run("Hello world");
		System.out.println(inth);
	

	}
}
