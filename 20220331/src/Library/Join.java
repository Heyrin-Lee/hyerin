package Library;

public class Join {
	
	private int joinNumber;
	private int joinPassword;
	
	//생성자
	
	public Join() {
		
	}
	
	public Join(int joinNumber, int joinPassword) {
		super();
		this.joinNumber = joinNumber;
		this.joinPassword = joinPassword;
	}

	public int getJoinNumber() {
		return joinNumber;
	}

	public void setJoinNumber(int joinNumber) {
		this.joinNumber = joinNumber;
	}

	public int getJoinPassword() {
		return joinPassword;
	}

	public void setJoinPassword(int joinPassword) {
		this.joinPassword = joinPassword;
	}

	@Override
	public String toString() {
		return "Join [joinNumber=" + joinNumber + ", joinPassword=" + joinPassword + "]";
	}
	
	
	
}
