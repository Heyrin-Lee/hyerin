package com.edu.sream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;

	// 생성자
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	
	//생성자(필드에 point를 추가해서 포함된 생성자)
	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student student) { //인터페이스를 구현하는 Student라는 클래스에 대한 추상매소드..Student student 는 비교대상
		//this 와 student 비교: this, student 순으로 출력하고싶다=오름차순=>음수.. 비교하는 대상(student)이 먼저 오면 내림차순=>양수
//		if(this.score < student.score) { //score를 기준으로 작은값이 앞에온다.
//			return -1;
//		} else {
//			return 1;
//		}
		return (this.score + this.point) - (student.score + student.point); //ex. 60점(this),70점 => 음수.. this값에서 비교대상(student)를 뺏을 때 음수가 나오면 오름차순으로 출력한다.
		                                   // 뺏을 때 양수가 나오면 내림차순으로 출력한다
	}
	

}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70));
		list.add(new Student("김순희", "여자", 80));
		list.add(new Student("김부식", "남자", 85));
		list.add(new Student("박한나", "여자", 88));

		// 평균 구하기
		int sum = 0, cnt = 0;
		double avg = 0;
		for (Student student : list) { // 콜렉션에 들어있는 타입과 같아야 한다
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}
		avg = sum / (double) cnt;
		System.out.println("컬렉션 평균: " + avg);
		
		// stream
		Stream<Student> stream = list.stream(); // 스트림 생성
		OptionalDouble od = stream.filter((s) -> s.gender.equals("남자")).mapToInt(s -> s.score).average(); // Student 값들 중에서 score라는 항목들을 뽑아내서 average를 통해 평균을 구한다
		avg = od.getAsDouble();
		System.out.println("스트림 평균: " + avg);
//		stream.forEach(new Consumer<Student>() { // 스트림에 들어있는 각각의 요소들에 대해서 ()안에 입력된 기능을 수행하도록 한다.. foreach라는 매소드에 consumer<Student>라는 매개값(기능)을 가져왔다.
//
//			@Override
//			public void accept(Student t) {
//				System.out.println("이름: " + t.name + "성별: " + t.gender + "점수: " + t.score); // 기능 구현
//
//			}
//		});

		//stream은 일회용.. 위에서 stream을 써서 결과값이 나왔으니까 한번 더 쓰면 오류..
//		stream.forEach((Student t) -> { 
//			System.out.println("이름: " + t.name + "성별: " + t.gender + "점수: " + t.score);
//		}); // 람다표현식
	}
}
