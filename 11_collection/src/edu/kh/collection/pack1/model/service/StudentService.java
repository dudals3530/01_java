package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;


 
 

public class StudentService {

	// java.util.List 인터페이스 : List에 반드시 필요한 필수기능을 모아둔 
	                          //  인터페이스다
	
	//*인터페이스 객체 생성 X, 부모 참조변수   o
	
	// java.utill.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	
	// new ArrayList() : 기본생성자
	// 하지만 리스트의 크기는 늘었다 줄었다 하기 대문에 큰의미없음
	
	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>();// 검색 (조회) 효율적
	//private List<Student> studentList = new LinkedList<>();// 추가, 수정, 삭제 효율적
	// 다형성 중 업캐스팅 적용!
	// 부모타입(List) 참조변수(studentList) = 자식객체(ArrayList) 주소
	
	private Scanner sc= new Scanner(System.in);
	
	public StudentService() {
		studentList.add(new Student("홍길동",23," 서울시 중구", 'M', 100));
		studentList.add(new Student("고영희",21," 경기도 안산시", 'F', 100));
		studentList.add(new Student("강아지",30," 서울시 중랑구", 'M', 80));
		studentList.add(new Student("오미나",24," 용산시 어쩌구", 'M', 150));
		studentList.add(new Student("박주희",25," 서울시 중구", 'F', 190));





	
				
			
		
	}
	
	
	
	
	/*
	private List<Object> testList = new ArrayList<Object>();
	
	public void ex() {// List 테스트용 예제
		
		
		// List.add(Object e) : 리스트에 객체를 추가 
		// 매개변수 타입이 Object == 모든 객체 매개변수로 전달할수 있음
		
		testList.add("문자열");
		testList.add(new Student("홍길동", 25, "서울시중구" , 'm',90));
		testList.add(sc) ;
		testList.add(new Object() );
		
		// 컬렉션 특징 : 여러타입의 데이터를 저장 할수 있다!
		
		// Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환
		// 반환형이 Object == 모든 객체를 반환 할 수 있다.
		
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
		
		// testList 에 꺼내온 인덱스 요소가 Student 혹은 상속 관계인지 검사
		// 만약 Student 라면 이름을 꺼내오고싶다
		
		for(Object e :testList) {
			if (e instanceof Student) {
				System.out.println(((Student)e).getName());
				                     // e 는 Object 이기 때문에 name 을뽑기위해서는
				                    // Student 타입으로 다운캐스팅으로 처리하고
									//  () 우선순위 연산자 땜시 
				                    // ((Student)e). getName() 으로 처리해야된당
			}
			
		}
			
	*/
		/**
		 * 메서드 설명용 주석
		 * alt shift j : 
		 * @author 김영민(dudals3530@naver.com)
		 */
		public void displayMenu() {
			
			int menuNum = 0 ; // 메뉴 선택용 변수
			
			do {
				System.out.println("\n======학생관리 프로그램 =========");
				System.out.println("1. 학생정보 추가");
				System.out.println("2. 학생정보 전체조회");
				System.out.println("3. 학생정보 수정");
				System.out.println("4. 학생정보 제거");
				System.out.println("5. 이름으로 검색 (일치)");
				System.out.println("6. 이름으로 검색 (포함)");
				System.out.println("7. 나이순으로 정렬"); // Comparable 사용
				System.out.println("8. 이름순으로 정렬"); // Comparator 사용
				System.out.println("0. 프로그램 종료");

				System.out.print("메뉴번호 선택: ");
				
				try { 
					menuNum = sc.nextInt();
					sc.nextLine(); // 입력버퍼 개행문자 제거용
					
					switch(menuNum) {
					case 1: System.out.println( addStudent() );break;
					case 2: selectAll();break;
					case 3: System.out.println(updateStudent());;break;
					case 4: System.out.println(removeStudent());;break;
					case 5: searchName1();break;
					case 6: searchName2();break;
					case 7: sortByAge();break;
					case 8: sortByName();break;
					case 0: System.out.println("프로그램종료 ..");break;
					default : System.out.println("메뉴에 작성된 번호만 입력해주세요");
					
					}
				
					
				}catch(InputMismatchException e) {
					System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시시도해주세요");
					
					sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거
					
					menuNum = -1; // 첫 반복 시 잘못 입력하는 경우
					// menuNum 이 초기값인 0을 가지고 있어 반복문이 종료되는데,
					// 이를 방지하기 위해서 임의값 -1 대입
				
				}
				
				
			}while(menuNum !=0);
			
			
			
		}

