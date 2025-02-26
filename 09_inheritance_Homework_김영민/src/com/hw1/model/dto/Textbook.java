package com.hw1.model.dto;

public class Textbook extends Book{

	private String subject ; // 과목

	
	public Textbook() {} // 기본생성자
	
	
	
	
	
	 //매개변수 생성자
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}



	
	@Override
	public void displayInfo() {
		System.out.print("[전문 서적] 제목"+getTitle() +" / 저자 : "+ getAuthor()+ "/ 과목 : " + getSubject());
    	
		
	}
	
	



	public String getSubject() {
		return subject;
	}





	public void setSubject(String subject) {
		this.subject = subject;
	}





	
	
}
