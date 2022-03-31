package com.prod;

public class Member {
	private int memNumber;
	private int memPassword;
	private int admNumber;
	private int admPassword;
	
	//생성자
	public Member(int memNumber, int memPassword, int admNumber, int admPassword) {
		super();
		this.memNumber = memNumber;
		this.memPassword = memPassword;
		this.admNumber = admNumber;
		this.admPassword = admPassword;
	}
	
	public Member() {
		
	}

	public int getMemNumber() {
		return memNumber;
	}

	public void setMemNumber(int memNumber) {
		this.memNumber = memNumber;
	}

	public int getMemPassword() {
		return memPassword;
	}

	public void setMemPassword(int memPassword) {
		this.memPassword = memPassword;
	}

	public int getAdmNumber() {
		return admNumber;
	}

	public void setAdmNumber(int admNumber) {
		this.admNumber = admNumber;
	}

	public int getAdmPassword() {
		return admPassword;
	}

	public void setAdmPassword(int admPassword) {
		this.admPassword = admPassword;
	}
	
	
}
