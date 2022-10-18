package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
//import org.springframework.data.annotation.Id;


@Entity
@Table(name="Book_Details")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	@Column(name="book_title")
	private String title;
	@Column(name="book_publisher")
	private String publisher;
	@Column(name="book_isbn")
	private Double isbn;
	@Column(name="book_Number_Of_pages")
	private Integer pages;
	@Column(name="book_year")
	private Integer year;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Double getIsbn() {
		return isbn;
	}
	public void setIsbn(Double isbn) {
		this.isbn = isbn;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Book(Integer id, String title, String publisher, Double isbn, Integer pages, Integer year) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.pages = pages;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + ", isbn=" + isbn + ", pages="
				+ pages + ", year=" + year + "]";
	}
	
     public Book() {
    	 super();
     }
}