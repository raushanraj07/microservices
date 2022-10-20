package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Book;
import com.main.repository.BookRepository;

@Service("bookService")
@Scope("singleton")
@Transactional
public class BookService implements IBookService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;
	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book update(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getAllBooksByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	@Override
	public List<Book> getAllBooksByYear(int year) {
		return bookRepository.findByYear(year);
	}

	@Override
	public Book findById(int id) {
		return bookRepository.findById(id).orElse(null);
	}

}
