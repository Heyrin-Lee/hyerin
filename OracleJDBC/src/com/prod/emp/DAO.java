package com.prod.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB 연결처리, 연결해제
public class DAO {
	
	// DriverManager
	 Connection conn;
	 Statement stmt;
	 ResultSet rs;
	 PreparedStatement psmt; 
	
	public Connection getConnect() { //연결 매소드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); //db주소,id,password를 통해서 DB에 접속한다.. 리턴 타입은 Connection
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("연결 성공!"); //DB 연결
		return conn;
	}
	
	public void disconnect() { //리소스 반환 매소드
		try {
			if (rs != null)
				rs.close();
			if(stmt != null) 
				stmt.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
