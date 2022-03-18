package com.dev;

public class Account {
	//계좌번호,예금주,예금액 정보로 예출금 기능
	
	//field
	private String accNo;
	private String accName;
	private int money;
	
	public static String bankName; //static 으로 선언되면 이미 실행 준비가 되어있다. Account a1 = new Account 라는 형식으로 인스턴트를 만들지 않아도 클래스에 소속되어있는 필드와 매소드들은 실행할 준비가 되어있다.
	static {
		bankName = "한일은행";
	}
	 
	public static void showBankName() {
		System.out.println("한일은행입니다.");
	} // 호출할 때는 Account.showBankName();
	
	//인스턴스를 만들 때는 각각 다른 값들을 가질 경우이다. 예를 들면 쉐어하우스(class라고 가정하자).. 주방,거실은 공용(static으로 선언해서 클래서에 소속되어 있어서 여러개 만들 필요가 없게끔.) vs 방1,방2(인스턴스로 만든다).. 필요없는 공간은 줄이겠다는 의미
	//필요한 인스턴스를 만들 때마다 메모리가 커지기 때문에 불필요한 메모리 차지를 줄이기 위해서 static과 인스턴스를 적절히 나눠서 사용한다.
	
	
	//생성자 -> 소스-constructor using field..   
	
	//constructor overloading : 생성자는 여러개 생성 가능 하지만, 똑같은 매개값, 똑같은 데이터 타입을 나란히 놓는 것 등은 만드는 등은 불가능
	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}
	
	public Account(int money) {
		System.out.println("기본생성자 호출");
	}
	
	public Account(String accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}


	// method
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}
	
	
}
