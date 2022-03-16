package com.prod;

public class Employee {
	//field.
	private int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary; //Employee 클래스 이 외에서는 접근 불가능하다
	
	public void setEmployeeId(int employeeId) { //필드의 private 속성을 사용할 수 없음 -> set~라고 새로운 매소드를 생성하고 새 변수(int emplyeeId)를 만들었다(매개값으로 int형 데이터를 받는 변수).
		this.employeeId = employeeId; // this.employeeId는 필드 속성, 우항은 새로 만든 변수값 -> 같다고 설정하여 employeeid값을 읽을 수 있다.
	}
	
	public int getEmployeeId() { // 읽어오기만 하지 않고 출력을 하고 싶은데 또 private 속성 때문에 출력할 수 없다. -> get~ 이름의 메소드를 하나 더 생성.
		return this.employeeId; //
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getjob() {
		return this.job;
	}
	
	public void setSalary(int salary) {
		if(salary < 0) {
			this.salary = 10000;
		}else {
		this.salary = salary; // 필드를 쓸 때는 this.salary를 사용. 매개변수의 salary와 구분할 수 있다.
		}
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String getEmpInfo() {
		String result = this.employeeName + "의 부서는 " + this.department 
				+ "이고 직무는 " + this.job + "이고 급여는" + this.salary + "입니다.";
		return result;
				}
}
