package com.edu;

public class Friend extends Person { //person 클래스를 상속받았기 때문에 person의 기능을 그대로 물려받았다
	// 이름, 나이, 키, 몸무게 + 친구 구분하기,, 회사친구: 회사이름, 회사업무 / 학교친구: 학교이름, 전공
	private String phone;

		//public Friend() {} => Person 클래스를 가지고 있는 생성자가 자동으로 만들어지고 호출한다.
	
	public Friend() {
	//기능은 따로 없는 생성자 생성	
	}
	
	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight); //() 안에 있는 매개값으로 이루어져 있는 생성자로 초기화를 한다.
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// overriding => 부모클래스의 메소드를 자식클래스가 그대로 이어받아도 되지만 새롭게 정의할수도 있는 것
	@Override //annotation
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n"; //부모클래스가 가지고 있는 getName의 값을 가져오겠다.
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		return str;
	}
	
	
	
}
