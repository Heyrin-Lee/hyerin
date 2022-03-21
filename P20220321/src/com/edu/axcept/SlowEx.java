package com.edu.axcept;

public class SlowEx {
	public static void main(String[] args) {
		showInterval("Hello, World");
	}
	
	public static void showInterval(String str) {
		for (int i=0; i<str.length(); i++)
		System.out.print(str.charAt(i)); //입력한 문자를 차례대로 출력. H e l l ...
		try {
			Thread.sleep(300); 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
