package com.edu.collect;

import java.util.List;

public interface StudentService {
	// 기능에 대한 정의만 해두었다(추상매소드). 기능 구현에 대한 설명은 StudentService 기능을 구현하는 클래스에서 작성한다
	public void insertStudent(Student student); //입력.. Student 타입의 매개변수를 설정
	public Student getStudent(int sno); //리턴 타입은 Student.. 한건조회
	public List<Student> studentList();// 전체목록
	public void modifyStudent(Student student); // 한건수정
	public void removeStudent(int sno); //한건 삭제.. 리턴값이 필요->void X
	public List<Student> searchStudent(String name); // 이름으로 조회.. 같은 이름이 있을수도 있기 때문에 여러건으로 반환될 수 있다는 list를 사용
}
