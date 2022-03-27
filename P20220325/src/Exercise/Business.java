package Exercise;

public class Business extends Employee {
	// 영업부장 이름
	//field
	private String bhead;

	// 생성자
	public Business(int employeeId, String employeeName, String phone, String bhead) {
		super(employeeId, employeeName, phone);
		this.bhead = bhead;
	}
	
	//get,set 매소드
	public String getBhead() {
		return bhead;
	}


	public void setBhead(String bhead) {
		this.bhead = bhead;
	}

	//Business 클래스에 대한 toString을 재정의하여 유의미한 출력값을 내보낸다
	@Override
	public String toString() {
		String bhead = "영업부장 이름: " + this.getBhead();
		return bhead;
	}
	
	
}
