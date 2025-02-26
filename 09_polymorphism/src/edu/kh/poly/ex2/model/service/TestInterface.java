package edu.kh.poly.ex2.model.service;

public interface TestInterface {

	int plus(int num1, int num2);
	
	
	public abstract String test();
	
	//JAVA 8 이후에는 디포틀 메서드(구현부가 있는 메서드) 가 추가
	default void display() {
		System.out.println("TestInterface의 display()");
	}
}
