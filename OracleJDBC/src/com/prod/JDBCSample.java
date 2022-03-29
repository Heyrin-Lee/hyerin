package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// ojdbc 라이브러리, 오라클DB 연결(DB접속주소,계정(hr),패스워드(hr))를 가져오면 connection객체를 통해서
//query 실행(Statement, PreparedStatement 를 통해서 실행)
public class JDBCSample {
//		DriverManager
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt; 
	
	public static Connection getConnect() { //연결 매소드
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
	
	public static void disconnect() { //리소스 반환 매소드
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
	
	public static void main(String[] args) {
		conn = getConnect();
		
		//query를 실행하기 위해 Statement 생성
		try {
			
			
			//입력.. 사원번호, last_name, 입사일자, 이메일, job_id
			int emp_id = 302;
			String last_name = "홍길동";
			String hire_date = "2020-03-05";
			String email = "kildong@email.com";
			String job = "IT_PROG";
			
			String fn = "kildong";
			String pn = "010-xxxx-7xx4";
			int salary = 8000;
			
			String sql = "delete emp_java "
					+ "where employee_id = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);
			
//			String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n" + "values ("+emp_id+", '"+last_name+"', '"+email+"', '"+hire_date+"', '"+job+"')"; //""사이에 insert 구문이 들어간다
//			int r = stmt.executeUpdate(sql); //조회할 경우는 exectueQuery();  ..  입력,수정,삭제할 경우는 executeUpdate();
//			System.out.println(r + "건 입력되었습니다.");
			int r = psmt.executeUpdate(); //prepare~은 생성하는 시점에 sql query를 만든다.-> execute 할 때 넣어주지 않아도 된다.. Statement일 경우에는 execute 할 때 넣어줘야 한다
					System.out.println(r + "건 삭제되었습니다.");
			
			
//			//조회
//			rs = stmt.executeQuery("select * from emp_java order by employee_id");
//			while(rs.next()) { 		//next() 매소드: 가져올 데이터가 있는지 물어보고 있으면 데이터 한 건 가져온다
//				System.out.println("사원번호: " + rs.getInt("employee_id")); //employee_id 에 있는 데이터를 가져오도록 한다(예제에서 가져올 데이터의 타입은 int이니가 getint)
//				System.out.println("이름: " +  rs.getString("first_name"));
//			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		disconnect();
	}
}
