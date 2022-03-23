package com.edu.collect;

public class Student {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70)
	private int number;
	private String name;
	private int eng;
	private int kor;
	
	public Student(int number, String name, int eng, int kor) {
		this.number = number;
		this.name = name;
		this.eng = eng;
		this.kor = kor; //*매개변수값과 필드값이 같다는 작업 필수*
	}
	
	public Student(){}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	
	// toString() => 재정의한다 : 오버라이딩
	@Override
	public String toString() {
		return "Student [학생번호= " + number + ", 이름= " + name + ", 영어점수= " + eng + ", 국어점수= " + kor + "]";
	}
	
}
