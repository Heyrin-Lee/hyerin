package com.prod;

public class Car {
	// 모델, 현재속도, 최고속도, 가속(현재 속도를 10km씩 증가시키는 기능), 
	//감속(현재속도를 10km씩 감소시키는 기능), 현재속도를 보여주는 기능
	
	private String model;
	private int speed;
	private int maxSpeed;
	
	
	
	
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if (this.speed + 10 >= this.maxSpeed) { // 현재 속도에 10km를 더했더니 maxSpeed보다 크다면
			System.out.println("최고속도를 초과할 수 없습니다.");
			return; // if 조건문에 대하여 true이고 return을 만나면 그 뒤의 명령문은 실행되지 않는다.
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
	}
	
	public void breakSpeed() {
		if (this.speed - 10 >= this.breakSpeed) {
			System.out.println("최저속도보다 느립니다.");
			return;
		}
		System.out.println("10km 감속합니다.");
		this.speed -=10;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
