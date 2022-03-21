package com.edu;

public class Person { //extends Object 라는 부모클래스가 생략되어있다. 이 클래스는 최상위클래스이며 자동생성된다.. { //class의 멤버=필드, 생성자, 메소드
	//필드 person이라는 속성을 담고있다.
	// 이름, 나이, 키, 몸무게
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//생성자.. 인스턴스를 만들때 값들을 초기화해주는 역할이다.
	public Person() {
		
	}
	//오버로딩.. 같은 인스턴스를 중복하여 생성하는 것(중복선언)
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드.. private으로 속성들을 숨겨버렸으니까 메소드를 통해서 접근,기능하도록 하는 것이다.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
