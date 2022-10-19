package com.main.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.main.model.Book;
import com.main.proxy.BookServiceProxy;


@Component
public class BookServiceFallback implements BookServiceProxy{

	@Override
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book());
	}

	@Override
	public Book getBookById(Integer id) {
		return new Book(id, "hye", "john",(double) 552, 222, 2022);
	}

}
