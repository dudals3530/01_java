package com.hw2.model.dto;

public class Employee extends Person {

	
	private String position ;  // 직책

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String id, String name, String position) {
		super(id, name);
		this.id = id;
		this.name = name;
		this.position = position;
	}




@Override
public String getInfo() {
	
	return "Id  : "+ getId() +",이름  " + getName() + ", 직책 : " + getPosition() ;
	
}
	




	public String getPosition() {
		return position;
	}





	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	
	
	
	
}
