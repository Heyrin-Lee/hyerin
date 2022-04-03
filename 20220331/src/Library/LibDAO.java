package Library;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibDAO extends DAO {

	// 로그인
	public Login loginin (int adminNo, int adminPw) {
		conn = getConnect();
		Login log = null;
		String sql = "select *  from login_admin where admin_id = ? and admin_pw = ? ";
		//관리자 로그인
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, adminNo);
			psmt.setInt(2, adminPw);
			rs = psmt.executeQuery();
			if(rs.next()) {
				log = new Login();
				log.setAdminNumber(rs.getInt("admin_id"));
				log.setAdmingPassword(rs.getInt("admin_pw"));
			}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
		return log;
		}
	// 회원 로그인
	public Login loginin2 (int memberNo, int memberPw) {
		conn = getConnect();
		Login log = null;
		String sql = "select *  from login_member where member_id = ? and member_pw = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, memberNo);
			psmt.setInt(2, memberPw);
			rs = psmt.executeQuery();
			if(rs.next()) {
				log = new Login();
				log.setAdminNumber(rs.getInt("member_id"));
				log.setAdmingPassword(rs.getInt("member_pw"));
			}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
		return log;
		}
	// 도서등록
	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "insert into book_info (book_no, book_title, book_author, book_publish, book_place, book_rental)\r\n"
				+ "values(?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBookNumber());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookAuthor());
			psmt.setString(4, book.getBookPublish());
			psmt.setString(5, book.getBookPlace());
			psmt.setString(6, book.getBookRental());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 도서정보수정
	public void updateBook(Book book) {
		conn = getConnect();
		String sql = "update book_info\r\n"
				+ "set book_place = ?,\r\n"
				+ "     book_rental = ?\r\n"
				+ "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookPlace());
			psmt.setString(2, book.getBookRental());
			psmt.setInt(3, book.getBookNumber());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 도서삭제
	public void deleteBook(int bookNumber) {
		conn = getConnect();
		String sql = "delete from book_info\r\n"
				+ "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookNumber);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 도서목록조회
	public List<Book> bookList() {
		List<Book> books = new ArrayList<Book>();
		conn = getConnect();
		String sql = "select * from book_info order by book_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookNumber(rs.getInt("book_no"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookAuthor(rs.getString("book_author"));
				book.setBookPublish(rs.getString("book_publish"));
				book.setBookPlace(rs.getString("book_place"));
				book.setBookRental(rs.getString("book_rental"));

				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return books;
		// 도서대여
		public int rentBook () {
			conn = getConnect();
			
			int result = 0;
			String sql = " ";
			try {
				psmt = conn.prepareStatement(sql);
			}
		}
		// 회원의 대여도서 목록 조회

		// 종료
	}
}
