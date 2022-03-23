package com.edu.collect;

import java.util.List;

public interface StudentService {
	
	public void insertStudent(Student student); //입력.. Student 타입의 매개변수를 설정
	public Student getStudent(int sno); //리턴 타입은 Student.. 한건조회
	public List<Student> studentList();// 전체목록
	public void modifyStudent(Student student); // 한건수정
}
