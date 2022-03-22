package com.edu.interfaces;

public class Computer implements RemoteControl {
	private String cpu;
	private String memory;
	
	
	
	// implements ~ 를 사용하려면 아래의 기능은 무조건 수행되어야 하기 때문에 추가되었다.
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 끕니다.");
	}

}
