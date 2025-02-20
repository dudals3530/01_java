package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		
	
	Book B1 = new Book();	
	
	System.out.println(B1.toString());
	Book B2 = new Book("자바의정석", 30000, 0.2, "남궁성");
	
	System.out.println(B2.toString());
	
	System.out.println("=========================");
	System.out.println("수정된 결과 확인");
	
	B1.setTitle("C언어");
	B1.setPrice(30000);
	B1.setDiscountRate(0.1);
	B1.setAuthor("홍길동");
	
	System.out.println(B1.toString());
	
	
	System.out.println("=========================");
	
	System.out.println("도서명 = "+B1.getTitle());
	System.out.println("할인된 가격 = "+(int)(B1.getPrice()*(1-B1.getDiscountRate()))+"원" );
	
	System.out.println("도서명 = "+B2.getTitle());
	System.out.println("할인된 가격 = "+(int)(B2.getPrice()*(1-B2.getDiscountRate()))+"원" );
	
	
	
	
	}


	
		
	}


	
	





