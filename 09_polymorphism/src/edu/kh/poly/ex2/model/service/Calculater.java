package edu.kh.poly.ex2.model.service;

// 계산기 인터페이스
// -> 모든 계산기에 대한 공통적인 필드, 기능을 제공하는 접점(interface) 의 용도
public interface Calculater {

	//인터페이스 : 추상클래스의 변형체(추상클래스보다 추상도 높음)
	// - 추상클래스 : 일부만 추상메서드(0개 이상)
	// - 인터페이스 : 모두 추상메서드
	
	// 속성 (필드)
	// 필드는 묵시적으로 public static final -> 상수
	public static final double PI = 3.14;
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0;
	
	// 기능
	// 메서드는 묵시적으로 public abstract 
	public abstract int plus (int num1, int num2);   //덧셈
	
	int minus (int num1, int num2);                  //뺄셈
	
	public int multiple (int num1, int num2);        //곱셈
	
	public abstract int divide (int num1, int num2); // 나눗셈
	
	default void display() {
		System.out.println("Calculater의 display()");
	}
	
	
	
	
	
	
}
