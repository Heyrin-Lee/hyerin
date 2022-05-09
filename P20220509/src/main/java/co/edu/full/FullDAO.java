package co.edu.full;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	//리스트
	public List<FullVO> getlist() {
		String sql = "select * from full_calendar";
		getConnect();
		List<FullVO> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs= psmt.executeQuery();
			while(rs.next()) {
				FullVO vo = new FullVO(rs.getString("title") //title
					,rs.getString("start_date")	//start
					,rs.getString("end_date")	//end
						);
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
	public void insertSchedule(FullVO vo) {
		String sql = "insert into full_calendar (title,start_date,end_date) values(?,?,?)";
		getConnect();
		try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, vo.getTitle());
		psmt.setString(2, vo.getStartDate());
		psmt.setString(3, vo.getEndDate());
		int r = psmt.executeUpdate();
		System.out.println(r + "건 입력");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			disConnect();
		}
	}
	//한건 삭제
	public void deleteSchedule(String title) {
		String sql = "delete from full_calendar where title = ?";
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
