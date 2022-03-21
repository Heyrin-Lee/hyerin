package com.edu;

public class ComFriend extends Friend {
	// 회사: 회사이름, 회사업무 내용을 추가적으로 정리한다.
	
	private String company;
	private String job;
	//public ComFriend() {} 라는 기본생성자가 자동으로 만들어진다(따로 지정하지 않으면).. 기본생성자에서는 부모클래스가 가지고 있는 속성들을 물려받는다.(그것이 super();)
	
	public ComFriend() {
	}
	
	public ComFriend(String name, int age, double height, double weight, String phone, String company, String job) {
		super(name, age, height, weight, phone);
		this.company = company;
		this.job = job;
	
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n"; //부모클래스가 가지고 있는 getName의 값을 가져오겠다.
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		str += "==========<추가정보>==========\n";
		str += "회사이름은 " + this.getCompany() + "이고 \n";
		str += "하는 일은 " + this.getJob() + "입니다. \n";
		return str;
	
	}
}
