package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	// 필드
	List<Student> list = new ArrayList<Student>(); // list에 값을 담고 여기에 담긴 값들을 불러올것임 : list는 저장을 위한 바구니
	Scanner scn = new Scanner(System.in);

	// 생성자
		public StudentApp() {
			
		}
//	public StudentApp() {
//		list.add(new Student(101, "권가희", 50, 60)); // StudentApp의 생성자를 만든 후, 리스트에 값을 넣어놓는다
//		list.add(new Student(102, "유해정", 60, 70));
//		list.add(new Student(103, "이유빈", 70, 80));
//		list.add(new Student(104, "권가희", 80, 60));
//	}

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
				if (list.get(i).getNumber() == student.getNumber()) {
					list.get(i).setEng(student.getNumber()); // 영어점수 수정
					list.get(i).setKor(student.getNumber()); // 국어점수 수정
				}
			}

		}

		@Override
		public void removeStudent(int sno) { // 삭제
			for (int i = 0; i < list.size(); i++)
				if (list.get(i).getNumber() == sno) {
					list.remove(i);
				}

		}

		@Override
		public List<Student> searchStudent(String name) { // 이름으로 조회.. 똑같은 이름이 있으면 그 이름들을 조회
			List<Student> searchList = new ArrayList<Student>(); // searchList 라는 변수를 만들어서 그 안에 list 값들을 반복하면서 같은 이름이
																	// 있는지 찾고, 있으면 변수에 담는다
			// 찾았다고 끝이 아니다(종료하지 않는다)
			for (int i = 0; i < list.size(); i++) {
				// 같은 이름이 있는지 찾아보고 있으면 searchList.add()에 같은 이름만 계속 담는다
				if (list.get(i).getName().equals(name)) { // 클래스끼리 비교할 대는 연산자를 쓸 수 없다.equals!!(==와 같이 연산기호를 쓸 때는 0이거나 null등..)
					searchList.add(list.get(i)); // 리스트에서 가져온 i의 값(name)을 저장한다
				}
			}
			return searchList;
		}

		@Override
		public void saveToFile() {
			System.exit(0);
		}

	} // end of StudentServiceImpl
	
	// 메인기능을 담당하는 execute()
	public void execute() { // StudentExe 클래스에서 호출하여 사용하기 위한 기능들을 이 곳에 작성한다
		StudentService  service = new StudentServiceFile();	// StudentService는 인터페이스, StudentServiceimpl은 구현기능.. 왜
		    												// StudentService타입으로 정했는가..? list 이외에 다른 클래스에서도 기능을 생성할 때
															// StudentSerivce에 저장한 파일을 사용할 수 있는데(저장공간이 리스트에서 파일로 바뀌는
															// 것이다) 그 때 구현객체(~impl)만 변경해주면 된다
		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 9.종료
		// 기능들을 저장할 공간 컬렉션 생성 필요
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 5.삭제 6.이름조회 9.종료");
			System.out.print("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보를 한 건 추가 입력하는 공간(필요:학생번호, 이름, 영어, 국어점수)
				System.out.println("학생번호 입력>> ");
				int stuNo = scn.nextInt();
				System.out.println("학생이름 입력>> ");
				String name = scn.next();
				System.out.println("영어점수 입력>> ");
				int engScore = scn.nextInt();
				System.out.println("국어점수 입력>> ");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, name, engScore, korScore); // 인스턴스 생성
				service.insertStudent(s1);
			} else if (menu == 2) {
				List<Student> list = service.studentList(); //service.studentList()의 상태는 정리되어 있지 않고 그냥 담겨져있기만 한 상태이다. 그런 상태를 List<Student>형태의 list라는 변수에 담으면 정리돼서 첫번째,두번째와 같이 목록화된다
				for (Student s : list) { // 확장for.. list에 담긴 값만큼 반복한다..s는 list에 담긴 값의 변수를 새롭게 설정한 것(..),, 위에서 목록화로 만든 리스트의 값을 담긴 값만큼 반복해서
					System.out.println(s.toString());// 하나씩 뿌려준다
				}
			} else if (menu == 3) { // 한건 조회.. 조회 기준은 학생번호로 한다
				System.out.println("조회할 학생번호 임력>> ");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo); // 동일한 타입(Student)의 변수로 학생번호를 받는다
				if (student == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(student.toString());
				}

			} else if (menu == 4) {
				System.out.println("수정할 학생번호 입력>> ");
				int stuNo = scn.nextInt();
				System.out.println("영어점수 입력>> ");
				int engScore = scn.nextInt();
				System.out.println("국어점수 입력>> ");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, null, engScore, korScore); // 인스턴스 생성.. 이름은 수정할 필요 없으니까 null로 지정
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) {
				System.out.println("삭제할 학생번호 입력>> ");
				int stuNo = scn.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getNumber() == stuNo) {
						service.removeStudent(stuNo);
						System.out.println("삭제가 완료되었습니다.");
					} else {

					}
				}

			} else if (menu == 6) {
				System.out.println("조회할 학생이름 입력>> ");
				String name = scn.next();
				List<Student> list = service.searchStudent(name);
				for (Student n : list) {
					System.out.println(n.toString());
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				service.saveToFile();
				break;
			}
		} // end of while()
		System.out.println("end of program");
	}
}