		/**
		 * 1. 학생 정보 추가 메서드
		 * 
		 * @return 삽입 성공시 " 성공", 실패시 "실패" 문자열 반환
		 */
		public String addStudent() {
			// Checked Exception : 반드시 throws 구문이나 try- catch 처리 강제
			// IOException, SQLException ..
			
			// Unchecked Exception : 강제처리 X , 예외 발생하면 자동으로 상위 호출 메서드
			// 예외 가 전파됨
			// InputMisatchException, NullPointerException, ... 
			
			
			System.out.println("===============학생 정보 추가 ============");
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine(); //입력버퍼 개행 제거용
			
			System.out.print("사는 지역: ");
			String region = sc.nextLine();
			
			System.out.print("성별 M/F : ");
			char gender = sc.next().charAt(0); // 'M' or 'f'
				
			
			System.out.print("점수 : ");
			int score = sc.nextInt();

			//Student 새 객체 생성후 studentList 에 추가
			
			if(studentList.add(new Student (name,age,region,gender,score)) ){
				
				return"성공";
				                     // 이부분 어렵네 .. 다시한번 봐보자..
			}else {
				
				return"실패";
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		/**
		 * 2. 학생 전체 조회 메서드
		 * 
		 * - List가 비어있는 경우 "학생정보가 없습니다" 출력
		 * - 있는 경우 전체 학생 출력
		 */
		public void selectAll() {
			System.out.println("======학생 전체 조회 ==========");
			
			// studentList가 비어있는지 확인
			// List 에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
			
			//if(studentList.size() == 0) {
			//boolean List.isEmpty() : 컬렉션이 비어있다면 true 반환
			if(studentList.isEmpty()){
				System.out.println("학생정보가 없습니다.");
				return; // 현재 메서드를 종료하고 호출한곳으로 돌아감.
			}
			
			// 일반 for 문
			/*for (int i = 0; i < studentList.size(); i++) { // -> length (X) 
				System.out.println(studentList.get(i));
				
			}*/
			
			
			// 향상된 for 문 (for each 문)
			// - 컬렉션, 배열의 모든 요소를 순차적으로 반복접근 할수 있는 for 문
			
			int index = 0 ;
			for(Student std : studentList) {
				System.out.print((index++) + "번 : "); // 후위연산이 연산순위가 낮기때문에
				                                       // 0번부터시작
				                                        // 만약 ++index 면 1부터시작
				System.out.println(std);
			}
			

		}
			
		
		
		/**
		 * 3. 학생 정보 수정 메서드
		 * 
		 * - 학생 정보가  studentList 에 하나라도 있는지 검사,
		 *    없다면 "입력된 학생정보가 없습니다" 문자열 반환
		 * 
		 * -  인덱스 번호로 학생을 수정하려고 하는데 ,
		 *   입력된 숫작 0보다 작은지 검사,
		 *   작다면 "음수는 입력할수 없습니다" 반환
		 * 
		 * - studentList 범위 내 인덱스 번호인지 검사 , 
		 * 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 반환
		 * 
		 * -수정할 때 
		 *  1. index 번째에 저장된 학생정보
		 *  수정 전 정보를 출력
		 * 
		 *  2. 이름, 나이 , 사는 곳, 성별, 점수 수정할 값 입력받기
		 * 
		 *  3. 수정이 완료 되었다면, " 000의 정보가 변경 되었습니다" 반환
		 * @return
		 */
		public String updateStudent() {
			
			System.out.println("======학생 정보 수정=======");
			
			System.out.print("인덱스 번호 : ");
			int index = sc.nextInt();
			
			// 1) 학생 정보가 studentList에 하나라도 있는지 검사
			if (studentList.isEmpty()) { // studentList가 비어있으면 true
				return "입력된 학생정보가 없습니다";
			
			}else if(index < 0) {//인덱스 번호로 학생을 수정하려고 하는데 , *   입력된 숫작 0보다 작은지 검사,
				
				return "음수는 입력할수 없습니다";
				
			}else if(index >= studentList.size()) {//초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 반환
				return"범위를 넘어선 값을 입력할수 없습니다";
			
			}else {
				// 수정 코드 작성
				// 1. index 번째에 저장된 학생정보 출력
				System.out.println(index + "번째에 저장된 학생정보");
				System.out.println(studentList.get(index));
				
				//2. 수정할 내용 입력받기
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				sc.nextLine(); //입력버퍼 개행 제거용
				
				System.out.print("사는 지역: ");
				String region = sc.nextLine();
				
				System.out.print("성별 M/F : ");
				char gender = sc.next().charAt(0); // 'M' or 'f'
					
				
				System.out.print("점수 : ");
				int score = sc.nextInt();
				
				// 입력받은 index번째에 수정할 학생정보를 세팅 - > 수정
				// index 번째에 있던 기존 학생 정보가 반환되고, 그객체를 temp 에저장
				Student temp =studentList.set(index,new Student(name,age,region,gender,score));
				
				return temp.getName()+"의 정보가 변경되었습니다";
			}
			
		}
			
		
		/**
		 *- 학생 정보 제거 메서드
		 *
		 *학생 정보가  studentList 에 하나라도 있는지 검사,
		 *    없다면 "입력된 학생정보가 없습니다" 문자열 반환
		 * 
		 * -  인덱스 번호로 학생을 수정하려고 하는데 ,
		 *   입력된 숫작 0보다 작은지 검사,
		 *   작다면 "음수는 입력할수 없습니다" 반환
		 * 
		 * - studentList 범위 내 인덱스 번호인지 검사 , 
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
		public String removeStudent() {
			
			// Student List.remove(int index);
			// 리스트에서 index 번째 요소를 제거
			// 이때 제거된 요소가 반환됨.
			// * List 중간에 비어있는 인덱스가 없게하기위해서
			// remove() 동작 시 뒤쪽 요ㅗ소를 한칸씩 자동으로 당겨온다.
			
			System.out.println("========= 학생 정보 제거 ==========");
			
			System.out.print("인덱스 번호를 입력해주세요 : ");
			int index = sc.nextInt();
			// 1) 학생 정보가 studentList에 하나라도 있는지 검사
			
			if (studentList.isEmpty()) { //학생정보가 하나도 없으면 true
				return "입력된 학생정보가 없습니다 " ;
			
			    //입력된 숫작 0보다 작은지 검사,
			}else if (index < 0) {
				return "음수는 입력할수 없습니다";
			
				//studentList 범위 내 인덱스 번호인지 검사 
			}else if (index >= studentList.size()) {
				return "범위를 넘어선 값을 입력할 수 없습니다 ";
				
				
			}else {  //삭제시 
				 /*  "정말 삭제하시겠습니까? (Y/N)
				 *  Y를 입력했따면 해당 인덱스에 있는 객체 삭제후
				 *  " 000님의 정보가 제거되었습니다" 리턴
				 *  N을 입력했다면 "취소" 리턴*/
				System.out.print("정말 삭제하시겠습니까?(Y/N) :  "); 
				char chr = sc.next().toUpperCase().charAt(0);
				// "y" -> "Y" - > 'Y' 
				
				if (chr == 'Y') {
					Student temp = studentList.remove(index);
					
					return temp.getName() + "의 정보가 제거되엇습니다";
					
				}
					return "취소";
					
						
	
				
				
			}
			
			
			
			
		}
			
		
		/**
		 * 5. 이름이 전부 일치하는 학생을 찾아서조회하는 메서드 (완전일치)
		 * 
		 * - 검색할 이름을 입력 받아 studentlist 에서 꺼내온 
		 * Student 객체의 name 값이 같은지비교
		 * 
		 * - 일치하는 경우 Student 객체 출력
		 * - 일치하는 게 없다면 "검색결과가 없습니다" 출력
		 * 
		 */
		public void searchName1() {
			
			System.out.println("====== 학생 검색(이름 완전일치)=======");
			System.out.print("검색 할 이름 입력(완전일치):  ");
			String input = sc.next();
			
			boolean flag =true;
			
			//향상된 for 문
			for(Student std : studentList) {
				
				if (input.equals(std.getName())){ //이름이 일치하느 ㄴ경우
					System.out.println(std);//std.toString();;
					
					flag =false;
				}
			}   // 여기까지 포문 돌떄까지 검색을 못찾으면 아직까지독flag는 true 임
			
			if(flag) {// 그래서 여기서 flag 가 아직까지 true 라면 검색결과가없다고 설정시킴
				System.out.println("검색 결과가 없습니다");
			}
		}
		
		
		/**
		 *6. 이름이 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
		 *
		 * 문자열 입력받아 studentLinst 에서 꺼내온 Student 객체의 
		 * name 값에 포함되는 문자열인지 검사
		 * 
		 * - 포함되는 학생객체를 찾은 경우 Student 객체 출력
		 * - 없다면 " 검색결 과 가 없음" 출력
		 * 
		 * 
		 */
		public void searchName2() {
			
			System.out.println("=========학생 정보 검색 (이름 부분 포함) =======");
			System.err.print("이름에 포함되는 문자열 입력 : ");
			String input= sc.next();
			
			boolean flag = true;
			
			for(Student std :studentList) {
				
				//boolean값 반환하는  String.contains(문자열) 이걸 쓰면됌
				//boolean String.contains(문자열) : String에 (문자열)이 포함되어있으면 true
				
				if(std.getName().contains(input) ) {
					System.out.println(std);
					flag = false;
				}
				
			}
			if(flag) {
				System.out.println("검색 결과가 없습니다.");
				
			}
			
			
		}


