package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5]; // 문자열의 데이터를 담는 배열
		names [0] = "홍길동";
		names [1] = "234";
		names [2] = "이혜린";
		names [3] = "567";
		
		names[1] = "이삼사";
		names[4] = "오육칠";
		names[0] = null;
		
		String searchName = "이혜린";
		
		for(int i=0; i<5; i++) {
//			if(names[i] != null) { //null이 아닌 경우에만 화면에 출력하겠다.
//			System.out.println("이름: " + names[i]);
//			}
		if(names[i] != null && names[i].equals(searchName)) { //!= 는 같지않다라는 의미
			System.out.println(i + 1 + "번째 위치에 있습니다.");
			}	
		}
	}
}
