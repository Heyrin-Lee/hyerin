package com.prod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryServiceOracle extends DAO implements LibraryService{

	public void logIn(Member member) {
		
	}
		

	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> bookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rentalBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> lendBook(int no) {
		// TODO Auto-generated method stub
		return null;
	}
}
	