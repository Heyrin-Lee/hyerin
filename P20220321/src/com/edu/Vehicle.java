package com.edu;

public class Vehicle {
	
	private int maxSpeed; //필드 선언
	
	public Vehicle() {
		this.maxSpeed = 100;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public void run() { //run 이라는 기능
		System.out.println("탈것이 달립니다.");
	}
	
	public void stop() { //stop 이라는 기능
		System.out.println("탈것이 멈춥니다.");
	}



	@Override
	public String toString() {
		String vehi = "최고속도: " + this.maxSpeed;
		return vehi;
	}

}
