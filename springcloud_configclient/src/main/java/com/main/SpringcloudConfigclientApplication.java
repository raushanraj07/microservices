package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.main.model.Book;
import com.main.repository.BookRepository;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudConfigclientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigclientApplication.class, args);
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
