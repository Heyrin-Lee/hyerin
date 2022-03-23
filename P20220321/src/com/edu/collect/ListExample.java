package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		//일반 배열
		String[] strings = new String[10];
		for(int i=0; i<strings.length; i++) {
			if(strings[i]==null ) {
				strings[i] = "hello";
				break;
			}
		}
		//ArrayList
		ArrayList<String> strAry = new ArrayList<String>(); //String을 담을 수 있는 배열과 같은 공간 ArrayList. 클래스이기 떄문에 생성자를 호출한다.
		strAry.add("hello");
		strAry.add("world");
		
		strAry.get(1);
		strAry.set(1, "월드"); //해당 인덱스 값의 내용을 수정한다.=set
		strAry.remove(0); //0번째 인덱스 값을 지우겠다.
		strAry.clear(); //인덱스 값 모두 삭제
		System.out.println("strAry.size() => " + strAry.size());
		
		for(int i=0; i<strAry.size(); i++) { //length가 아니라 size.. 인덱스 기반의 배열이기 때문에 반복문을 사용하여 결과값 출력..
			String result = strAry.get(i); //리턴되는 타입이 스트링 타입이다
			System.out.println(result);
		}
		
		
//		ArrayList<Integer> numAry = new ArrayList<Integer>(); //인티저 타입만 가지고 있는 ArrayList
//		for(int i=0; i<numAry.size(); i++) {
//			int result = numAry.get(i);
//		}
	}
}
