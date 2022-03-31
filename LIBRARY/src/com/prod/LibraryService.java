package com.prod;

import java.util.List;

public interface LibraryService {
	
	public void logIn (Member member);
	public void insertBook (Book book);
	public void modifyBook (Book book);
	public void deleteBook (int no);
	public List<Book> bookList();
	public void rentalBook (Book book);
	public List<Book> lendBook (int no);
	
}
