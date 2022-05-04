package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

//데이터에 직접 접근해서 insert, delete 
public class MemberDAO extends DAO{
	
	public void updateMember(MemberVO vo) {
		conn = getConnect();
		String sql = "update member2 \r\n"
				+ "set name = ?, \r\n"
				+ "    passwd = ?,\r\n"
				+ "    email = ?\r\n"
				+ "where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getId());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void deleteMember(String id) {
		conn = getConnect();
		String sql = "delete from member2\r\n"
				+ "where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	public MemberVO searchMember(String id) {
		conn = getConnect();
		String sql = "select * from member2 where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setEmail(rs.getString("email"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
		
	}
	
	public List<MemberVO> listMember() {
		conn = getConnect();
		List<MemberVO> list = new ArrayList<MemberVO> ();
		try {
			psmt = conn.prepareStatement("select * from member2 order by id");
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setEmail(rs.getString("email"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	public void insertMember(MemberVO member) {
		conn = getConnect();
		String sql = "insert into member2(id,name,passwd,email) values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPasswd());
			psmt.setString(4, member.getEmail());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
}
