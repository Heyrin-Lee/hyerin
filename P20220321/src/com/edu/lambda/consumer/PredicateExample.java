package com.edu.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	String name;
	String gender;
	int score;

	// 생성자
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

}

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Student> pridic = new Predicate<Student>() {

			@Override
			public boolean test(Student t) { // test라는 추상매소드가 존재한다

				return t.gender.equals("남자"); // 추상매소드 안에서 변수는 t이다. t.gender.equals("남자")의 결과는 true/false로 나온다
			}
		};
		double avg = avg(pridic);
		System.out.println("남학생의 평균: " + avg);
		pridic = (s) -> s.gender.equals("여자");
		avg =avg(pridic);
		System.out.println("여학생의 평균: " + avg);
	}

	public static double avg(Predicate<Student> pred) { // 남자여자 구분하는 기능을 매개변수 자리에 온다
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70));
		list.add(new Student("김순희", "여자", 80));
		list.add(new Student("김부식", "남자", 85));
		list.add(new Student("박한나", "여자", 88));

		int cnt = 0; // 여자가 몇 명인지 남자가 몇 명인지 카운트
		int sum = 0; // 학생들의 합을 선언
		double avg = 0;

		for (Student student : list) {
			if (pred.test(student)) { // pred 기능은 T/F 로 구분하는데 참이라면,
				cnt++;
				sum += student.score;
			}
		}
		avg = sum / (double) cnt;
		return avg;
	}
}
