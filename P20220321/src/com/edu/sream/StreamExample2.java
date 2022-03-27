package com.edu.sream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70, 100)); //170
		list.add(new Student("김순희", "여자", 80, 120)); //200
		list.add(new Student("김부식", "남자", 85, 95)); //180
		list.add(new Student("박한나", "여자", 88, 99)); //187
		
		// 남여 상관없이 스코어+포인트>180 학생들만 출력한다
		list //리스트 컬렉션으로부터
		.stream() //스트림 생성
		.filter(student -> student.score + student.point >= 180) //스코어+포인트가 180점 이상인 사람을 걸러내서
		.sorted() //비교대상을 크다,작다로 정한후 //Class에는 크다,작다의 개념이 없다.. Comparable을 구현하는 클래스(=sorted())
		.forEach(student -> System.out.println(student)); // 필터링된 대상을 출력한다
		//forEach(student -> System.out.println(student))
		
		System.out.println("======");
		
		
		//80점 이상인 사람만 
		list // 컬렉션으로부터
		.stream() //스트림 생성(스트림이라는 매소드를 생성)
		.filter(student -> student.score > 80) //80점보다 큰 사람을 걸러낸다..람다표현식..student자리에 매개변수값을 받아서 80점 이상인 사람만 걸러낸다
		.filter(student -> student.gender.equals("여자"))//여자인 사람만
		.forEach(student -> System.out.println(student)); //그 사람들을 출력한다
	}
}
