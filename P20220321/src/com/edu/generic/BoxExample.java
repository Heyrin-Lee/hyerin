package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj(); //담겨져있는 데이터 값이 String인데 리턴되는 타입이 object 이므로 캐스팅을 해줬다
//		System.out.println(result);
//		
//		Integer result1 = (Integer) box.getObj(); //String 타입은 Integer타입으로 캐스팅할 수 없다..출력을 해봐야 오류 여부를 알 수 있기 때문에 컴파일하는 시점에 오류여부를 알 수 있게 해주면 좋겠다
//		System.out.println(result1);
		
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("Hellow");
		String result = stringBox.getObj();
		
		Box<Integer> intBox = new Box<Integer>();
//		intBox.setObj("Hello"); //잘못된 값을 넣으려고 하면 미리 알려준다. Box클래스에서 <T>라고 데이터타입을 generic으로 선언해두었기 때문(..?)
		Integer result1 = intBox.getObj();
		
		ArrayList<Integer> intAry = new ArrayList<Integer>(); //<>에 선언된 데이터타입만 입력할 수 있도록 하여, 잘못된 데이터타입의 값을 넣으려고 하면 에러
		
	}
}
