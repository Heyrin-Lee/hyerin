package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		// 친구의 정보(이름, 전화번호, 이메일, 키, 몸무게)
		Friend f1 = new Friend();
		f1.friendName = "권가희";
		f1.friendPhone = "010-1234-5678";
		f1.email = "abc@naver.com";
		f1.height = 170.5;
		f1.weight = 50.2;
		
		Friend f2 = new Friend();
		f2.friendName = "이유빈";
		f2.friendPhone = "010-4321-8765";
		f2.email = "def@naver.com";
		f2.height = 180.5;
		f2.weight = 60.2;
		
		Friend f3 = new Friend();
		f3.friendName = "나현주";
		f3.friendPhone = "010-2341-5678";
		f3.email = "gef@naver.com";
		f3.height = 175.5;
		f3.weight = 55.2;
		
		Friend[] friends = { f1, f2, f3 };
		
		System.out.println(f1); //f1에 입력된 이름, 이메일 등이 출력되는 것이 아니라 f1의 주소값이 출력된다.
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i].height < 180) {
			System.out.println("이름: " + friends[i].friendName);
			System.out.println("전화번호: " + friends[i].friendPhone);
			System.out.println("키: " + friends[i].height);
			System.out.println("==========");
			}
		}
	}
}
