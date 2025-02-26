package edu.kh.poly.ex2.model.service;

public class KYMCalculator implements Calculater, TestInterface {
											/*,다른인터페이스명
											 * 받아서 다중상속가능*/
	//extends : 확장하다, implements : 구현하다
		//(부)클래스 - (자)클래스 : extends   사용
		//(부)인터페이스 - (자)인터페이스 : extends 사용
		//(부)인터페이스 - (자)클래스 : implements  사용
	 	//(부)클래스 - (자) 인터페이스 : 상속불가

	
	
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
		
	}

	@Override
	public int minus(int num1, int num2) {
		
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		return num1 / num2;
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}

	// 다중 상속중인 인터페이스들에 같은 디폴트메서드가 겹치면
	// 오류발생!!
	// - > 구현 클래스 에서 오버라이딩 반드시 해야함
	@Override
	public void display() {
	
		Calculater.super.display();
	}
	
	

}
