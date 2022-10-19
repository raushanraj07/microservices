package com.main.model;




public class Book {

	
	private Integer id;
	
	private String title;
	
	private String publisher;
	
	private Double isbn;
	
	private Integer pages;
	
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