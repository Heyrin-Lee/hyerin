package co.edu.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	Connection conn; //자바에서 제공해주는 클래스,,인터페이스,,
	 Statement stmt;  //안에 executeQuery, executeupdate 등이 들어있는데 이 매소드들을 사용하려고
	 ResultSet rs; 	 //conn, stmt 등 변수를 선언해서 필요할 때 매소드를 호출하여 사용한다
	 PreparedStatement psmt; 
	
	public Connection getConnect() { //연결 매소드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.66:1521:xe", "hr", "hr"); //db주소,id,password를 통해서 DB에 접속한다.. 리턴 타입은 Connection
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
