package Library;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibDAO extends DAO {

	// 로그인

	// 도서등록
	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "";
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
		String sql = "";
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
		String sql = "";
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
		try {
			psmt = conn.prepareStatement("");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookNumber(rs.getInt("book_number"));
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

		// 회원의 대여도서 목록 조회

		// 종료
	}
}
