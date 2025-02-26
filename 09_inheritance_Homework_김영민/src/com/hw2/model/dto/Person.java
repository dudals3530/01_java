package com.hw2.model.dto;

public abstract class Person {// 추상화된 클래스
								//추상 메서드잇땀

	protected String id ;       //고유번호
	protected String name;      // 이름
	
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
	
			//요게 추상 메서드
	public abstract String getInfo() ;
		
	
	 // 객체 정보를 문자열로 반환한다
	
	
	
	


		//게터세터
	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
