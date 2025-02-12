package edu.kh.variable.practice;

import java.util.Scanner;

public class PracticeExample123 {
 
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		// cntrl + shift + o  
		
		System.out.print("입력 숫자 1");
		int inNum1 = sc.nextInt();
				
		System.out.print("입력 숫자 2");
		int inNum2 = sc.nextInt();
		
		System.out.print("입력 숫자 3");
		int inNum3 = sc.nextInt();
		
		 // 사칙연산 +  -  *  /
		// x +  y  + z = A
		System.out.printf("% + %b + %b = %b", inNum1, inNum2, inNum3, inNum1 + inNum2 + inNum3);
		
		
		
		
		
		
		
}
}
