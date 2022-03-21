package com.edu;

public class UnivFriend extends Friend {
	// 학교친구: 학교이름, 전공의 정보를 추가적으로 정리한다.
	
	private String university;
	private String major;
	
	
	public UnivFriend() {
		super(); //Friend(); Friend클래스의 생성자를 호출하겠다.. super();는 부모클래스를 호출하는 것
	} //생성자1: 기본 생성자를 호출하거나
	
	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone); //Friend(name, age, height, weight, phone);의 생성자를 호출하겠다.
	} //생성자2: 5개를 호출하거나
	
	public UnivFriend(String name, int age, double height, double weight, String phone, String university, String major) {
		super(name, age, height, weight, phone); //university,major 이외에는 friend 클래스(부모클래스)가 가지고 있는 값
	} //생성자3: 7개를 호출하거나
	
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {String str = "친구의 이름은 " + super.getName() + "이고 \n"; //부모클래스가 가지고 있는 getName의 값을 가져오겠다.
	str += "나이는 " + super.getAge() + "이고 \n";
	str += "연락처는 " + this.getPhone() + "입니다. \n";
	str += "==========<추가정보>==========\n";
	str += "학교이름은 " + this.getUniversity() + "이고 \n";
	str += "전공은 " + this.getMajor() + "입니다. \n";
	return str;
	}
	
	
	
}
