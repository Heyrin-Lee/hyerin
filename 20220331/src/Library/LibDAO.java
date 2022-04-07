package Library;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibDAO extends DAO {

	// 회원가입
	public void joinin(Join joinNo, Join joinPw) {
		conn = getConnect();
		String sql = "insert into joinin\r\n" + "values(?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, joinNo.getJoinNumber());
			psmt.setInt(2, joinPw.getJoinPassword());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 회원가입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 로그인
	public Login loginin(int adminNo, int adminPw) {
		conn = getConnect();
		Login log = null;
		String sql = "select *  from login_admin where admin_id = ? and admin_pw = ? ";
		// 관리자 로그인
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, adminNo);
			psmt.setInt(2, adminPw);
			rs = psmt.executeQuery();
			if (rs.next()) {
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
	public Login loginin2(int memberNo, int memberPw) {
		conn = getConnect();
		Login log = null;
		String sql = "select *  from login_member where member_id = ? and " + "member_pw = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, memberNo);
			psmt.setInt(2, memberPw);
			rs = psmt.executeQuery();
			if (rs.next()) {
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
		String sql = "insert into book_info (book_no, book_title, book_author, book_publish, book_place, book_borrow)\r\n"
				+ "values(?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBookNumber());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookAuthor());
			psmt.setString(4, book.getBookPublish());
			psmt.setString(5, book.getBookPlace());
			psmt.setString(6, book.getBookBorrow());
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
				+ "set book_title = ?, book_author = ?, book_publish = ?, book_place = ?\r\n" + "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookTitle());
			psmt.setString(2, book.getBookAuthor());
			psmt.setString(3, book.getBookPublish());
			psmt.setString(4, book.getBookPlace());
			psmt.setInt(5, book.getBookNumber());
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
		String sql = "delete from book_info\r\n" + "where book_no = ?";
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
				book.setBookBorrow(rs.getString("book_borrow"));

				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return books;
	}

	// 회원리스트
	public List<Login> memList() {
		List<Login> members = new ArrayList<Login>();
			conn = getConnect();
			String sql = "select *\r\n"+ "from login_member";
			try {
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				while (rs.next()) {
					Login mem = new Login();
					mem.setMemberNumber(rs.getInt("member_id"));
					mem.setMemberPassword(rs.getInt("member_pw"));
					
					members.add(mem);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return members;
	}

	// 책 제목 검색-> 책 위치, 대여가능여부 조회
	public List<Book> titlelist(String title) {
		List<Book> titles = new ArrayList<Book>();
		conn = getConnect();
		try {
			String sql = "select book_place, book_borrow\r\n" + "from book_info\r\n" + "where book_title = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book tt = new Book();
				tt.setBookPlace(rs.getString("book_place"));
				tt.setBookBorrow(rs.getString("book_borrow"));

				titles.add(tt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return titles;
	}

	// 도서대여
	public boolean borrow(int bookno) {
		conn = getConnect();

		String sql = "update book_info set book_borrow = 'n'\r\n" + "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookno);
			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			} else if (r == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	// 도서대여가능여부 확인
	// boolean타입으로 리턴값을 받으면 값이 있을 경우 무조건 true로 반환-> "y","n"을 구분해서 출력메시지를 다르게 해야하기
	// 때문에 적절하지 않음
	// 셀을 데이터로 받아와서 "n","y"을 구분하도록 하기 위해서 class 타입으로 리턴값을 받아오도록 설정하였다
	public Book check(int booknum) {
		conn = getConnect();
		Book book1 = null;
		String sql = "select book_no, book_borrow\r\n" + "from book_info\r\n" + "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, booknum);
			rs = psmt.executeQuery();
			if (rs.next()) {
				book1 = new Book();
				book1.setBookNumber(rs.getInt("book_no"));
				book1.setBookBorrow(rs.getString("book_borrow"));
				return book1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book1;
	}

	// 대여중인 도서목록보기
	public List<Book> bookList2() {
		List<Book> renting = new ArrayList<Book>();
		conn = getConnect();
		String sql = "select *\r\n" + "from book_info\r\n" + "where book_borrow = 'n'";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book rent = new Book();
				rent.setBookBorrow(rs.getString("book_borrow"));

				renting.add(rent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return renting;
	}

	// 도서반납
	public void turn(int booknom) {
		conn = getConnect();

		String sql = "update book_info set book_borrow = 'y'\r\n" + "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, booknom);
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 회원정보수정
	public void updateMember(Login member) {
		conn = getConnect();
		String sql = "update login_member\r\n" + "set member_pw = ?\r\n" + "where member_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, member.getMemberPassword());
			psmt.setInt(2, member.getMemberNumber());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	// 종료

}
