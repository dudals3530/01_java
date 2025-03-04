package com.hw2.model.dto;

public class Books {

	private int      num ;      //번호
	private String  name ;      //제목
	private String   author;    //저자
	private int      price;     //가격
	private String   made ;      //출판사
	
	
	
	public Books() {// 기본생성자
		
	}



	
				//매개변수 생성자
	public Books(int num, String name, String author, int price, String made) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.price = price;
		this.made = made;
	}




	
		// 기능 
	
	// 책의 정보를 출력하는 메서드
	public String bookInfo() {
		return num +"번 도서 :" +"[도서 제목 : "   + name + "/ 도서저자 : " + author + "/ 도서가격 : " + price +"원"+ "/ 출판사 : " + made+"]";
	}
	
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getMade() {
		return made;
	}



	public void setMade(String made) {
		this.made = made;
	}
	
	
	
	
	
	
	
}
