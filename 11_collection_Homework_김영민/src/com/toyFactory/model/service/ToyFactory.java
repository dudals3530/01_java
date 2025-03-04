package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	Scanner sc = new Scanner(System.in);

	private Set<Toy> toyList = new HashSet<Toy>();
	private Map<Integer, String> mataList = new HashMap<Integer, String>();

	public Set<String> addMaterals(int... nums) {// 이건 진짜 .. 어렵다 슨상님이 풀이해줄떄
													// 꼮꼮꼮꼮꼮꼮꼮꼮꼬꼮꼬꼬ㅗ꼬꼬꼬꼬꼬꼬ㅗ꼬꼮
													// 정확하게 이해하고넘어가자
		Set<String> addMate = new HashSet<>();
	
		for (int a : nums) {
		
			addMate.add(mataList.get(a).toString());
			// mataList 에 a의 int값 key를 추가
			
		}
	
		return addMate;
		// mataList 에 int값 a 를 가지고 리턴함
	}

	public ToyFactory() {

		// Map 을 이용한기본 등록 된 재료
		mataList.put(1, "면직물");
		mataList.put(2, "플라스틱");
		mataList.put(3, "유리");
		mataList.put(4, "고무");

		// set 을 현재 제작된 장난감 목록

		toyList.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterals(1,4)));
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterals(1, 2)));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterals(1, 2)));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterals(1, 2)));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterals(1, 2, 4)));

	}

	public void displayMenu() {

	int menuNum = 0;
	
	do{System.out.println("<<플레이 타임 공장>>");
		
		System.out.println("1. 전체 장난감 조회");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료추가");
		System.out.println("7. 재료 제거");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		
	
		
		try { menuNum = sc.nextInt();
	          sc.nextLine();
	
		switch(menuNum) {
	
		case 1: allToy();         break;
		case 2: addToy() ;        break;
		case 3: dellToy();        break;
		case 4: madeToy();        break;
		case 5: ageToy();                                       break;
		case 6:                                        break;
		case 7:                                        break;
		case 0:System.out.println("프로그램 종료");    break;
		
		
		default : System.out.println("알맞은 번호를 넣어주세요");
		
		}
		
		
	}catch(InputMismatchException e) {
			System.out.println("숫자만 들어올수 있어유");
			sc.nextLine();
		}
		    menuNum = -1;
	}while(menuNum!=0);

}

	/**
	 * 전체 장난감 조회하는 기능
	 */
	public void allToy() {

			int i = 1;
		if (toyList.isEmpty()) {

			System.out.println("현재 등럭된 장난감이 없삼 추가해줘");
		}

		for (Toy t : toyList) {

			System.out.println(i+t.toyInfo());
			i++;
		}

	}

	/**
	 * 새로운 장난감 만들기 추가하는 기능 ?!?!?!
	 *
	 *Set<String> inputMata = new HashSet<String>(); //재료를 넣을 새로운 HashSet 생성
	 *
	 *if (!inMata.equals("q")) {
			  inputMata.add(inMata);  
			  // 입력받은 재료를 inputMata 재료 Set에 넣어버리기 
				
				쌈빡한것들 ..
			 
	 */
	public void addToy() {

		

		System.out.print("장난감 이름: ");
		String inName = sc.next();

		System.out.print("사용연령 : ");
		int inAge = sc.nextInt();

		System.out.print("장난감 가격 : ");
		int inPrice = sc.nextInt();

		System.out.print("장난감 색상 : ");
		String incolor = sc.next();

		System.out.print("장난감 제조년월 YYMMDD형식으로 입력 : ");
		String inMade = sc.next();

		Set<String> inputMata = new HashSet<String>(); //재료를 넣을 새로운 HashSet 생성
		
		String inMata = "";  // 입력받을 재료 String  while 에서 쓸려면 미리 만들어야됌 
	                          	// 아닌가? ...   맞을꺼 ㄹ ? ?...ㄷㄷ;
		
		
		sc.nextLine(); // 개행
		
		do {
			System.out.print("재료를 입력해주세요(종료하려면 q를 입력해주세요) : ");
			inMata = sc.next(); // 사용자 입력값

			if (!inMata.equals("q")) {
				
			  inputMata.add(inMata);  // 입력받은 재료를 inputMata 재료 Set에 넣어버리기
				
			}

		} while (!inMata.equals("q"));

		toyList.add(new Toy(inName,inAge,inPrice,incolor,inMade,inputMata)); // 입력받은거 add 해버렷
		System.out.println(" 장난감이 추가되었습니다.");
		allToy();
		return;
		
	}
		
	/**
	 * 장난감 제거 하는 기능
	 * 장난감의 이름을 입력받아
	 * 해당 장난감을 찾고 그 장난감을 삭제하는 것!?!?! ㅎㄷ;
	 * Toy dellToy = null; // 삭제할 Toy 타입 매개변수 << 요거 쌈빡해
	 */
	public void dellToy() {
		
		String inName = "";
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		inName = sc.next();
		
		
		if(toyList.isEmpty()){
			System.out.println("현재 존재하는 장난감이 없슈");
			return;
		}
		
		Toy dellToy = null; // 삭제할 Toy 타입 매개변수
		boolean flag = true;
		for (Toy t : toyList) {
		
			 // 삭제할 장난감을 넣을 매개변수 
		
			if	(t.getName().equals(inName)){
			
				dellToy =t; //삭제할 장난감을 t 에넣어버렷
				flag = false; // 해당 장난감을 찾아씀메
				break;         //찾았으면굳이 더 for문 돌지말고 멈췃!
			}
				
				
			
		} if (flag == false) { // 해당 장난감을 찾았을때 
			
			toyList.remove(dellToy);
			System.out.println("해당 장난감은 삭제했습니다");
			return;
		
		
		}if(flag) {  //flag가 아직도 true라면 못찾은겨 /..
			
			System.out.println("해당장난감을 찾지 못했습니다");
			return;
		}	
				
			
			 			
			
		
	
}


	/**
	 * 장난감 제조일 순으로 조회하기 !
	 * 와 .. 이거 어캐하지 ..흠 ㅇ.ㄹ. 
	 * 로또번호생성기 햇을때 내림차순? ? 이용햇던거같음 ㅇ..
	 * 	Set<Integer> lotto = new TreeSet<Integer>(); //오름차순
			//Set<Integer> lotto = new TreeSet<Integer>(Comparator.reverseOrder());// 내림차순
	 * 
	 * 이걸 이용해보자 ㅇ..
	 */
	public void madeToy() {
		
		Set<Toy> madeList = new TreeSet<>(Comparator.comparing(Toy::getMade)); // 오 되는것같아 ..
		madeList.addAll(toyList);
		
		for (Toy t :madeList) {
			System.out.println(t.toyInfo());
			
	
		
		
		
		
		
	
		}
			
			
	
		
		
		

		
		
	}
	

	/**
	 * 연령별로 사용 장난감 리스트 출력하기
	 * 와 .. 우캐하누 ..........
	 * 
	 * 
	 */
	public void ageToy() {
		
		
		
	}
	
}

