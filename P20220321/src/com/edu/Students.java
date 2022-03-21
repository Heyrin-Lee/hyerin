package com.edu;

public class Students extends Person { // person이 가지고 있는 필드의 내용(공통항목)=부모항목 을 받고 Students에서 필요한 필드만 선언해준면 된다. 
	// 학교, 학년, 이름, 나이, 키, 몸무게 
	private String school;
	private int grade;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
