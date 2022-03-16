package com.prod;

public class User {
	//field
	//사용자아이디, 사용자등급(A,B,C), 사용자연락처, 사용자포인트
	 //int userId;
	 int userId;
	 String userGrade;
	 String userPhone;
	 int userPoint;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	
	public String getUserGrade() {
		return this.userGrade;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserPhone() {
		return this.userPhone;
	}
	
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	public int getUserPoint() {
		return this.userPoint;
	}
	
	public String getUserInfo() {
		String result = this.userId + "의 사용자등급은 " + this.userGrade 
			+ "이고 사용자 연락처는 "	+ this.userPhone + "이고 사용자 포인트는 " + this.userPoint
			+ "입니다.";
		return result;
	}
}
