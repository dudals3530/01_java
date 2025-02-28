package com.hw2.model.dto;

public abstract class Animal {

	protected String name;
	
	
	
	public Animal() {//기본생성
	
	}


	//매개변수 생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	
	//추상 메서드
	public  abstract void sound();
	
}


