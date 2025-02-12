package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {

		
	//System.out.println():한 줄 출력용 메서드 (출력 후 줄바꿈 수행)
		
		System.out.println("테스트1");
		System.out.println("테스트2");
		
	 System.out.println("-------------------------");
		
	 
	 //System.out.print():단순 출력용 메서드 (출력후 줄바꿈 X) 
		System.out.print("테스트3");
		
		System.out.println(); // 내용없는 println(): 단순 줄바꿈
		
		System.out.print("테스트4");
		
	  // 줄바꿈 여부 차이점은 있지만 괄호안의 내용이
	  // 그대로  출력 된다는 것은 똑같음
	    
		
		System.out.println();// 바로위에 있어서 줄바꿈해줌
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		
		System.out.println(iNum1 + " + " + iNum2 + " = " +  (iNum1 + iNum2));
		
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2 );
		// \n :은 줄바꿈
	    // 이스케이프 문자 (escape character) : 특별한 의미를 갖도록 하는 용도 사용	
	    
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1 + iNum2 );
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1 + iNum2 );
        
		System.out.println();// 줄바꿈용도로 넣음
		// System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수 나열..);
		
		/*
		 * %d : 정수형, %o : 8진수, %x : 16진수
		 * %c : 문자, %s : 문자열
		 * %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
		 * %A : 16진수 실수
 		 * %b : 논리형
		 *            정수형의 d는 decimal -> 10진수 ? 깨알 지식
		 * 
		 * 
		 * */
		
		// 10 + 10 * 5 / 2 = 35
	  System.out.printf("%d + %d * %d / 2 = %d\n", 
			  iNum1, iNum1, iNum2, iNum1 + iNum1 * iNum2 / 2);
	  
	   // 패턴 연습
	  int iNum3 = 3;
	  
	  System.out.printf("%d\n", iNum3 );
	  System.out.printf("%5d\n", iNum3 ); // 5칸 공간 확보후 오른쪽 정렬
	  System.out.printf("%-5d\n", iNum3 ); // 5칸 공간 확보후 왼쪽정렬
	  
	  // 소수점 자리 제어 (반올림 처리)
	  System.out.printf("%f\n", 10/ 4.0);   // 2.500000
	  System.out.printf("%.2f\n", 10/ 4.0);   // 2.50
	  System.out.printf("%.3f\n", 10/ 4.0);   // 2.500
	  
	  //문자 , 문자열, boolean
	  boolean isTrue = false;
	  char ch = '가';
	  String str = "안녕하세요~!"; // 예는 참조형 ! String 에 S는 꼭 대문자로
	  
	  //false / 가 / 안녕하세요~!
	  
	  System.out.printf("%b / %c / %s\n", isTrue, ch, str);
	  
	  
	  //      \ < -- 이걸표현할때는 2번 시키면됌
	  System.out.println("\\");
	  
	  //        \o/
	  System.out.println("\\o/");
	  
	  //   \t : tab (한공간씩 표현 X , 한번에 공간차지)
	 
	  System.out.println("a\tb\tc\td");
	  
	  // 유니코드 이스케이프
	  System.out.println("\u0041");
	  // 유니코드(16진수)
	  // 65를 16진수로표현
      // 65 나누기 15 몫 4 , 나머지 1	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	   
		
		
		
		
		
	
	
	}

}
