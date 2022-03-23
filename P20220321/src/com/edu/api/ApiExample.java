package com.edu.api;

public class ApiExample {
	public static void main(String[] args) {
		
		IDCheck idcheck = new IDCheck();
		String result = idcheck.getGender("123456 2546875");
		
		System.out.println(result);
		System.out.println("end of prog");
	}
}
