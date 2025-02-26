package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car {// 전기차

	private int batteryCapacity; // 배터리용량
	
	public Tesla() {}// 기본생성자
	
	
	//매개변수 생성자 + 상속받은것도 포함
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}


	
	
	
	
	@Override
	public String toString() {
		
		return super.toString() + " / " + batteryCapacity; 
	}
	
	
	
	// 게터세터
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	
	
	
	
}
