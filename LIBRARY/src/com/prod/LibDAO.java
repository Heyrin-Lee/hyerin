package com.prod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibDAO extends DAO implements LibraryService{

	public void logIn(Member member) {
		
	}
		

	@Override
	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "insert into book_info (book_no, book_title, book_author, book_publish, book_place, book_rental)\r\n"
				+ "values(?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBookNumber());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookAtuhor());
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

	@Override
	public void modifyBook(Book book) {
		conn = getConnect();
		String sql = "update book_info "
				+ "set book_place = ?, "
				+ "    book_rental = ? "
				+ "where book_number = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookPlace());
			psmt.setString(2, book.getBookRental());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		}	catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			disconnect();
		}
	}

	@Override
	public void deleteBook(int no) {
		conn = getConnect();
		String sql = "delete from book_info "
				+ "where book_number = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		}	catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			disconnect();
		}
	}

	@Override
	public List<Book> bookList() {
		List<Book> list = new ArrayList<Book>();
		conn = getConnect();
		String sql = "select * from book_info order by book_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setBookNumber(rs.getInt("book_number"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookAtuhor(rs.getString("book_author"));
				book.setBookPublish(rs.getString("book_publish"));
				book.setBookPlace(rs.getString("book-place"));
				book.setBookRental(rs.getString("book_rental"));
				
				list.add(book);
			}
		}	catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	@Override
	public void rentalBook(Book book) {
		
	}

	@Override
	public List<Book> lendBook(int no) {
		// TODO Auto-generated method stub
		return null;
	}
}
	