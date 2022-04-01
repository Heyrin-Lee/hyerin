package Library;

public class Login {
	
	private int adminNumber;
	private int admingPassword;
	private int memberNumber;
	private int memberPassword;
	
	//생성자
	public Login() {
		
	}
	public Login(int adminNumber, int admingPassword) {
		super();
		this.adminNumber = adminNumber;
		this.admingPassword = admingPassword;
	}
	
	public Login(int adminNumber, int admingPassword, int memberNumber, int memberPassword) {
		super();
		this.adminNumber = adminNumber;
		this.admingPassword = admingPassword;
		this.memberNumber = memberNumber;
		this.memberPassword = memberPassword;
	}




	public int getAdminNumber() {
		return adminNumber;
	}

	public void setAdminNumber(int adminNumber) {
		this.adminNumber = adminNumber;
	}

	public int getAdmingPassword() {
		return admingPassword;
	}

	public void setAdmingPassword(int admingPassword) {
		this.admingPassword = admingPassword;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public int getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(int memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Override
	public String toString() {
		return "Login [adminNumber=" + adminNumber + ", admingPassword=" + admingPassword + ", memberNumber="
				+ memberNumber + ", memberPassword=" + memberPassword + "]";
	}

	
	
	
}
