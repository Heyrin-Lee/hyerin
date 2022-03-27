package com.edu;

public class SwimMember extends Member{
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	String teacher;
	String grade;
	
	public SwimMember(int memberId, String memberName, String phone, String teacher, String grade) {
		super(memberId, memberName, phone);
		this.teacher = teacher;
		this.grade = grade;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		String swim = "회원번호: " + super.getMemberId() + ", 회원 이름: " + super.getMemberName() + ", 연락처: " + super.getPhone() //
		+ ", 강사이름: " + this.getTeacher() + ", 수영등급: " + this.getGrade();
		return swim;
	}
	
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
}
