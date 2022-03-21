package com.edu;

public class InheritExample {
	// 학생, 직장인, 친구의 => 정보를 담아놓는 정보(..?)
	// 학생 = 학교, 학년,, 직장인 = 직장명, 직급,, 친구 = 출신지역 
	
	public static void main(String[] args) {
		Students student = new Students(); //현재 Student 클래스의 필드에는 school, grade 밖에 없다.
		student.setName("홍길동"); //공통된 항목을 따로 선언하지 않고 상속만 받아서 기능을 실행할 수 있다.
		student.setAge(15);
		student.setSchool("중앙고");
		student.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("직장인");
		worker.setAge(35);
		worker.setCompany("카카오");
		worker.setJob("개발팀장");
		
		//동일한 부모 클래스를 상속받은 자식 클래스는 "부모클래스의 참조변수(p1)에 자식클래스의 참조변수(student, worker)를 자동형변환이 가능하다." 
		Person p1 = new Person(); 
		p1 = student; //person의 형태로 치환된다. 부모클래스인 person으로부터 상속받았기 때문 *student = worker 는 적용불가능. 같은 부모로부터 상속받았지만 안됨..*
		p1 = worker;
	}
}
