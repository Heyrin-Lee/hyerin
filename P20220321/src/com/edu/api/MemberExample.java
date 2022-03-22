package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue" , "홍길동");
		Member obj2 = new Member("blue", "홍길동");
		Member obj3 = new Member("red", "홍길순");
		
		if(obj1 ==obj2) { // 실제 인스턴스를 비교한다.
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		// 배열 -> 컬렉션(ArrayList, HashSet, HashMap) : 여러 개의 값(인스턴스, 숫자 등)을 저장하기 위한 기능.(배열보다 좋은 기능을 가지고 있음)
		Member[] memberAry = new Member[5]; // Member의 인스턴스를 최대 5개 저장 가능하다
		                                    //크기가 초과하면 새로운 배열을 선언하고 원래 배열속에 있던 값들을 복사해야하고 새 값을 추가해야한다. -> 컬렉션은 그럴 필요가 없다
		
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1", "홍길동")); // 배열 속 한 값을 차지하였음
		memList.add(new Member("user1", "홍길동"));
		for(int i=0; i<memList.size(); i++) { // 컬렉션은 length가 아닌 size로 크기를 지정한다.
			System.out.println(memList.get(i)); // i라는 인덱스값이 들어와도 값이 2개라는 것을 알고있다
		}
		
		HashSet<Member> memSet = new HashSet<Member>(); // 같은 값이면 중복 저장은 하지 않는다
		memSet.add(new Member("user1", "홍길동")); // Member.java에서 해시코드를 전부 1111 이라는 값으로 같게 리턴하면 주소값이 같기 때문에 배열 속 값은 1개로 인식한다,, 1111이라는 값을 리턴하는 코드를 없애면 주소값이 다르기 때문에 2개로 인식한다.
		memSet.add(new Member("user1", "홍길동"));
		
		System.out.println(memSet.size());
		
		if(obj1.equals(obj3)) { // == 와 equals의 차이점: ==는 주소값이 일치하는가, equals는 리턴해주는 값이 같은가이다.
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("논리적으로 같습니다.");
		} else {
			System.out.println("논리적으로 다릅니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("논리적으로 같습니다.");
		} else {
			System.out.println("논리적으로 다릅니다.");
		}
	}
}
