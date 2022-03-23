package com.edu.collect;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>(); //저장공간 생성
		
		Student s1 = new Student(101, "홍길동", 70, 73);
		Student s2 = new Student(102, "김주환", 80, 85);
		Student s3 = new Student(103, "이재학", 84, 88);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Student result = list.get(0); // 첫번째 학생정보를 변수에 저장
		System.out.println("첫번째 학생: " + result.toString());
		
		list.set(0, new Student(201, "서현일", 90, 92)); //수정한 값을,, 첫번째 인스턴스 자체를 변경한 것
		list.get(0).setKor(100); // 첫번째 인스턴스에 있는 값을 변경한 것.. 인스턴스는 그대로이다.(필드의 값만 바뀐것이다)
		list.get(0).setEng(100);
		
		list.remove(0); //삭제 처리-> 첫 번째 값을 삭제하면 공간을 비워두지 않고 2번째 값이 첫번째 위치를 채운다// 일반배열은 삭제된자리를 null로 인식한다. 
		result = list.get(0); // result 변수에 담아서(get을 해줘야 바뀐 변수의 값을 읽어올 수 있다)
		System.out.println("첫번째 학생: " + result.toString()); // 출력 
	}
}
