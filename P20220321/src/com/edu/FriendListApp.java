package com.edu;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		
		Friend f1 = new Friend();
		f1.setName("진휘용");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-2323-9845");
		
		UnivFriend f2 = new UnivFriend("서현일", 29, 178.3, 69.2, "010-1111-2222");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");
		
		ComFriend f3 = new ComFriend("최규완", 29, 178.3, 74.2, "010-1111-3333", "네이버", "지도app개발연구원");
		
		Friend f4 = new Friend();
		f1.setName("진휘용");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-2323-9845");
		
		UnivFriend f5 = new UnivFriend("박현일", 29, 178.3, 69.2, "010-1111-2222");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");
		
		ComFriend f6 = new ComFriend("최규완", 29, 178.3, 74.2, "010-1111-3333", "네이버", "지도app개발연구원");
		
		friends[0] = f1;
		friends[1] = f2;
		friends[3] = f3;
		friends[4] = f4;
		friends[5] = f5;
		friends[6] = f6;
		
		//학교친구만 출력한다.
		for (int i=0; i<friends.length; i++) {
			if (friends[i] != null && friends[i] instanceof UnivFriend)
				System.out.println(friends[i].toString()); //동일한 기능이지만 인스턴스종류에 따라 다른 결과가 실행됨 -> 다형성
		}
		
		
		for(int i=0; i<friends.length; i++) {
			if (friends[i] != null)
			System.out.println(friends[i].toString());
		}
		Friend friend = f2; //f2는 UnivFriend 클래스가 가지고 있는 인스턴스,, Friend 클래스의 변수 friend를 설정하고 값을 f2로 주었다.. 자식 클래스의 참조변수값은 부모 클래스의 참조변수값에 포함된다.
		friend = f1; //그런데 다시 friend라는 변수에 f1이라는 부모클래스의 인스턴스를 담았다.
		UnivFriend uni = null; //아직 uni의 값을 모르기때문에 초기값 null을 주어서 아무값이 없다고 설정해둠
		if(friend instanceof UnivFriend) {//friend 라는 변수가 UnivFriend의 인스턴스인지 체크하는 작업.. friend라는 타입을 UnivFriend 타입으로 변경하려고 하는데, friend가 UnivFriend에 속하는지 체크를 한 후에 변경여부를 정할 수 있다.friend는 5개이고 UnivFriend는 7개를 만들 수 있는 방이 있으므로 friend가 UnivFriend에 속한다.
			uni = (UnivFriend) friend; //강제 형변환.(casting) -> 속하니까 형변환 가능하다.
			uni.getUniversity(); //부모 클래스에 참조변수 타입은 자식 클래스의 참조변수에 할당이 가능하다. 하지만 
		}
	}
}
