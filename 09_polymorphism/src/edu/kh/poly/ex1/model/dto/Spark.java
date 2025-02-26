package edu.kh.poly.ex1.model.dto;

public class Spark extends Car { //경차

	private double discountOffer; // 할인혜택
	
	public Spark() {}//기본생성자

	
	
	// 매개변수 생성자
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}



	
	
	
	@Override
	public String toString() {
		
		return super.toString() + " / "+ discountOffer;
	}
	
	
	public double getDiscountOffer() {
		return discountOffer;
	}



	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	
	
	
	
	
}
