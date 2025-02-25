package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {

	private boolean hasPhysicalKeyboard; // 물리적 키보드유무
	
	
	
	
	public BasicPhone() {}// 기본생성자

	
	
	                  //Phone을 상속받은 매개변수 생성자
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	
	//기능
	
	public void checkKeyboard() {// 이건 먼기능 ? ?
		
	 super.printInfo();
	 if (true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		}
		
	}
	
}
