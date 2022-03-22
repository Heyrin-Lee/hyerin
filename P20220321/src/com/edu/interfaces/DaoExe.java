package com.edu.interfaces;

public class DaoExe {
	public static void main(String[] args) {
		Dao dao = new MySqlDao(); //new OracleDao(); // OracleDao 라는 인스턴스를 하나 생성
		
		dao.select();
		
		dao.insert();
		
		dao.update();
		
		dao.delete();
	}
}
