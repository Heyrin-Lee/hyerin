package com.dev;

import com.edu.Student;

public class GugudanEx {
	
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int sum(int[] ary) {
		//배열매개변수의 각 요소의 합을 구하는 메소드.
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	public static double divide(int n3, int n4 ){
		if (n3 == 0) {
			return 0;
		}
		return n3 / (double) n4;
	}
	
	public static void gugudan(int dan) {
		System.out.println(dan + "단");
		for (int i=1; i <=9; i++) {
				System.out.println(dan + "*" +i + "=" +(dan * i));
			
		}
	}
	
	public static void printStar(int count, String shape) { //메소드를 만들어서 ,, int count로 입력된 숫자만큼 별 출력
		for (int i=0; i< count; i++ ) {
			System.out.print(shape);
		}
		
	}
	
	public static void printGugudan() { //메소드를 만들었으니까
		for(int j = 1; j <= 9; j++ ) {
			int cnt = j;
//			System.out.println(cnt + "단 입니다.");
			for(int i=2; i<=9; i++) {
				System.out.printf("%2d*%2d=%2d ", i ,cnt , ( i * cnt)); //""안에 i를 넣으면 문자열로 인식하기때문에 따로 빼준다.
				}
			System.out.println();
			///
		}
		
	}//end of priintGugudan()
	
	public static void getScore() { //여기에 static을 붙여도 바로 실행되지는 않는다.
		
		
		
		
	}
	public static void main(String[] args) { //new로 초기화하지 않아도 메모리를 읽어들이는 준비가 완료되어 실행이 가능하다. static = 정적 
		printGugudan(); //메소드 이름만 호출해서 실행시킨다.
		
		for(int i=1; i<=5; i++) {
			printStar(i, "★");
			System.out.println();
			
			gugudan(3);
		}
		
		int result = sum (sum(10,20), sum(5,7));
		int[] newAry = {10,20,30};
		result = sum(newAry);
		System.out.println("결과는 " + result);
		
		//나누기 메소드(int, int) 반환되는 값은 double 타입으로. 나누는 값이 0이 들어오면 0을 리턴한다. 메소드 이름은 double 타입의 devide
		System.out.println(divide(10,4));
				
		
		
		
//		printStar(10, "★"); //메소드 이름만 호출해서 실행시킨다.
		// 메소드를 실행하려면 new 클래스이름 ();로 인스턴스를 만들어야했다. ex) Student s1 = new Student(); 
//		Student.callStatic(); //Student.java에 있는 //메소드 부분에서 클래스를 만든 걸로 호출한다.
		
		
	} // end of main()
}
