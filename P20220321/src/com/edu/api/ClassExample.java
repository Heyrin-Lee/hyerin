package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		// 앞에서 만든 String, System, Member...=> 관리해주는 클래스가 class(Class); 이다
		
		Class cls = String.class; // String 클래스에 정보를 읽어오기 위해 아래의 구문을 입력
		try {
		cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName()); // 메소드 이름만 가져오는 getSimpleName
		Method[] methods = cls.getMethods();
		for(Method met : methods) { // Method met : methods 는 받아온 값을 met 가방에 넣겠다
			System.out.println("메소드 이름: " + met.getName());  // 배열에 있는 값 만큼만 반복시키겠다(값이 몇개 들어가있는지 모르겠지만).. 클래스 안에 저장된 매소드들을 확인한다.
		}
		
		cls = Member.class;
		
		String path = cls.getResource("ClassExample.class").getPath(); //위치 가져오기
		System.out.println(path);
	}
}
