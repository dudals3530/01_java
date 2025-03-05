package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	
	public static void main(String[] args) {
	
	/*
		// 불변성 (Immutable) 의 String
		// 기존 객체가 변하지 않고 새로운 객체가 탄생
		String str1 ="Hello";
		String str2 = "Hello";
		
		System.out.println(str1.hashCode()); // 69609650
		System.out.println(str2.hashCode()); // 69609650
		str2 = str2 + " world";
		
		System.out.println(str2.hashCode()); //-832992604
		
		System.out.println("============================");
		
		// 가변성 (Mutable) 의 StringBuilder, StringBuffer
		// 기존 객체에서 변하면서 추가되는 느낌 ?
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());   //1706377736
		
		sb.append("Hello World");
		sb.append("12345");
		
		System.out.println(sb.hashCode());   //1706377736
	                                                      */
		
		// 힝 아까ㅝ잉 ㅠ ^ ㅠ
		
		ByteService ser = new ByteService();
		ser.fileCopy();
		
}
}
