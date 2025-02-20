package edu.kh.oop.practice.model.service;

import java.util.Scanner;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	public void practice() {
		
		Hero h1 = new Hero("꿀래몬","전사",200,20,1,0.0);
		Hero h2	= new Hero("허니버터짱","마법사",100,100,1,0.0);
		
		System.out.println("=====캐릭터 생성 ===");
		System.out.println(h1.getJob()+"직업으로"+h1.getNickname()+"님이 생성되었습니다");
		System.out.println(h1.toString());
		System.out.println("=====캐릭터 생성 ===");
		System.out.println(h2.getJob()+"직업으로"+h2.getNickname()+"님이 생성되었습니다");
		System.out.println(h2.toString());
		
		System.out.println("======="+h1.getNickname()+"시점=======");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("뭘 할래?(공격/대시) : ");
		String input = sc.next();
		
		if(input.equals("공격")) {
			System.out.print("경험치는?: ");
			double attackExp = sc.nextDouble();
			h1.attack(attackExp);
		} else if(input.equals("대시")) {
			h1.dash();
		}
		
		h1.attack(100);
		h1.attack(50.5);
		h1.attack(100);
		h1.dash();
		h1.dash();
		h1.dash();
		System.out.println(h1.toString());
		
		System.out.println("======="+h2.getNickname()+"시점=======");
		h2.attack(300);
		h2.dash();
		h2.attack(300);
		h2.attack(300);
		System.out.println(h2.toString());
		
	}
}
