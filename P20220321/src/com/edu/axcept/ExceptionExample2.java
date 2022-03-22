package com.edu.axcept;

import java.util.Calendar;
import java.util.Scanner;

//class String2 extends String {
	// public final String{} //클래스에 final이 붙으면 해당 클래스는 더 이상 상속불가능 하도록 선언하는 역할 
//} 

public class ExceptionExample2 {
	public static void main(String[] args) {
		
		// Object(최상위 클래스)
		Object obj = new String(); //object가 가지는 클래스를 obj는 다 가지고 있다.
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드: " + obj.hashCode());
		
		// Exception.. 이것도 예외처리이다.. 컴파일하는 시점에 예외를 처리해줘야 하는 것이다.(어떤 예외가 발생할지 모른다)
		try {
		Class.forName("java.lang.String");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
		
		// RuntimeException..
		String str = null;
		try {
			str.charAt(0); // CharSequence interface의 추상메소드
			System.out.println(str.toString()); 
		} catch (NullPointerException e) { 
			System.out.println("널포인트 예외발생.");
			e.printStackTrace();
		}
		
		String nums1 = "100"; // 숫자인 문자열을 int 타입으로 바꿔야할 때
		String nums2 = "200";
		int num1, num2;
		try { // nums1 = "백" nums2 = "이백" 등의 오류가 발생할 때
			num1 = Integer.parseInt(nums1); // 이렇게 실제 int 타입으로 변경한다.. parseInt를 통해 int 타입으로 변경
			num2 = Integer.parseInt(nums2);
			
			str.charAt(0);
		} catch (Exception e) { //최상위 오류를 선언해주면 모든 오류 처리 가능
			num1 = 0;
			num2 = 0;
//		} catch (Exception e2) { //Exception이 모든 오류 중에서 최상위 오류
			System.out.println("상위의 예외발생..");
		}
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		try {
		showError(); //메인 메소드
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of prog");
	} // end of main()
	
	public static void showError() throws ClassNotFoundException  {
		Class.forName("java.lang.Strings");
		
//		try {
//		Class.forName("java.lang.Strings"); //여기서 예외가 발생하면
//		 catch (ClassNotFoundException e) {
//		e.printStackTrace();	
//	}
//		System.out.println("예외가 발생했습니다."); //예외 처리
	}
	
	
} // end of class
