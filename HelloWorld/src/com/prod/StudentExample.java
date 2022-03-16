package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //초기화
		s1.korScore = 80;
		s1.engScore = 95;
		s1.studentName = "홍길동"; //값 담기
		
		s1.study("영어"); //student.java에 있는 "공부를 합니다" 메시지 기능 호출하여 출력
		s1.eat("급식"); // "급식" <- 매개값
		s1.eat("간식");
		s1.eat("초콜렛");
		
		int v1 = s1.getkorScore();
		System.out.println(v1);
		int v2 = s1.getengScore();
		System.out.println(v2);
		
		System.out.println("국어점수: " + v1 + ", 영어점수: " + v2);
		}
	}

