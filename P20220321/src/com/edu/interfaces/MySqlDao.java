package com.edu.interfaces;

public class MySqlDao implements Dao { //Dao라는 인터페이스에 따라서 MySqlDao를 구현하도록 하였다.(처리하는 기능은 같지만 코드,객체가 달라진다)

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDB에서 조회합니다.");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDB에서 입력합니다.");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDB에서 수정합니다.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDB에서 삭제합니다.");
	}

	// 상속받은 RemoteControl,Run의 클래스의 기능도 구현해야 한다.
	@Override
	public void powerOn() { 
		// TODO Auto-generated method stub
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
