package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Book;

@RestController
public class BookConsumerController {

	
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;
	
	@GetMapping("/get-books/{id}")
	public  Book getBookById(@PathVariable("id") int id) {
		Book book=	restTemplate.getForObject("http://book-service/books/"+id, Book.class);
				
			return book;
	}
		
	
	}

