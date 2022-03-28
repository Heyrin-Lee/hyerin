package com.edu.collect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// StudentServiceImpl(중첩클래스의 기능을 대체한다)
// 입력, 수정, 삭제한 작업들이 파일에 저장되도록 한다(프로그램을 종료하고 시작하더라도 그대로 남아있다)
public class StudentServiceFile implements StudentService {

	// 필드 선언
	List<Student> list = new ArrayList<Student>();
	File file;

	// 생성자
	// 기본생성자의 파일에 저장되어있는 정보를 읽어서 list 컬렉션에 값을 담아준다
	public StudentServiceFile() {
		try {
			FileReader fr = new FileReader("studentList.data"); //읽어오기 스트림
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
//			readBuffer = br.readLine(); // 리스트 값의 한 라인을 읽어온다
			while((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(","); //101, 홍길동, 80, 90.. ,를 기준으로 값을 하나씩 분리한다.. 그 값들을 contents라는 이름의 배열에 담는다
//				contents[0] <= 101, contents[1] <= 홍길동, contents[2] <= 80, contents[3] <= 90
				list.add( //
					new Student(Integer.parseInt(contents[0]), //문자열 타입을 인트 타입으로 바꾼다(Integer.parseInt.._)
					contents[1], //
					Integer.parseInt(contents[2]),
					Integer.parseInt(contents[3])
					));
			}
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 매소드
	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumber() == sno) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Student> studentList() {
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumber() == student.getNumber()) {
				list.get(i).setEng(student.getNumber()); // 영어점수 수정
				list.get(i).setKor(student.getNumber()); // 국어점수 수정
			}
		}
	}

	@Override
	public void removeStudent(int sno) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getNumber() == sno) {
				list.remove(i);
			}
	}

	@Override
	public List<Student> searchStudent(String name) {
		return null;
	}

	@Override
	public void saveToFile() {
		// 작성했던 ArrayList<Student> list => 파일 저장
		try {
			FileWriter fw = new FileWriter("StudentList.data"); // 기본스트림
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림.. 보조스트림의 생성자의 매개값으로 기본스트림을 넣어준다..

			for (Student stud : list) {
				bw.write(stud.getNumber() + "," + stud.getName()// 
				+ "," + stud.getEng() + "," + stud.getKor() + "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
