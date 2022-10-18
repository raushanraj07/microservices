package com.main.service;

import java.util.List;

import com.main.model.Book;

public interface IBookService {

	Book save(Book book);
	Book update(Book book);
	void delete(int id);
	List<Book> getAllBooks();
	//Book findById(Integer id);
	List<Book> getAllBooksByTitle(String title);
	List<Book> getAllBooksByYear(int year);
	Book findById(int id);
}
