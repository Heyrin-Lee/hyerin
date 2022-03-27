package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	String coach;
	String locker;
	public SoccerMember(int memberId, String memberName, String phone, String coach, String locker) {
		super(memberId, memberName, phone);
		this.coach = coach;
		this.locker = locker;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getLocker() {
		return locker;
	}
	public void setLocker(String locker) {
		this.locker = locker;
	}
	@Override
	public String toString() {
		String soccer = "회원번호: " + super.getMemberId() + ", 회원 이름: " + super.getMemberName() + ", 연락처: " + super.getPhone() //
		+ ", 코치이름: " + this.getCoach() + ", 락커룸 이름: " + this.getLocker();
		return soccer;
	}
	
	
	
	
	
	
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
}
