package com.main.fallback;

import java.util.Arrays;
import java.util.List;

import com.main.model.Book;
import com.main.proxy.BookServiceProxy;

public class BookServiceFallback  implements BookServiceProxy{

	@Override
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book());
	}

	@Override
	public Book getBookById(Integer id) {
		return new Book(id, "hye","jack", (double) 5454, 200, 2018);
	}

}
