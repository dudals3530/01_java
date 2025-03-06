package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
	
	
	
	
	/**
	 * Set<String> 타입의 재료를 추가하는 메서드
	 * 
	 */
	public Set<String> addMaterials (Integer...materials) { // Toy 클래스에서 재료의 타입을 우린 Set<String> 으로 정의함 
		                            //자료형    변수명        // 이에따라 재료의타입을 맞추어야함.
	
		// 전달받은 매개변수 인자에 따라 재료저장 Map 에 있는지 확인하고 Set<String> 으로 반환하는 메서드
		// 가변인자 작성법 ! :자료형...변수명 - > 매개변수의 수가 정확히 몇개 올지 모를때 사용
		
		
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
	
	/**
	 * 메뉴 보여주는 메서드
	 */
	public void displayMenu() {

		int menuNum = 0; // 변수로 쓸 menuNum 을 초기화 했음
		
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
			case 5: ageToy();         break;
			case 6:                                        break;
			case 7:                                        break;
			case 0:System.out.println("프로그램 종료");    break;
			
			
			default : System.out.println("알맞은 번호를 넣어주세요");
			
			}
			
			
		}catch(InputMismatchException e) {
				System.out.println("숫자만 들어올수 있어유");
				sc.nextLine();
			}
			    menuNum = -1;  // -1 값으로 안바꿔주면 루프문을 탈출을 못함 .
			    
		}while(menuNum!=0);

	}

	
	/**
	 * toySet에 있는 toy 출력 하는 메서드
	 * 모든 Toy를 출력하는 기능 이라고 보면됨.
	 * 
	 * 머얌 .. 쌤이랑 똑같이햇음 ;;; ㄹㅇ ;;; 개신기하누 .;
	 */
	public void allToy(){
		
		int index = 1; // X번째 오는 즉 순번으로 쓸 매개변수임
		
		if (toySet.isEmpty()) {//toySet에 하나라도 존재하는 장난감이 없다고하면
			System.out.println("현재 존재하는 장난감이 없어요");
			return;
			
		}
		
		for (Toy toy : toySet) {
			
			System.out.println(index + toy.toyInfo());// index번째 의 Toy 의 info가 올꺼임
			index++; // for문을 돌때마다 번쨰를 1칸만큼 올림
			 
		}return;
		
	}	
	
	/**
	 * 새로운 장난감을 추가하는 메서드
	 * 
	 */
	public void addToy() {
		
	 // 재료의 입력값을 우선 선언
		String input = "";
		System.out.print("장난감 이름: ");
		String inName = sc.next();

		for (Toy t : toySet) { // toySet 에 입력한 장난감이름이랑 똑같은지 있는지 없는지 확인시켜줄
			                      // 포문 
			                    // 내가 Toy 에다가 hashcode를 오버라이드 해놧끼에 같은지 다른지 알수잇음.
			                    // 만약 안해놔잇으면 .. 동일객체인지 구분못해 자바 바보라서..
			
			if (t.getName().equals(inName)) { // 포문을 돌때 해당 t번째 Toy의 이름이 입력한 이름과 같다면
				
				System.out.println("해당 장난감은 이미 있어요");
				               
				return;// 프리트 구문 출력하고 메서드 탈출 .. 필요하면 다시써 ㅡㅡ
			}
		}
		
		System.out.print("사용연령 : ");
		int inAge = sc.nextInt();

		System.out.print("장난감 가격 : ");
		int inPrice = sc.nextInt();

		System.out.print("장난감 색상 : ");
		String incolor = sc.next();

		System.out.print("장난감 제조년월 YYMMDD형식으로 입력 : ");
		String inMade = sc.next();
		
		//스캐너를 이용한 입력값들 이후 재료만 다시 처리해보자..
		
		// 재료를 받아올 Set 생성
		Set<String> materials = new HashSet<>();
		
		
		
	
		
		
		
		do {    //q 가입력될때까지 계속 재료를 추가시켜줄 루프문 
			    //do는 최소한번은 실행되는 메서드
                System.out.print("재료를 입력해주세요 (q를 입력할때까지 추가할것입니다.) : ");			
                 input = sc.next();
                materials.add(input);
                //입력값을 재료를받아올 Set에다가 추가함
		
		}while(!input.toUpperCase().equalsIgnoreCase("Q"));
		
		//입력값이 q랑 같지 않다면 계속 돌아줄거임
		//toUpperCase  이건 q 든 Q 가 들어오면 종료시켜줄것.
		//equalsIgnoreCase("Q") 입력 q 값까지 재료에 포함됨으로 .. 
		//IgnoreCase 씀으로 써 q는재료에서 제외됨.
		
		
	    
		
		Toy addToy = new Toy (inName,inAge,inPrice,incolor,inMade,materials);
		              //입력받은것들을 (재료포함) 을 addToy 라는 새로운 Toy 객체를 생성
	                                               	
		toySet.add(addToy);
		// 입력받은 addToy를 toySet 에다가 추가시켜줌
		
		System.out.println(addToy.getName() +" 장난감이 추가되었습니다.");
		                          //해당 장난감의 이름을 불러오면서 장난감이 추가됬다는 구문
		
		System.out.println("==현재 적용된 장난감 목록==");
		
		allToy(); //추가된 장난감 까지 포함된 현재 장난감 목록들을 출력시키는 메서드
		          // 내가 위에다가 정의해낫기때문에 그냥 가져와서써버림
		
		 return;// 여기까지오면이제 할꺼없음 메서드탈출
		
	}
	
	
	/**
	 * 장난감을 없애버리는 메서드
	 */
	public void dellToy() {

		
		
		String input = "";//받아올 입력값을 미리 선언
		allToy();   //현재 있는 장난감을 조회
		
		boolean flag = true; //해당장난감을 찾으면 표시해줄 flag 
		
		System.out.println("삭제할 장난감의 이름을 입력해주세요 ");
		input = sc.nextLine(); 
		
		for (Toy delltoy : toySet) {
			
			if (delltoy.getName().equals(input)) {
				flag=false;
				toySet.remove(delltoy);
				System.out.println(delltoy.getName()+"은 삭제되었습니다.");
				return;
			}
		}
		while(flag) {
			System.out.println("해당장난감은 업네유");
			return;
		}
		
	}

	/**
	 * 장난감의 제조일 순으로 입력하는 메서드
	 * 
	 */
	public void madeToy() {
		
		/*@Override
		public int compareTo(Toy other) {
			
			return this.made.compareTo(other.made);
		}*/
		// Toy 클래스 안에서 compareTo를 오버라이드해옴
		// Toy 객체와 다음 Toy o 를 비교함 
		// 즉 Toy.made 와 o.made 를 비교
		//반환값이 int 형인대 현재 객체가 다음값보다작으면 음수
		                                          //크면양수,같으면 0을반환
                                                  // 이걸이용해서 조건문으로 써서할수도잇을뜻.?		
		
		
		System.out.println("==장난감을 제작순으로 나열==");
		
		List<Toy> treeToy = new ArrayList<Toy>();
		//Set 객체에 있는 토이들을 담을 List 객체 생성
	
		treeToy.addAll(toySet);
		// 위에 생성한 List 객체에 toySet의 모든 Toy들을 넣어줌
		
		Collections.sort(treeToy);
		//Comparable 인터페이스가 가지고있는 compareTo를 쓰기위해서는 
		//모든 Toy를 담은 treeToy=> List형을 정렬 시켜주자! 
		// 그럼 내가 Toy에다가 정의한 compareTo로 인해 made는 자동정렬될꺼임
		// 이렇게 되면 정렬이 완료됨
		// 즉 Collections.sort를 쓰기위해서는 List형이여야만하고 내가 정의한 클래스에
	    //  compareTo 를 오버라이드 해줘야함 !	
	
		
		for(Toy madeToy : treeToy) {
			// 모든 TOy들을 불러올 for 문 
			
		System.out.println(madeToy.toyInfo());
		//toyInfo라는 메서드를 정의해놈 이걸이용햇음
		
			
		}
		
	}

	
	/**
	 * 장난감의 사용연령별로 
	 */
	public void  ageToy() {
	
		System.out.println("==사용연령별 장난감! ==");
		
		if(toySet.isEmpty()) { //toySet이 비어있는지 확인
			System.out.println("장난감이 존재하지않네요 추가해주세요.");
			return;
		}
		

	    // 연령별 장난감을 저장할 Map 생성
		
		Map<Integer, List<Toy>> mapToy = new HashMap<>();
		
		
		
		for (Toy keyToy : toySet) {// toySet의 각 장난감을 순회
			
			int age =keyToy.getAvalage();// 장난감의 사용 가능 연령을 가져옴
			//현재 순회 중인 장난감의 사용 가능 연령(age)을 가져옵니다.
			if (!mapToy.containsKey(age)) {// 해당 연령 키가 없으면 새 리스트를 생성하여 추가
				
				mapToy.put(age,new ArrayList<Toy>());
				//mapToy에 현재 연령(age) 키가 없는지 확인합니다. 없다면, 
				//해당 연령 키에 빈 리스트(new ArrayList<Toy>())를 추가합니다.

			}
		
			mapToy.get(age).add(keyToy);// 해당 연령 리스트에 장난감 추가
			//mapToy에서 현재 연령(age) 키에 해당하는 리스트를 가져와서,
			//현재 장난감(keyToy)을 추가합니다.
			
			
			
		}//mapToy의 각 항목을 순회하며 출력
		for (Entry<Integer, List<Toy>> entry : mapToy.entrySet()){
			//mapToy의 각 항목을 순회합니다. 각 항목은 연령과 해당 연령의 장난감 리스트로 구성됩니다.
			System.out.println("["+entry.getKey()+"세연령 사용가능]");
			//현재 연령(entry.getKey())을 출력합니다.
			int i = 1;
			for(Toy toy1 : entry.getValue()) {// 각 연령 리스트의 장난감을 순회하며 출력
			
				System.out.print(i+".");
				System.out.println(toy1.getName());
				i++;
			}
			
			
		}
		return;
		

	}
	
	
	
	
}
