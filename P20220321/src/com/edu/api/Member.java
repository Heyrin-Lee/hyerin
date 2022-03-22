package com.edu.api;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) { //생성자 
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 1111; // 해시코드를 모두 1111이라는 같은 값으로 리턴한다. -> 
	}

	@Override
	public boolean equals(Object obj) { //equals라는 매소드를 어떻게 재정의하느냐
		Member member= null; // override 구문 밖에서 system.out.println(member);와 같이 출력하려고 하면 member 값의 초기화 과정이 필요하다. 이것이 그것임.
		if(obj instanceof Member) { // 매개값(obj)이 Member 타입인지 확인
			 member = (Member) obj; // Member 타입으로 강제 타입 변환
			if(id.equals(member.id) && name.equals(member.name)) { // id 필드값이 동일한지 검사한 후
				return true; // 동일하다면 true
			}
		}
		return false; // 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴 
	}
	
	
}
