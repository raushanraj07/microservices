package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Book;
import com.main.proxy.BookServiceProxy;

@RestController
public class BookConsumerController {

	
	@Autowired
	BookServiceProxy bookServiceProxy;
	
	
	@GetMapping("/get-books")
	public List<Book>getAllBooks(){
		return  bookServiceProxy.getAllBooks();
	}
	
	
	@GetMapping("/get-books/{id}")
	public  Book getBookById(@PathVariable("id") int id) {
		Book book=	bookServiceProxy.getBookById(id);
				
			return book;
	}
		
	
	}

