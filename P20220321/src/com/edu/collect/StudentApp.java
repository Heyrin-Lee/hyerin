package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	// 필드
	List<Student> list = new ArrayList<Student>(); // list에 값을 담고 여기에 담긴 값들을 불러올것임 : list는 저장을 위한 바구니
	Scanner scn = new Scanner(System.in);

	// 멤버클래스
	class StudentServiceImpl implements StudentService { // 클래스 안에 선언돼있는 클래스는 list에 자유롭게 접근가능하므로 중첩클래스를 사용하였다

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) { // 학생번호로 한 건만 조회
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNumber() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() { // 전체 학생정보 조회
			return list;
		}

		@Override
		public void modifyStudent(Student student) { // 수정.. 학생번호를 기준으로 변경
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getNumber() == student.getNumber()) {
					list.get(i).setEng(student.getNumber()); //영어점수 수정
					list.get(i).setKor(student.getNumber()); //국어점수 수정
				}
			}
		}

	} // end of StudentServiceImpl

	public void execute() {
		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 9.종료
		// 기능들을 저장할 공간 컬렉션 생성 필요
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 9.종료");
			System.out.print("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while()
		System.out.println("end of program");
	}
}
