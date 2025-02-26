package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	private Prisoner[] prisoners;      //전체수용자저장용배열

	private int prisonerCount;      //수용자수

	
	
	public Prison (int size) {
		/*
		 * 매개변수로 전달받은 size를 이용하여
           Prisoner 객체배열을 size 크기로 생성한다.
           prisonerCount는 0으로 초기화한다.
		 * 
		 * */
		Prisoner[] priarr = new Prisoner[size];
		prisonerCount = 0;
		
	}
	
	
	

	@Override
	public void addPerson(Person person) {
		/*
		 * 추상메서드를 상속받아 오버라이딩
		   해야하는 메서드. 매개변수로 전달받은
		   Person 객체가 Prisoner 클래스의	
		   인스턴스이며, 배열에 공간이 있다면, 해당
		   객체를 prisoners 배열에 추가 후 추가된
		   객체의 정보를 출력.
		   만약 배열에 더 이상 공간이 없다면, 인원이
		   모두 충원되었다는 메시지 출력
		 * 
		 * 
		 * */
		
	}

	@Override
	public void removePerson(String id) {
		/*
		 * 추상메서드를 상속받아 오버라이딩
		   해야하는 메서드. 매개변수로 전달받은 id와
		   일치하는 수감자를 찾으면, 해당 수감자를
		   삭제하고 관련 정보를 출력. 일치하는 id가
		   없다면 해당 id를 가진 수감자를 찾을 수
		   없다는 메시지를 출력.
		 * 
		 * 
		 * 
		 * */ 
	}

	@Override
	public void displayAllPersons() {
		// 추상메서드를 상속받아 오버라이딩
		//해야하는 메서드. 전체 수감자 명단을출력하는 기능


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Prisoner[] getPrisoners() {
		return prisoners;
	}





	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}





	public int getPrisonerCount() {
		return prisonerCount;
	}





	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}





	
}
