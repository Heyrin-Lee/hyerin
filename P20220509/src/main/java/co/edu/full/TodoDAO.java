package co.edu.full;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		//리스트
		public List<TodoVO> getlist() {
			String sql = "select * from todo";
			getConnect();
			List<TodoVO> list = new ArrayList<>();
			try {
				psmt = conn.prepareStatement(sql);
				rs= psmt.executeQuery();
				while(rs.next()) {
					TodoVO vo = new TodoVO(rs.getString("title"));
					list.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disConnect();
			}
			return list;
		}	
		//한건 입력
		public void insertTodo(TodoVO vo) {
			String sql = "insert into todo (title) values(?)";
			getConnect();
			try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
			}catch(SQLException e) {
				e.printStackTrace();
			}finally{
				disConnect();
			}
		}
		//한건 삭제
		public void deleteTodo(String title) {
			String sql = "delete from todo where title = ?";
			getConnect();
			try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
			}catch(SQLException e) {
				e.printStackTrace();
			}finally{
				disConnect();
			}
		}
		
		
		public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.66:1521:xe", "hr", "hr"); //db주소,id,password를 통해서 DB에 접속한다.. 리턴 타입은 Connection
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			}
		}
		public void disConnect() {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(psmt!=null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

