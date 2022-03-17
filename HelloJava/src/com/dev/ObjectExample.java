package com.dev;

import java.util.Scanner; //자바에서 만들어놓은 메소드

import com.edu.Student; // com.edu 라는 꾸러미에 Student 라는 클래스를 우리가 설정했어.

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		Student s1 = new Student(100, "이가영"); 
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setKorScore(100); //set 메소드를 써서 값을 지정한 것.
		s1.setEngScore(60);
		s1.setMathScore(80);
		
		Student s2 = new Student(101, "이혜린", 80, 82, 85); //모든 매개변수를 받는 생성자를 바탕으로 필드의 값을 지정할 수 있다,, 이러한 매소드를 호출하려면 이 형태와 똑같이 만들어져있는 생성자가 있어야한다.  
		System.out.printf(s2.getStudName() + "의 평균: %.2f " , s2.getAvgScore());
		System.out.println();
		
		//생성자의 역할은 인스턴스를 만드는 시점에 초기화를 한다. set메소드를 써서 값을 지정해도 상관없다. 두 방법의 결과는 같다. 하지만 생성자를 통한 방법이 코드를 더욱 간결하게 쓸 수 있다.
		
		Student s3 = new Student(102, "서현일", 70, 80, 90);
		Student s4 = new Student(103, "최규완", 77, 82, 83);
		
		Student[] students = {s1, s2, s3, s4};
		
		while(true) {
		System.out.println("조회하려는 학생의 이름: (ex.홍길동) ");
		String searchName = scn.next();
		if(searchName.equals("종료")) {
			break;
		}
		
		for(int i=0; i<students.length; i++) {
			if(students[i].getStudName().equals(searchName)) {
			System.out.println(students[i].getStudInfo());
		}
		
		
		//private / public / default 접근가능의 차이점: private 은 외부에서 접근 제한, public 은 어디에서나 접근 가능, default는 같은 패키지 안에서만 접근 가능
		
//		Scanner scn = new Scanner(System.in); //인스턴스
		scn.nextInt(); // 자바에서 만들어놓은 메소드
			}
		}
		System.out.println("end of program");
	}
}
