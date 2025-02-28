package com.hw2.model.service;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Books;

public class BooksService {

	private static final int case1 = 0;


	Scanner sc= new Scanner(System.in);
	
	
	private List<Books> bookList = new ArrayList<>();   //도서목록
	private List<Books> starList = new ArrayList<>();   //즐찾 도서목록
	
	
	public BooksService() {
		
		bookList.add(new Books(1111,"세이노의가르침","세이노",6480,"데이원"));
		bookList.add(new Books(2222,"문과남자의 과학공부","유사만",15750,"데이원"));
		bookList.add(new Books(3333,"역행자","자칭",17550,"웅진지식하우스"));
		bookList.add(new Books(1111,"세이노의가르침","세이노",6480,"데이원"));
		bookList.add(new Books(1111,"세이노의가르침","세이노",6480,"데이원"));
		bookList.add(new Books(1111,"세이노의가르침","세이노",6480,"데이원"));
		
		
	}
		
	
	
	
	public void displayMenu() {
		
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
		
		case 1: System.out.println(addBook());          break;
		case 2: allBook() ;      break;
		case 3:fixBook ();         break;
		case 4:// dellBook         break;
		case 5:// starkBookAdd     break;
		case 6:// starkBookDell    break;
		case 7:// starBookSearch   break;
		case 8:// randomBook       break;
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
	public String addBook  () {
		
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
	 * 도서 서치 기능!
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
	public void fixBook () {
		
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
		
		
		
		System.out.println("======= 도서 수정 ========");
		
		System.out.print("수정 할 도서번호를 입력하세요 ");
	
		
	int input = sc.nextInt();
	
	for(Books book : bookList) {
		book.getNum()
	}
		//Books temp = bookList.get();
		
		System.out.println("1. "+temp.getName());
		System.out.println("2. "+temp.getAuthor());
		System.out.println("3. "+temp.getPrice());
		System.out.println("4. "+temp.getMade());
		System.out.println("5. 수정종료");
		
				int input2 = sc.nextInt();
				
				System.out.print("어떤 정보를 수정하시 겠습니까?");
		switch(input2) 
		        {
		
		    case 1: System.out.print("수정할 도서명을 입력하세요");
					String inName = sc.next();
					bookList.get(input).setName(inName);
					break;
		    case 2: System.out.print("수정할 저자명을 입력하세요");
		    		String inAuthor = sc.next();
		    		bookList.get(input).setAuthor(inAuthor);
		    		break;
		    case 3: System.out.print("수정할 가격명을 입력하세요");
					int inPrice = sc.nextInt();
					bookList.get(input).setPrice(inPrice);
					break;
		    case 4: System.out.print("수정할 출판사명을 입력하세요");
					String inMade= sc.next();
					bookList.get(input).setMade(inMade);
					break;
		    case 5:  System.out.println("종료");break;
		    
		    default : System.out.println("정해진 숫자만 입력해주세요");
		
		}while(input2 != 5) {
			
		}
						
		
			
			
			
		}
	
	}





		
	
	     
	
		
	
		
		
	
	
	
	
	
	
		
		
	



