package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Book;
import com.main.service.BookService;
import com.main.service.IBookService;

@RestController
@Scope("request")
public class BookController {

	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	

	@RequestMapping("/")
	public String dummyMethod() {
		return "Welcome to ebook Store";
	}
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return bookService.save(book);
	}
	
	@GetMapping("/getAllBooks")
	public Iterable<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBookById/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.findById(id);
	}
	
	@GetMapping("/getAllBooksByTitle/{title}")
	public List<Book> getAllBooksByTitle(@PathVariable String title){
		return bookService.getAllBooksByTitle(title);
	}
	
	@GetMapping("/getAllBooksByYear/{year}")
	public List<Book> getAllBooksByYear(@PathVariable int year){
		return bookService.getAllBooksByYear(year);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(int id) {
		 bookService.delete(id);
	}
	
	@PutMapping("/updateBook")
	public Book updateBook(Book book) {
		return bookService.update(book);
	}
	
	
}
