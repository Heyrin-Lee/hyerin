package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable { // Runnable은 인터페이스이기 때문에 생성자를 바로 호출할 수 없다 -> 인터페이스를 구현하는 클래스를 생성해서

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // beep음을 발생시키는 매소드
			try {
				Thread.sleep(500); // 0.5초 간격으로 소리를 나게 한다. (예외처리를 해줘야한다)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

//process(main이라는 스레드를 만들었다..그것은 싱글스레드..)
public class BeepPrintExample {
	public static void main(String[] args) {
		
		// 스레드를 생성하는 방법
		//스레드의 생성자의 매개값으로(new BeepTask()..아무것도 없는 매개값) Runnable을 구현한 객체 
//		Thread thread = new Thread(new BeepTask());
//		Thread thread = new Thread(new Runnable() { // 구현해야할 식이 하나뿐이라 람다표현식으로 가능
			

//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep(); // beep음을 발생시키는 매소드
//					try {
//						Thread.sleep(500); // 0.5초 간격으로 소리를 나게 한다. (예외처리를 해줘야한다)
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
		// Thread클래스의 생성자 매개값으로 활용.. 스레드를 새로 하나 만들었다
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep(); // beep음을 발생시키는 매소드
				try {
					Thread.sleep(500); // 0.5초 간격으로 소리를 나게 한다. (예외처리를 해줘야한다)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	});
		
		thread.start(); //스레드 시작
		
		for(int i=0; i<5; i++) { //beep음 출력
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
