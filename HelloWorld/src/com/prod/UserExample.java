package com.prod;

public class UserExample {
	public static void main(String[] args) {
		User u1 = new User ();
		u1.userId = (101);
		u1.userGrade = ("A");
		u1. userPhone = ("010-1234-5678");
		u1.userPoint = (2000);
		
		User u2 = new User ();
		u2.userId = (102);
		u2.userGrade = ("A");
		u2.userPhone = ("010-1243-5687");
		u2.userPoint = (1500);
		
		User u3 = new User ();
		u3.userId = (103);
		u3.userGrade = ("B");
		u3.userPhone = ("010-1324-5768");
		u3.userPoint = (850);
		
		User u4 = new User ();
		u4.userId = (104);
		u4.userGrade = ("C");
		u4.userPhone = ("010-3124-7568");
		u4.userPoint = (500);
		
		System.out.println(u1.getUserInfo());
		
		User[] users = { u1, u2, u3, u4 };
		
		for(int i=0; i<users.length; i++ ) {
			if(users[i].userGrade == "A" 
					&& users[i].userPoint >= 1000) {
				System.out.println("등급이 A이고 포인트가 1000점인 이상인 회원은 " + users[i].userId);
			}
		}
		
		
		
		
		
	}
}
