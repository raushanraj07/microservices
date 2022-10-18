package com.main.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.main.model.Book;

@FeignClient("book-service")
public interface BookServiceProxy {

	@GetMapping(value="/books", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Book>getAllBooks();
	
	
	@GetMapping(value="/products/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Book getBookById(@PathVariable("id") Integer id);
}
