package com.main.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Book;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByTitle(String title);

	List<Book> findByYear(int year);

}
