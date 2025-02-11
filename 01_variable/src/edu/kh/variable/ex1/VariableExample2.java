package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 자바 기본 자료형
		 * 
		 * 논리형 : boolean ( 1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte) 
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char (2byte , 유니코드)
		 * 
		 * 
		 * 참조형 - 문자열 String 
		 *
		 *  
		 */
		 
		// 변수 선언 : 메모리(RAM) 에 값을 저장할 공간을 할당 하는 것.
		// 변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		boolean booleanData; // -> 변수의 선언
		// 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 booleanData 라고부르겠다.
 
		 booleanData = true; //booleanData 변수에 true 논리값 집어넣기 (대입)
	      
		 System.out.println("booleanData : " + booleanData );
        
		 byte byteNumber = 127;  // 128 넣는순간 에러 (값의 법위 -128 ~ 127 까지다 byte는)
		 //메모리에 정수값을 저장할 공간을 1byte 할당하고
		 // 할당된 공간을 byteNumber 라고 부르겠다.
		 //선언된 byteNumber 변수에 처음으로 (초기값) 127 을 넣음
		 // --> 초기화 :처음 변수에 값을 대입
		 
		  short shortNumber = 32767;
		  
		   // 정수 자료형 기본형 ! int (short , byte 는 옛날 코드 잔재들임 잘안쓰임)
		  int intNumber = 2147483647;
	// 자료형  변수명  대입연산자  리터럴;
		  //프로그래밍에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로도 표현
		  
		     // ** 리터럴 : 변수에 대입 되거나 작성되어지는 값자체.
		     // 자료형에 따라 리터럴 표기법이 다름.
		 
		   long longNumber = 100000000000l; // l 또는 L 로 long의 리터럴표기를 해줘야됨.
		   // The literal 100000000000 of type int is out of range
		   //-> 100 억이라는 값은 int 의 범위를 벗어났다.
		   //-> 리터럴 값 자체를 int 로 인식하고있다.
		   // - > 뒤에 L을 붙여줌으로써 long 자료형인것을 나타내줌.
		 
		  float floatNumber = 1.2345f; // f 또는 F 로 float 의 리터럴표기를 해줘야댐
		  // 1.2345까지만 쓰면 double 자료형으로 인식하기 때문에
		  // 변수타입인 float과 일치하지 않아 Tpye mismatch 라는 에러가 발생함.
		  
		  double doubleNumber = 3.141592d;
		  // double이 실수형 중에서 기본형!
		  // 리터럴 표기법 없는 실수는 double로 인식
		  // d를 쓸수는 있다!
		  
		  //문자형(char) 리터럴 표기법: ' '(홑따옴표)
		  // -> 문자 하나
		  
		  char ch = 'A';
		  char ch2 = 66;
		  char ch3 = 97;
		  char ch4 = 0041;
		  System.out.println("ch :"+ ch);
		  System.out.println("ch2 :" + ch2);
		  System.out.println("ch3 :" + ch3);
		  System.out.println("ch4 :" + ch4);
		  
		  /*
		   * char 자료형에 숫자가 대입될 수 있는 이유!
		   *  -컴퓨터에는 문자표가 존재하고있음
		   *  숫자에 따라 지정된 문자모양이 각각 매핑되고
		   *  'B'문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		   *  - > 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것도 가능함.
		   *  
		   */
		  
		  // 변수 명명 규칙
		  
		  // 1. 대소문자 구분, 길이 제한은 없다
		    int abcdefG123456789; //G가 다름
		    int abcdefg123456789; 
		    
		  // 2. 예약어 사용 X 
		         // ex ) public, int , short , char , package 등등 
		                  //이미 지정 되어있어서 안됨.
		    //double final; << -- 이따구로 쓰면 안됨.
		    
		    // 3. 숫자 시작 X 
		    char a1bc;
		   
		    // 4. 특수문자 $ , _ 만 사용 가능 (하지만 쓰지 않는다.)
		    int $intNumber; // 문제는 없음
		    int int_number; // 자바는 카멜표기법으로 쓰기때문에 _ 를 잘 안씀
		                    // _작성 표기법은 DB에서 사용
	                                    // * DB에서는 주로 대문자를 씀 	                    
		                    // 자바의 상수에서 사용
		                    // MEMBER_NAME 
		    
		     // 5. 카멜표기법 (맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		    char helloWorldAppleBananaTomato;
		    
		    //6. 변수명은 언어를 가리지 않는다. (하지만 쓰지 않는다. 한글도 가능한대 잘안씀)
		    int 정수1번;
		    double 실수2번 = 3.14;
		    System.out.println("실수2번 = "  + 실수2번);
		    // ---------------------------------
		 
		    
		     final double PI_VALUE = 3.14;
		     
		     //PI_VALUE = 2.33; // 에러!! 재대입 불가
		    /*
		     * 상수 (항상 같은수 )
		     * - 변수 의 한 종류
		     * - 한번 값이 대입 되면 다른 값을 재대입 할 수 없음!
		     * - 자료형 앞에 final 키워드를 작성 
		     * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 _ 사용
		     * 
		     * - 상수를 사용 하는 경우
		     * 1) 변하면 안되는 고정된 값을 저장 할때 ex) pie = 3.14 final double PI_VALUE = 3.14;
		     * 2) 특정한 값에 의미를 부여하는 경우
		     * 
		     * 
		     * 
		     * 
		     * 
		     * */		 

		     final int MIN_AGE = 1;
		     final int MAX_AGE = 130;
		     final int LEFT_MOVE = -1;
		     final int RIGHT_MOVE = 1;
		     
		     System.out.println(1 + 1.3);
		     
		     
	
	}
	
}
		     


		    
		    
		    
		 
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		 
		  
		  
		 
		 
		 
