package com.edu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFileExample {
	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>(); //student.txt에 저장한 값을 list라는 컬렉션에 add라는 매소드로 담는다
	
	public static void main(String[] args) {
//		try {  //writeStudent 메소드가 있으니까 주석 처리
//			FileWriter fw = new FileWriter("student.txt");
//			BufferedWriter bw = new BufferedWriter(fw); //생성자의 매개값(fw)
//			
//			while(true) {
//				System.out.println("이름을 입력하세요.");
//				String name = scn.next();
//				if(name.equals("stop")) {
//					break;
//				}
//				bw.write(name+ "\n"); //write 매소드(리소스)
//			}
//		
//			
//			bw.close(); //리소스 썼으면 반환
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		 writeStudent(); //입력
		readStudent(); //출력 //텍스트 101 홍길동 30 50 => new Student(101, 홍길동, 30, 50) Student 클래스에 담음
		
//		for(Student student: list) {
//			System.out.println(student.toString());
//		}
		System.out.println("end of prog");
	}// end of main method
	
	public static void readStudent() {
		try {
			FileReader fr = new FileReader("Student.txt");
			BufferedReader br = new BufferedReader(fr); //읽어오는 용도
			String readStr = null; //읽어온 값을 담는다
			while((readStr = br.readLine()) != null) { //readLine() 라인단위로 읽어온다
			String[] contents = readStr.split(" "); // 101 Hong 20 30 읽어온 문자열에서 각각의 값을 문자열 배열에 담는다.. [0]=학생번호, [1]=이름...//split은 라인을 요소요소로 나눠서 문자열 배열에 담아준다(공백을 기준으로 자르기로 했기 때문에 "" 사이에 공백을 비워줘야 한다
			list.add(	new Student(Integer.parseInt(contents[0]) //문자열 101을 숫자로 바꿔준다..(101은 숫자로 표현되어야 하니까)
			,contents[1]//
			,Integer.parseInt(contents[2])//
			,Integer.parseInt(contents[3])));
				
//			System.out.println(readStr);
			}
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw); //생성자의 매개값(fw)
			
			while(true) {
				System.out.println("이름을 입력하세요.101 Hong 20 30");
				String name = scn.nextLine(); // 한 라인 전체를 읽어온다
				if(name.equals("stop")) {
					break;
				}
				bw.write(name+ "\n"); //write 매소드(리소스)
			}
		
			bw.close(); //리소스 썼으면 반환
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
