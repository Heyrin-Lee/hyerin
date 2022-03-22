package com.edu.interfaces;

public class TV implements RemoteControl { //RemoteControl 인터페이스에서 만든 기능을 무조건 구현하세요.. TV는 구현객체
	public void powerOn() {
		System.out.println("TV를 켭니다.");
	}
	public void powerOff() {
		System.out.println("TV를 끕니다.");
	}
}
