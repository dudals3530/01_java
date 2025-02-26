package com.hw1.model.dto;

public abstract class Book {

	private String title;  //제목
	private String author; //저자
	
	public Book() {}// 기본생성자

	
	//매개변수 생성자
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	
	public abstract void displayInfo() ;
	
	
	
		
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	
	
		
		
	
	
	
	
}
