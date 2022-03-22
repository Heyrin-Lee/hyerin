package com.edu.interfaces;

public class MainExe {
	public static void main(String[] args) {
		// 리모콘 -> TV, Radio, 냉장고의 기능을 on/off 한다.
		RemoteControl rm = new TV(); //
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio(); // 객체가 바뀌어도 인터페이스를 통해서 기능을 호출
		rm.powerOn();
		rm.powerOff();
		
		rm = new Refrigerator(); 
		rm.powerOn();
		rm.powerOff();
	}
}
