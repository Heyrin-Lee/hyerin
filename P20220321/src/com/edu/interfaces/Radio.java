package com.edu.interfaces;

public class Radio implements RemoteControl {
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Radio를 끕니다.");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 켭니다.");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 끕니다.");
	}
	
	
}
