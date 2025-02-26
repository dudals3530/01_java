package com.hw1.model.dto;

public class Poetry extends Book {

	private int numberOfPoems ; // 시 수
	
	
	public Poetry() {} //기본생성자


	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}


	
	@Override
	public void displayInfo() {
		System.out.print("[시집] 제목"+getTitle() +" / 저자 : "+ getAuthor()+ "/ 시 수 : " + getNumberOfPoems());
    	
		
	}


	
	
	
	public int getNumberOfPoems() {
		return numberOfPoems;
	}


	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
	
	
	
}
