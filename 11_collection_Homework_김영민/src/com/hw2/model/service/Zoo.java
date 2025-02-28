package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;


public class Zoo {
	
	Scanner sc = new Scanner(System.in);
	private List<Animal> animals = new ArrayList<>();
	
	
	public Zoo() {}
	
	
	
	//기능
	
	public void addAnimal (Animal animal) {
		   
		if(animals.isEmpty()) {
			System.out.println("동물이 없습니다.");
			
		}
   
		 animals.add(animal);
		
				
	}
		
	
			
		
	
	public void showAnimals() {
		
		
				
		System.out.println("동물들의 울음소리를 들어보세요");
		
		
		
		for(Animal a : animals) {
			
			a.sound();
			
		}
		
		
	
		
	}
	
	public void displayMenu() { // 이걸 실행해야하는느낌 ?
		
			int num = 0;
		
		do{
			System.out.println("********** KH 동물원 ************");
			System.out.println("원하는 작업을 선택하세요 : ");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			
			num = sc.nextInt();
			sc.nextLine();
			
		try {	
			
			switch(num) {
			
			case 1:showAnimals();break;
			
			case 2:System.out.println("프로그램을 종료합니다.");break;
				
			default : System.out.println("1,2번만 눌러주세요");
			}
			
			
		}catch(InputMismatchException e){
			
			System.out.println("숫자만 눌러주세요");
			sc.nextLine();
			num= -1;
		}
			
		}
		while(num !=2);
			
			
		
		
		}
		
	}
	

