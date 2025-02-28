package com.hw2.model.dto;

public class Monkey extends Animal{

	
	
	public Monkey() {
		
	}
	
	
	public Monkey(String name) {
		super(name);
	}
	
	
	@Override     //???   // 원숭이 클래스
	public void sound() { // 재정의해야할 메서드
	
		System.out.println("원숭이가 우끼끼 소리를냅니다");
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















