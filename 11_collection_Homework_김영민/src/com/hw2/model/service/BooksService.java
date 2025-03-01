package com.hw2.model.service;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Books;

public class BooksService {

	


	Scanner sc= new Scanner(System.in);
	
	
	private List<Books> bookList = new ArrayList<>();   //도서목록
	private List<Books> starList = new ArrayList<>();   //즐찾 도서목록
	
	
	public BooksService() { //기본생성자 를 통해 예시 객체 생성함
		
		bookList.add(new Books(1111,"세이노의가르침","세이노",6480,"데이원"));
		bookList.add(new Books(2222,"문과남자의 과학공부","유사만",15750,"데이원"));
		bookList.add(new Books(3333,"역행자","자칭",17550,"웅진지식하우스"));
		bookList.add(new Books(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		bookList.add(new Books(5555,"도둑맞은 집중력","요한 하리",16920,"어크로스"));
		bookList.add(new Books(6666,"노인과 바다","어니스트 헤밍웨이",18000,"민음사"));
		
		
	}
		
	
	
	
	public void displayMenu() {// 메뉴 용 메서드
		
		int menuNum = 0;
		
	do {	System.out.println("===도서 목록 프로그램 ====");
		
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 조회");
		System.out.println("3. 도서 수정");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 즐겨찾기 추가");
		System.out.println("6. 즐겨찾기 삭제");
		System.out.println("7. 즐겨찾기 조회");
		System.out.println("8. 추천도서 뽑기");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("메뉴를 입력하세요 : ");
		
		try { menuNum = sc.nextInt();
	          sc.nextLine();
	
		switch(menuNum) {
		
		case 1: System.out.println(addBook());        break;
		case 2: allBook() ;                           break;
		case 3:System.out.println(fixBook());         break;
		case 4:System.out.println(dellBook());        break;
		case 5:System.out.println(starkBookAdd());    break;
		case 6:System.out.println(starkBookDell() );   break;
		case 7: starBookAll();   break;
		case 8:randomBook();      break;
		case 0:System.out.println("프로그램 종료");break;
		
		default : System.out.println("알맞은 번호를 넣어주세요");
		
		}
		
		
	}catch(InputMismatchException e) {
			System.out.println("숫자만 들어올수 있어유");
			sc.nextLine();
		}
		menuNum = -1;
		
		
		
		
		
	}while(menuNum != 0);
	
		
		
		
	}
	
	
	
	/**
	 * 도서 등럭 기능
	 * 
	 * 
	 */
	public String addBook() {
		
		System.out.println("=========도서 등록 ==========");
		
		System.out.print("도서 번호 : ");
		int  num = sc.nextInt();
		System.out.print("도서 제목 : ");
		String name = sc.next();
		System.out.print("도서 저자 : ");
		String author = sc.next();
		System.out.print("도서 가격 : ");
		int price  = sc.nextInt();
		System.out.print("도서 출판사 : ");
		String made = sc.next();
		
		if(bookList.add(new Books(num,name,author,price,made))) {
			// 북리스트라는 ArrayList에 Books 매개변수사용자를이용한 객채를 add 함 ?
			return"등럭 완료 ";
		}
		else {
			
			return"등럭 실패 "; 
		}
		
		
		
	}
		
		
		
	/**
	 * 전도서 출력 기능!
	 * 도서 조회 
	 * 모든 도서를 조회 시킨다는 느낌 ?
	 * 
	 * 
	 */
	public void  allBook() {
		
		if (bookList.isEmpty()) {
			
			System.out.println("존재하는 책이없오잉");
			return;
		}
		
		for(Books b:bookList ) {
			
			System.out.println(b.bookInfo());
			
		}
	}
	
	
	/**
	 * 
	 * 도서 수정 하는 기능! 
	 * 
	 * 수정할 도서 번호를 입력하세요 :  
	 * 도서번호를 입력받으면 해당객체의 정보를 출력
	 * 
	 * 1. 도서명 2. 도서 저자 3. 도서가격. 4.도서 출판사. 0. 수정종료
	 * 
	 * 어떤 정보를 수정하시겠습니까 ?
	 * 
	 * == 도서 가격 수정 ===
	 * 
	 * 
	 * 
	 */
	public String fixBook () {
		
		/*
		 *도서정보가  bookList 에 하나라도 있는지 검사,
		 *    없다면 "입력된 도서정보가 없습니다" 문자열 반환
		 * 
		 * -  인덱스 번호로 도서를 수정하려고 하는데 ,
		 *   입력된 숫작 0보다 작은지 검사,
		 *   작다면 "음수는 입력할수 없습니다" 반환
		 * 
		 * - booktList 범위 내 인덱스 번호인지 검사 , 
		 * 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 반환
		 * 
		 * -수정할 때 
		 *  1. index 번째에 저장된 도서정보
		 *  수정 전 정보를 출력
		 * 
		 *  2. 번호, 제목 , 저자곳, 가격, 출판사 수정할 값 입력받기
		 * 
		 *  3. 수정이 완료 되었다면, " 000의 정보가 변경 되었습니다" 반환
		 * 
		 * 
		 * 
		 * 
		 * */
		 allBook();
		
		
		System.out.println("======= 도서 수정 ========");
		
		System.out.print("수정 할 도서번호를 입력하세요 ");
	
	boolean flag =true;	
	int input = sc.nextInt();
	
	for(Books b : bookList) {
		
		if (b.getNum() == input) {
		
			
			flag = false;
			
			
			System.out.println("1. "+b.getName());
			System.out.println("2. "+b.getAuthor());
			System.out.println("3. "+b.getPrice());
			System.out.println("4. "+b.getMade());
			System.out.println("5. 수정종료");}

		
		
		
		System.out.print("어떤 정보를 수정하시 겠습니까?");
	
			sc.nextLine();
		
	
		
				int input2 = sc.nextInt();
				
				
		switch(input2) 
		        {
		
		    case 1: System.out.print("수정할 도서명을 입력하세요");
					String inName = sc.nextLine();
					b.setName(inName);return"수정 완료";	
						
		    case 2: System.out.print("수정할 저자명을 입력하세요");
		    		String inAuthor = sc.nextLine();
		    		b.setAuthor(inAuthor);return"수정 완료";	
		    		
		    case 3: System.out.print("수정할 가격명을 입력하세요");
					int inPrice = sc.nextInt();
					b.setPrice(inPrice);					return"수정 완료";	
		    case 4: System.out.print("수정할 출판사명을 입력하세요");
					String inMade= sc.next();
					b.setMade(inMade);
					return"수정 완료";	
		    case 5: 
		    		return"종료";
		    
		    default : 
		    		return"정해진 숫자만 넣어주세요";
		} 
			
	}
		
		if (flag) {
			return"일치하는 도서번호가 없습니다.";
		
		}
		
		return"수정 완료";	
	}	  		
		
	
	
	
	
	
	/**
	 * 있는 도서 삭제시키는 기능
	 * 도서 정보가  Booklist 에 하나라도 있는지 검사,
		 *    없다면 "입력된 도서정보가 없습니다" 문자열 반환
		 * 
		 * -  인덱스 번호로 학생을 수정하려고 하는데 ,
		 *   입력된 숫작 0보다 작은지 검사,
		 *   작다면 "음수는 입력할수 없습니다" 반환
		 * 
		 * - BookList 범위 내 인덱스 번호인지 검사 , 
		 * 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 반환
		 *
		 *  수정과 같은 검사후
		 *  삭제시 
		 *  "정말 삭제하시겠습니까? (Y/N)
		 *  Y를 입력했따면 해당 인덱스에 있는 객체 삭제후
		 *  " 000님의 정보가 제거되었습니다" 리턴
		 *  N을 입력했다면 "취소" 리턴
	 * 
	 */
	public String dellBook() {
		allBook();
		
		System.out.println("================== 도서 삭제 ==================");
		
		
		if (bookList.isEmpty()) {
			
			return "입력된 도서정보가 없습니다. ";
		}
		
		System.out.print("삭제하려는 도서의 번호를 입력해주세요");
		int inNum = sc.nextInt();
		
			if (inNum < 0) {
				return"음수는 입력할수 없습니다";
			}
			
			
		for(Books b : bookList) {
			
			if(b.getNum() == inNum) {
				
				int index = bookList.indexOf(b);
				
				System.out.println("정말 삭제하시겠습니까? (y/n)" );
				
				char ans = sc.next().toUpperCase().charAt(0);
				
				if (ans == 'Y') {
					
					bookList.remove(index);
					break;
				}
				
				if (ans =='N') {
					return"취소";
				}
				else {
					return"둘중하나만 입력해주세요";
				}
			}

		
	}	return"삭제 완료";
		

	}

		
	/**
	 * 즐겨찾기 추가기능 
	 * 그냥 starList를 하나만들었는데
	 * 여기다가 추가시키면 될듯 ?? 
	 * 
	 * 
	 */
	public String starkBookAdd() {
		
System.out.println("=========즐겨찾기 도서 등록 ==========");
		
		System.out.print("도서 번호 : ");
		int  num = sc.nextInt();
		System.out.print("도서 제목 : ");
		String name = sc.next();
		System.out.print("도서 저자 : ");
		String author = sc.next();
		System.out.print("도서 가격 : ");
		int price  = sc.nextInt();
		System.out.print("도서 출판사 : ");
		String made = sc.next();
		
		if(starList.add(new Books(num,name,author,price,made))) {
			// 북리스트라는 ArrayList에 Books 매개변수사용자를이용한 객채를 add 함 ?
			return"등럭 완료 ";
		}
		else {
			
			return"등럭 실패 "; 
		}
		
	}
	
	
	
	
	/**
	 * 즐겨찾기 도서 삭제기능
	 * 똑같이하면될듯 ?
	 * 
	 * 
	 */
	public String starkBookDell() {
		
           starBookAll();
		
		System.out.println("==================즐겨찾기 도서 삭제 ==================");
		
		
		if (starList.isEmpty()) {
			
			return "입력된 도서정보가 없습니다. ";
		}
		
		System.out.print("삭제하려는 도서의 번호를 입력해주세요");
		int inNum = sc.nextInt();
		
			if (inNum < 0) {
				return"음수는 입력할수 없습니다";
			}
			
			
		for(Books b : starList) {
			
			if(b.getNum() == inNum) {
				
				int index = starList.indexOf(b);
				
				System.out.println("정말 삭제하시겠습니까? (y/n)" );
				
				char ans = sc.next().toUpperCase().charAt(0);
				
				if (ans == 'Y') {
					
					starList.remove(index);
					break;
				}
				
				if (ans =='N') {
					return"취소";
				}
				else {
					return"둘중하나만 입력해주세요";
				}
			}

		
	}	return"삭제 완료";
		
		
		
		
	}
	
	
	/**
	 * 즐겨찾기 도서전체 보여주는기능
	 * 걍 똑같이 하면될듯 ?
	 */
	public void starBookAll () {
		
		System.out.println("====즐겨찾기 책목록 ====");
	if (starList.isEmpty()) {
			
			System.out.println("존재하는 책이없오잉");
			return;
		}
		
		for(Books b:starList ) {
			
			System.out.println(b.bookInfo());
			
		}
		
		
		
	}
	
	
	
	/**
	 * 추천도서뽑기
	 * 랜덤북 뽑기 ㅋㅋㅋ
	 */
	public void randomBook() {
		
		System.out.println("==========오늘의 추천도서 !! ============");
		
		int ran = (int)(Math.random()*bookList.size());
		
		System.out.println(bookList.get(ran).bookInfo());
		
	}
	}

	
	



		
	
	     
	
		
	
		
		
	
	
	
	
	
	
		
		
	



