package Exercise;

public class Employee {
	// 직원 번호, 이름, 연락처
	private int employeeId;
	private String employeeName;
	private String phone;
	
	//생성자
	public Employee(int employeeId, String employeeName, String phone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.phone = phone;
	}
	
	//기본 생성자
	public Employee(){}

	
	// field가 private으로 설정되어 있기 때문에 외부에서 객체를 가져올 방법은 getInstance 뿐이다. 그러므로 get,set, 매소들ㄹ 설정하였다
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// toString을 재정의하여 리턴값이 주소값이 아닌 유의미한 결과값을 출력한다
	@Override
	public String toString() {
		return "Employee [직원 번호=" + employeeId + ", 직원 이름=" + employeeName + ", 직원 연락처=" + phone + "]";
	}
	
	
}
