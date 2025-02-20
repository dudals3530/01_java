package edu.kh.array.ex;

import java.net.MulticastSocket;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
/*
 * 배열 (Array)
 * 
 * -같은 자료형의 변수를 하나의 묶음으로 다루는것.
 * -묶여진 변수들은 하나의 배열명으로 불려지고
 *  구분은 index를 이용함(index는 0부터 시작하는 정수)

 * */
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장 할수 있는 공간 4byte 를 할당하고
		// 그 공간에 num 이라는 이름을 부여.
		
		// 변수 대입
		num = 10;
		// 생성된 num 이라는 변수공간에10이라는 정수값 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값: "+ num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		// ------------------------
		
		// 배열 선언
		int[] arr;
		// int arr[]; <<- 이것도 가능 
		// stack 영역에 int[] 자료형 공간을 4byte 할당 하고 
		// 그 공간에 arr이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할수 있다**
		
		// 배열 할당
		arr = new int[3];
		// new : " new 연산자" 라고하며
		//             Heap 메모리 영역에 새로운 공간(배열,객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 형 변수 3칸짜리 int[] 을 생성 (할당)
		
		// arr = new int[3];
		// int[]    int[]  -> 같은자료형 == 연산가능
		
		// ** HEAP 영역에 할당된 공간은 !절대 ! 비어있을수 없다.
		   // 최초 할당시 Jvm 기본값이 자동 저장된다(컴파일러)
		       // boolean false, 나머지 다 0 , 참조형 null
		
		System.out.println("arr : + "+ arr); // arr 주소값 출력
		
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		// -> Heap 영역에 생성된 공간은 절대 비어있을 수 없다.
		// -> JVA 기본값이 들어가져있다.
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		
		
		// 배열 사용
	
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
	   
		//[10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값을 알고싶을때
		// Arrays.toString(배열명);
		System.out.println( Arrays.toString(arr) );
	
	}

	public void ex2() {
		
		// 배열 선언 및 할당
		
		int[] arr = new int [4];
		
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어잇음
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		//arr[4] = 5000;
		//Exception in thread 
		//"main" java.lang.ArrayIndexOutOfBoundsException: 
		//Index 4 out of bounds for length 4
		// 배열의 인덱스 범위를 벗어남: 길이가 4칸짜리 배열인데,
		// 없는 인덱스번호인 4에 접근했다.
		
		
		//코드에서 빨간줄 에러 : 컴파일 에러
		// 실행했을 때 발생하는 에러 : 런타임 에러
		
		// 배열과 for문
	    // 배열의 길이 (몇칸인가) : 배열명.length
		System.out.println("배열의 길이 : "+ arr.length);
	                                      //length  -> ()소가로가없음
                                              // 메서드가 아니라
		                                     // 키워드같은느낌 호출만
	     for (int i =0; i < arr.length; i++) {
	    	 //i -> 0 1 2 3 
	    	 System.out.printf("arr[%d]에 저장된 값: %d\n",i, arr[i]);
	    	 //"arr[0]에 저장된 값: 100
	    	 //"arr[1]에 저장된 값: 200
	    	
	     }
	
	        // 선언과 동시에 초기화
	     
	     int[] arr2 = {1,2,3,4,5};
	     // stack 영역에 int[] 자료형 공간을 4byte 할당하고
	     // 그공간에 arr2라는 이름을부여
	     // Heap 메모리 영역에 int 5 칸짜리 int 배열을 생성하고
	     // 0번 index 부터 각 요소에 1~ 5 까지 초기화함.
	     // int[] 주소값을 arr2 참조변수가 참조함.
	     
	     System.out.println( Arrays.toString(arr2) );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public void ex3() {
		//5명의 키(cm)를 입력받고 평균구하기
		
		//1번 키 입력 : 170.5
		//2번 키 입력 : 163.7
		// ..
		//5번 키입력: 167.2
		// 평균 : 177.02cm
		Scanner sc =new Scanner(System.in);
		
		double[] height = new double[5];
		//double[]자료형 참조변수 height 를 stack영역에 생성하고
		// height에 heap 영역에 새로 생성된 double 5칸짜리 배열의 주소를
		// 대입
		
		// 배열의 각 요소에 값 대입하는 용도의 반복문
		for (int i =0; i < height.length; i++) {
			//0 1 2 3 4
		    System.out.print((i+1)+ "번 키 입력 : "); //1번키 입력2번키입력 ...
		    height[i] = sc.nextDouble();
		    //height[0] = 170.2
            // ... 
		    //height[4] = 156.3
		}
		
		System.out.println();
		
		double sum = 0; // 합계저장용 변수
		
		// 배열의 각 요소에 대입 되어있는 값을 사용(합계)하는 용도
		for(int i = 0; i < height.length; i++ ) {
			sum += height [i];// 배열의 각 index에 저장된값을 sum에 누적
			//sum = sum + height[i];
			//sum = 0 + 170.2;
			// ....
			
		}
		System.out.print("합계 : "+ sum);
		System.out.printf("평균 : %.2f cm", sum / height.length);
	}

	public void ex4( ) {
		//입력 받은 인원수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력 받을 인원수 : 4
		// 1번 점수 입력 : 100
		// 2번점수 입력 : 80
		// 3번점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 :290
		// 평규 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("입력 받을 인원수: ");
		   int peo = sc.nextInt();
		   
		   int [] score = new int[peo];
		   
		   int sum = 0;
		   
		   for (int i =0; i < score.length; i++) {
			   System.out.print((i+1)+ " 번 점수 입력 : ");
			   score[i] = sc.nextInt();
		        sum += score[i]; 
		   }
			// =============================
		   // - > score 배열의 각 요소가 모두 입력 한 값으로 대입 완료
		   // 최저점 과 최고점의 기준 설정
		   
		   int max = score [0];
		   int min = score [0];
		   
		  
		   
		   for (int i =0; i < score.length; i++) {
			   // 0 1 2 3 
			   
			   // 최고점 비교 
			   if (score[i] > max) {
				   max = score[i];
			   }
			   // 최저점 비교
			   if(score[i] < min ) {
				   min = score[i];
			   }
			   
		   }
		   System.out.println("합계 :"+ sum);
		   System.out.printf("평균:%.2f\n", (double)sum/score.length);
		   System.out.println("최고점 : "+ max);
		   System.out.println("최저점 : "+ min);
		
		
		
		
	
	
	}
	
	public void ex5() {
		// 점심메뉴 뽑기 프로그램
		String[] arr = {"김밥","서브웨이","햄버거","국밥","짜장면","백반"};
		
		System.out.println("오늘 점심메뉴 : " + arr[(int)(Math.random()*6)]); 
		//[(int)(Math.random()*6
		// math.random() : 0.0<= x <~1.0
		//0 1 2 3 4 5 만 나타내고 싶음
		// 0 .0 < = x < 1.0
		// 0.0 < = x*6 < 6.0
		// 0 <= x < 6    int 형 변환 하면 이렇게 표현됨
		
		
	}

	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력 받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		//ex) 
		// 정수 입력 : 200
		// 1번 인덱스에 존재
		
		// 정수입력 : 5
		// 존재 하지 않음
		
		int [] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		boolean flag = false; // 검사 전에는 없다고 가정
		
		
		for(int i = 0; i< arr.length; i++) {
			
			if (arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재");
				flag = true; // 일치 하는 값이 있으므로 true 변경
			}

			
		}
            
		// flag 상태를 검사
		// flag가 false 라면 일치 하는 값을 찾 지 못했다라는 의미
		// 그런데 flag가 false 라면 if 조건식이 false 이므로 수행되지 않음
		// -> ( not 연산자 : 부정 논리 연산자) 붙여줌으로써 true로 변경하여
		// {} 안에 있는 코드를 수행하게끔 함.
		if( !flag) {
            	System.out.println("존재하지 않음");
            }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public void ex7( ) {
		
		// 입력받은 값과 일치 하는 값이 있으면 인덱스 번호 출력
		// 없으면 " 존재 하지 않음 " 출력
		
		String[] arr = {"사과","바나나","딸기", "키위", "멜론", "아보카도"};
		
		/*
		 * 과일 입력 : 아보카도
		 * 5번 인덱스 에 존재
		 * 
		 * 과일 입력 : 수박
		 * 존재 하지 않음
		 * */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("과일 입력: ");
		String input= sc.nextLine();
		
		boolean flag = true ;  // 초기값을 true 든 false 둘다 사용가능
		
		for (int i = 0; i< arr.length; i++) {
			
			if ( arr[i].equals(input) ) { // String 비교할때는 .equals() 사용하기
				System.out.println(i + "번째 인덱스에 존재");
                 flag = false;			
			}
				
		}   if (flag) {
			System.out.println("존재 하지 않음");
		}
		
		
		
		
		
		
		
		
		
	}
	
	public void ex8( ) {
		
		// String 참조형 
		
		String str = "가나다"; // 메모리구조 String Constant pool 에 저장됨
		String str2 = new String("가나다"); // 메모리구조 Heap  새 객체로서 저장
		String str3 ="가나다";
		String str4 = new String("가나다");
		
		System.out.println(str); // 주소값 ? ??
		System.out.println(str2);
		System.out.println(str.toString());
	
		// String 클래스의 toString() 메서드가 존재
		// toString() 메서드는 자기자신을 그대로 반환.
		
		//System.out.println(str); 을 실행하면
		// str.toString()이 자동 으로 호출됨
		//대입해둔 문자열 값 자체가 반환됨 ..
		
		// 주소값 (객체의 해시코드) 를 확인 하고싶다면 아래처럼 사용 ..
		System.out.println(System.identityHashCode(str)); // str의 주소값
		System.out.println(System.identityHashCode(str2)); // str2의 주소값
		System.out.println(System.identityHashCode(str3)); // str3의 주소값
		System.out.println(System.identityHashCode(str4)); // str4의 주소값
		// 근대 이걸 쓸일은 거의 없긴함 ㅇㅇ. .
		
		// String str , str3 는 리터럴 표기로 만들엇을떄 
		// String 상수 풀에 같은 주소값을 찾아서 있으면 그거 그대로 호출해서씀
		
		// String str2 , str4 는 new로 새로운 객체를 만들어기에
		// Heap 메모리에 새로운 주소값을 생성함
		
		String[] strArr = {"사과","바나나", "딸기"};
		// 메모리구조가 어떻게 생겼을까?
		System.out.println( "strArr" + strArr[0]);
		
		
		
		
	}
	
	public void ex9() {
		//1.문자열을 입력받아 한글자씩 짤라내어
        // char 배열에 순서대로 저장	
		//2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지확인
		//3. 단, 일치하는 문자가 없ㅇ들경우 " 존재 하지 않습니다" 출력
		
		/*
		 * ex)
		 * 
		 * 문자열 입력 : hello
		 * [h,e,l,l,o] 
		 * 검색 할 문자 입력 :ㅣ
		 * 2개있음 / 존재 하지 않습니다.
		 * 
		 * 
		 * */
		
		// 사용 해야하는 기술 , 기능
		//1) 배열검색
		//2) 문자열의 길이 구하기 : String.length()
		// ex ) "hello".length() - > 5
		
		//3) String. charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		// ex)" hello".charAt(2) -> 'e'
		       //01234
		
		//4) count (숫자세기)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine(); // hello world[ h,e,l,l,o,,w,o,r,l,d]
		
		//1.입력받은 문자열을 한글자씩 자라내어 char 배열에 저장하기
		char[] arr = new char[input.length()];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = input.charAt(i);   //  - > 문자열에서 특정 index에 위치한 문자를 얻어옴
			//arr[0] = 'h';
			//arr[1] = 'e';
			//arr[2] = 'l';
			//arr[3] = 'l';
			//arr[4] = '0';
			
		}
		
		System.out.println(Arrays.toString(arr));
		 // char 값 배열을 String 으로 바꿔서 출력
	 
		
		//2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		//sc.next() - > String형 
		//String.charAt(0) -> String의 0번째 인덱스 문자하나를 추출해서 char 형태로 반환
		// "h" - > 'h'
		
		int count = 0 ; // 같은글자개수를 세기위한 변수
		
		//[h,e,l,l,o] - > 5
		for(int i = 0; i< arr.length; i++) {
			
			if(arr[i]==ch) {
				count++;
				//arr[i] 값과 검색할문자 ch 가 같은 경우에는 
				// count를 늘려라!
			}
			
		}
		// 결과 출력 
		if(count > 0 ) {
			System.out.println(count +"개 있음");
		}else {
			System.out.println("존재하지않음");
		}
		
		
	}
}
