package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	public static void main(String[] args) {
		
		//Zoo 객체 생성
		//Tiger 객체 생성하여 zoo 에 추가하기
		//Monkey 객체 생성하여 zoo에 추가하기
		Zoo zo = new Zoo();
		Tiger ti = new Tiger();
		Monkey mo = new Monkey();
		
		zo.addAnimal(mo);
		zo.addAnimal(ti);
		zo.displayMenu();
		
		
		
		
	}
}
