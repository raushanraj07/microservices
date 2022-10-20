package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.model.Book;
import com.main.repository.BookRepository;

@SpringBootApplication
public class BookDetailsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsApplication.class, args);
	}

	@Autowired
	@Qualifier("bookRepository")
	BookRepository bookRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookRepository.save(new Book(1,".Net Developer Using the Compiler API","John",(double) (978-1-61729-427-3),288,2016));
		
		
		System.out.println(bookRepository.findAll());
	}

}
