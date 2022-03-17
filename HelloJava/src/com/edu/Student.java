package com.edu;

public class Student {
	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수 <= 필드정의.
	private int studNo;
	private String studName;
	private int korScore = -1; //실제 0점일 경우를 생각해서, 초기값을 -1로 설정해두었다.
	private int mathScore = -1;
	private int engScore = -1; // 필드 생성.
	
	// 생성자: 필드의 값을 초기화..
	public Student() { //반환되는 타입이 없다-> 메소드의 값이 아니라 위에 public class Student의 생성자로 보기 때문에 반환타입이 없어도 에러가 나지 않는다. 
		this.studNo = 1;
		this.studName = "Nobody";
		this.korScore = 0;
		this.engScore = 0;
	}
	
	Student(int studNo) { //또 다른 생성자 만듦. 인트 타입의 학번을 넣는 매개 변수를 하나 가지고 있다.
		this.studNo = studNo;  //학번의 값을 지정해주는 생성자이다.
	}
	
	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName; //생성자 만듦. 
	}
	
	
	
	
	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	} 
	
	// 메소드..
	public static void callStatic() { //static은 인스턴스를 만들지 않아도 된다.
		System.out.println("정적메소드 실행");
	}
	
	
	// 영어,국어,수학 => 값이 저장됐으면 평균도 구하고싶다.
	
	// 영어,국어,수학 => 값이 저장됐으면 합계점수도 구하고싶다.
	
	public int getSumScore() {
		if(this.korScore != -1 && this.mathScore != -1 && this.engScore != -1) {
			return this.korScore + this.mathScore + this.mathScore;
		}
		return 0; // 합계 점수
	}
	
	
	public double getAvgScore() {
		return this.getSumScore() / 3.0; //this 는 없어도 상관없지만, 써주면 Student의 필드의 점수의 합이라는 것을 더 명확히 해줌.
	}
	
	// 기능(method) => 규칙: 반환값 메소드명 배개변수{  }
	public void setStudNo(int studNo) {   //매소드에서 set~ 는 값을 사용하기만 하고 반환하지 않을 때는 void() 는 실행의 의미. int 타입의 값만 올 수 있다.(=매개변수). private 등 아무것도 없으면 디폴트 접근 지시
		this.studNo = studNo; //this.studNo는 필드에 대한 것. studNo는 매개 변수에 대한 것
	}
	public int getstudNo() { //get~ 은 값을 반환하겠다.
		return this.studNo;
	}
	
	public String getStudName() { // public 접근 지시
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getStudNo() {
		return studNo;
	}
	
	public String getStudInfo() {
		String str = "====================";
		str += "\n 학생이름: " + this.getStudName() + "이고" ; //\n 줄바꿈
		str += "\n 학번: " + this.getstudNo() + "이고";
		str += "\n 평균: " + String.format("%.2f" , this.getAvgScore()) + "이다."; //String.format("%.2f") 소수점 자르기
		str += "\n=====================";
		return str;
	}
}
