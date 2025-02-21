package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.model.vo.Snack;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	

	public String menu() {//사용자가 Snack 객체에 데이터를 저장할수 있또록 값을받고 
						//저장한 값을 출력하는 메소드
	
		char choice = ' ';
		
		do{System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String flavor = sc.next();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		scr.saveDate(kind, name, flavor, numOf, price);
		return"저장이 완료되었습니다.";
		System.out.print("저장한정보를 확인하시겠습니까? (y/n)");
		char choice = sc.next().charAt(choice);

		switch (choice) {
		
		case 'y':System.out.print(get.k);
		case 'n':
		default : System.out.print("(y,n)만눌러주세요.");	
		}
	
		
		
		
		
		
		
		
		}
}
