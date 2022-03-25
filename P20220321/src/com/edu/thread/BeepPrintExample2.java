package com.edu.thread;

import java.awt.Toolkit;

class BeepThread extends Thread  { //Thread 클래스를 상속받는 클래스를 새로 하나 만든다

	@Override
	public void run() { //run이라는 매소드 재정의
	Toolkit toolkit = Toolkit.getDefaultToolkit(); 
	for (int i = 0; i < 5; i++) {
		toolkit.beep(); // beep음을 발생시키는 매소드
		try {
			Thread.sleep(500); // 0.5초 간격으로 소리를 나게 한다. (예외처리를 해줘야한다)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		super.run();
	} 
	
}

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//beep음 생성
		//Thread 클래스를 상속받는 클래스를 선언. run 매소드를 override 기능구현(재정의)
		Thread thread = new BeepThread(); //Thread 클래스를 상속받아서 BeepThread라는 클래스 생성
		thread.start();
		
		
		//beep음 출력
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500); //예외처리를 해줘야한다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of prog");
	}
	
}
