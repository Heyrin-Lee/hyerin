package com.edu.interfaces;

public class OracleDao implements Dao { //인터페이스Dao에 있는 기능을 받아 구현하는 클래스.. 구현 객체

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 조회합니다.");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 입력합니다.");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 수정합니다.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 삭제합니다.");
	}

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
