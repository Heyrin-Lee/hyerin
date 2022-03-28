package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	String banjang;
	String room;
	public BookMember(int memberId, String memberName, String phone, String banjang, String room) {
		super(memberId, memberName, phone);
		this.banjang = banjang;
		this.room = room;
	}
	public String getBanjang() {
		return banjang;
	}
	public void setBanjang(String banjang) {
		this.banjang = banjang;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		String book = "회원번호: " + super.getMemberId() + ", 회원 이름: " + super.getMemberName() + ", 연락처: " + super.getPhone() //
						+ ", 반장이름: " + this.getBanjang() + ", 강의실: " + this.getRoom();
// 		String book = super.toString(); // 부모클래스(Member) id, name, phone을 book이라눈 변수에 담아주고
// 		book += "\n반장이름: " banjang + ", 강의실: " + room; // BookMember만의 추가정보
		return book;
	}
	
	
	
	
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
}
