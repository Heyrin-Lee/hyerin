package com.edu.axcept;

public class LibraryApp {
	public static void main(String[] args) {
//		LibraryEx exe = new LibraryEx(); //인스터스를 설정해서.. 싱글톤은 클래스 외부에서 new 연산자로 생성자를 호출할 수 없다.
		LibraryEx exe = LibraryEx.getInstance(); // singleton이라는 리턴값을 가져오는 변수를 설정
		exe.run(); //LibraryEx 클래스가 가지고 있는 매소드를 호출해서 실행한다.
	}
}
