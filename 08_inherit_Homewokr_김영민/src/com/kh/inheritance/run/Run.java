package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
	
		SmartPhone sp = new SmartPhone ("Samsung","Galaxy S20",2020,1200000,"Android",128); 
		// 매개변수생성자를 활용해서 스마트폰 객체생성
		
		BasicPhone bp = new BasicPhone("Nokia","3310",2000,100000,true); 
		// 매개변수생성자를 활용한 베이직폰 객체생성
		
		sp.printInfo();
	
		System.out.println("===============");
		
		
		bp.checkKeyboard();
		
}
}
