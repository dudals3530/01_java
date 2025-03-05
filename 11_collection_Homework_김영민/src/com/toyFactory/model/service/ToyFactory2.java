package com.toyFactory.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory2 {
	
	// 필드 
	
	//입력용 객체 
	private Scanner sc = new Scanner(System.in);
	
	
	// 토이를 담을  Set 객체 생성
	private Set<Toy> toySet = new HashSet<>();   
	// 재료 재료를 담을 Map 객체 생성
	private Map<Integer, String> materialMap = new HashMap<>();
	
	
	public ToyFactory2() {
	                               
		//  materiaMap 객체에  현재 있는 재료들 추가하기
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		//토이 Set 객체에 현재있는 Toy들 추가하기.
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1,4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));
		
	}
	
	
	// 전달받은 매개변수 인자에 따라 재료저장 Map 에 있는지 확인하고 Set<String> 으로 반환하는 메서드
	// 가변인자 작성법 ! :자료형...변수명 - > 매개변수의 수가 정확히 몇개 올지 모를때 사용
	
	public Set<String> addMaterials (Integer...materials) { // Toy 클래스에서 재료의 타입을 우린 Set<String> 으로 정의함 
		                            //자료형    변수명        // 이에따라 재료의타입을 맞추어야함.
	
		// 매개변수로 전달받은 Set 객체 생성하기 
		Set<String> addMaterials = new HashSet<String>();
		
			for (Integer materialKey : materials) {
				
				//Map 에있는 재료의 key 값에 대응되는 value값을 뽑아와서 
				//addMaterials에 추가해줄꺼임.
			
				String materialValue = materialMap.get(materialKey);
				// 재료Map 에선 (Key , Value) 에서 key는Integer Value 는 String 으로 되어있음
				// 이메서드가 호출될떄 Materialkey 값을 순회하면서 String 형value 값을 뽑아와서 
				
				addMaterials.add(materialValue);
				// 위에 생성한 addMaterials set 객체에 넣어줄꺼임
				
				if (materialKey != null) { // 현재 재료목록에 재료가 있을때
					addMaterials.add(materialValue);
					// 현재 Map에 해당되는 key값이 존재한다면 그냥 위에 생성한 addMaterials set 객체에 넣어줄꺼임
				}
			}
				return addMaterials;
				//여기까지 도달하면 위에 생성된 객체에 키값에 대응되는 
				//value값들이 set 객체에 넣어진상태로 해당 메서드 탈출!
				                     
	}
	
	public void displayMenu() {

		int menuNum = 0; //menu
		
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
		
			case 1: //allToy();         break;
			case 2: //addToy() ;        break;
			case 3: //dellToy();        break;
			case 4:// madeToy();        break;
			case 5: //ageToy();                                       break;
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

	
}
