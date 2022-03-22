package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		
		// 기본 데이터타입: (int, long, double, boolean...)
		// 참조 타입(클래스): (Integer, Long, Double, Boolean...)
		// int -> Integer: 기본->참조 "boxing",, Integer -> int "unboxing"
		ArrayList<Integer> ary = new ArrayList<Integer>(); //<> 안에는 클래스 타입만 올 수 있다.
		ary.add(100);
		ary.add(new Integer(200)); // Deprecated : 향후 자바에서 제거할 예정(이 상황에서 에러는 아니지만 이렇게 쓰면 에러가 날 수 있으니 앞으로 없애겠다)
		
		new Integer(100).floatValue(); // 100.0
	}
}