		/*
		 * List를 정렬하는 방법
		 * 
		 * 방법 1: Cmparable 인터페이스 상속 받아 compareTo() 메서드 재정의
		 * Student 에 Comparable 인터페이스를 상속받아 오버라이딩한 CompareTo() 에
		 * 정의한 대로 정렬됨(나이 오름차순, 내림차순 ..... )
		 * 
		 * 방법 : Comparator 클래스에 의한 정렬 compare()사용 (익명내부 클래스 이용)
		 * 익명 내부 클래스 : 이름이 없는 클래스를 즉석에서 선언해서 한번만 사용 할 목적으로 작성
		 * 객체를 생성하면서 바로 구현 내용을 정의할수 있음
		 * 익명 내부 클래스장점
		 * 코드 간결화(별도로 클래스를 만들지 않아도 될때 사용)
		 * 즉시 사용(한 번만 사용할 Comparator 등을 정의할 때 유용함)
		 * 지역화 (특정 메서드 안에서만 필요할때)
		 * 
		 * 
		 * 
		 * */

		/**
		 * 7. 나이에 따라 오름차순 정력
		 * 
		 * 
		 * 
		 */
		public void sortByAge() {
			
			Collections.sort(studentList);
			
			for(Student std : studentList) {
				System.out.println(std);
			}
			
		}
		
		
		/**
		 * 8. 이름에 따라 정렬하기
		 *      가나다순으로
		 *       
		 * 
		 */
		public void sortByName() {
			
			Collections.sort(studentList, new Comparator<Student>() {
												//익명 내부클래스
												//Comparator 인터페이스를 상속받아
				 								// 구현한 구현체 (== 클래스)
				@Override
				public int compare(Student o1, Student o2) {
					// 이름 비교
					return o1.getName().compareTo(o2.getName());//name은 String형이랑 
					                                             //compareTo 로 비교
			    //String.compareTo() : 자바에서 객체를 비교한느 메서드
				//(String이 Comparable을 상속받아재정의해둔 compareTo()메서드를 이용하는것)
				
				//compareTo() : 두객체를 비교하고 순서 결정함
				// 반환값: 0 (같음), 양수(왼쪽ㄱ개체가 더큼), 음수 (왼쪽객체가 더작음)	
				}
			
				
			});
			
			for(Student std : studentList) {
				System.out.println(std);
			}
			
		}
		
}
			
			
				
				
		

	
  	
	
	
	
	


