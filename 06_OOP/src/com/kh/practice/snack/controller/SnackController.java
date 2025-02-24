package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {//사용자의 요청을 받아서 처리하고, 그입력에 따라 
	             //model(데이터 처리, 비즈니스 로직) 과 view (화면 출력)
					//을 연결해주는 역할
	
	private Snack s = new Snack();

	public SnackController() {//기본생성자
		
		
	}

	public String saveDate // 데이터를 setter 를 이용해 저장하고 
	                         //저장완료 되었다는 결과를 반환하는
							// 메소드
	(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return"저장 완료되었습니다."+
							"\n저장한 정보를 확인하시겠습니까?y/n";
	}
	
	public String confirmData() {//저장된 데이터를 반환하는 메서드
		
		
		return s.information();
	}
}


