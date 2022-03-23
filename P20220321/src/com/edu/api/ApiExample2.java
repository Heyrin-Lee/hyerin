package com.edu.api;

public class ApiExample2 {
	public static void main(String[] args) {
		
		Math.random(); 
		long result = Math.round(3.5);
		System.out.println("3.5의 반올림: " + result);
		double r1 = Math.ceil(3.1); //ceil 은 올림
		System.out.println("3.1의 올림 " + r1);
		r1 = Math.floor(3.9); //fLoor은 내림
		System.out.println("3.9의 내림: " + r1);
		Math.abs(-30); //abs는 절대값
		System.out.println("end of prog");
	}
}
