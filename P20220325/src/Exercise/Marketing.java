package Exercise;

public class Marketing extends Employee{
	// 마케팅부장의 이름
	// field
	private String mhead;

	//생성자
	public Marketing(int employeeId, String employeeName, String phone, String mhead) {
		super(employeeId, employeeName, phone);
		this.mhead = mhead;
	}
	
	// 기본생성자
	public Marketing() {
		
	}

	//get,set 매소드
	public String getMhead() {
		return mhead;
	}

	public void setMhead(String mhead) {
		this.mhead = mhead;
	}

	// Marketing 클래스에 대한 toString을 재정의하여 유의미한 출력값을 내보낸다
	@Override
	public String toString() {
		String mhead = "마케팅부장 이름: " + this.getMhead();
		return mhead;
	}
	
	
}
