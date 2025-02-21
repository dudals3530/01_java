package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MethodRun {
	public static void main(String[] args) {
		
		//MethodExample me = new MethodExample();
		
		//me.method1();
		
		MemberService run = new MemberService();
		run.displayMenu();
		
		
		//method2()메서드 호출
		//method1() 메서드 실행
		//main 메서드 실행
		
		//호출을 할떄마다 stack 에 쌓임
		//LIFO
		//(Last - input - Fist - Out)
		
		// 제일 늦게 들어온애가 제일 빨리나감
	}

}
