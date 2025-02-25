package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone{

	private String operatingSystem  ; // OS
	private int storageCapacity ;     // 스토리지 공간크기
	
	public SmartPhone() {} // 기본생성자

	
	                       //Phone 을 상속받은 매개변수 생성자
	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
		
	
	@Override
	public void printInfo() {
		
		super.printInfo();
		System.out.println(operatingSystem);
		System.out.println(storageCapacity+"GB");
	}
	
	
	
}
