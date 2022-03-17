package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudentEx {
	public static void main(String[] args) {
		// Scanner, 배열선언 5개, 입력, 리스트 출력.
		
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5]; //배열선언 5개. 
		
		while(true) {
			System.out.println("1.입력 2.리스트 3.종료"); //메뉴 메시지 출력
			System.out.println("선택>");
			int menu = scn.nextInt(); //메뉴 입력
			if(menu == 1) {
				//입력기능구현.. 학번,이름,영어,수학,국어 값을 입력받음 => Student타입의 instance를 만들어서 배열에 담아보는 기능을 구현해본다.
				System.out.println("입력기능구현");
				
				System.out.print("학번을 입력하세요> "); //print에 ln이 없으면 줄바꿈 없음. 바로 옆에 입력 가능.
				int sno = scn.nextInt();
				System.out.print("이름을 입력하세요> ");
				String sname = scn.next();
				System.out.print("국어점수를 입력하세요> ");
				int kscore = scn.nextInt();
				System.out.print("수학점수를 입력하세요> ");
				int mscore = scn.nextInt();
				System.out.print("영어점수를 입력하세요> ");
				int escore = scn.nextInt();
				
				Student s1 = new Student(sno, sname, kscore, mscore, escore );
				
				for(int i=0; i<students.length; i++) {
					if(students[i] ==null) { //i 값이 null인지 체크->null이면 한 값만 넣고 break로 빠져나온다.
						students[i] = s1;
						break;
					}
 				}
				System.out.println("저장완료");
				
			} else if(menu ==2) {
				System.out.println("리스트기능구현");
				for (int i=0; i<students.length; i++) {
					if (students[i] != null) {
						System.out.println(students[i].getStudInfo());
					}
				}
				
				
				
				
//				System.out.println("이름을 입력하세요> ");
//				String sname = scn.next();
//				System.out.println("영어점수를 입력하세요> ");
//				int escroe = scn.nextInt();
//				System.out.println("국어점수를 입력하세요> ");
//				int kscroe = scn.nextInt();
//				System.out.println("수학점수를 입력하세요> ");
//				int mscroe = scn.nextInt();
				//리스트 기능 구현
				
				System.out.println("조회완료");
			} else if(menu ==3) {
				//종료..
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("메뉴를 잘못 선택했습니다."); //1,2,3 이외의 숫자를 입력하면 메시지 출력
			}
		} 
		
		System.out.println("end of program");
	}
}
