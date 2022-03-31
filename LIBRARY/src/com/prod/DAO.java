package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() { // 연결매소드
		try {
			Class.forName("oracle.jdbd.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle.thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결 성공!"); // DB연결
		return conn;
	}

	public static void disconnect() { // 리소스반환 매소드
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
