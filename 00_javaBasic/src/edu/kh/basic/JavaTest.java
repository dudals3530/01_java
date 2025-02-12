package edu.kh.basic;

//git 테스트! 집에서 함 해봄.

// 주석 : 초록색 글씨

// 한 줄 주석 : (컴파일러가 해석하지 않는 부분)

//Hello Wolrd! 

//* 범위 주석
  /* 이사이에 작성 가능 */
/*
 a
 b
 c
 d 
*/

// class : 자바 코드가 작성되는 영역 ( {} 요기 영역에 )
public class JavaTest {

	//main 작성하고 cn + space바 -> 자동완성 가능 메인 메서드
	//main 메서드 : 자바 애플리케이션 (*애플리케이션 : 프로그램)을 실행하기 위해서
	//				반드시 필요한 구문
	
	public static void main(String[] args) {
	    System.out.println("Hello World!");
	    System.out.println("저녁 뭐먹을까?");
	    System.out.println("12345");  // System.out.println(); <<메서드 -- 소가로 안에 콘솔창에 출력해주는 기능
	    // 맨뒤에는 ; 꼭찍어야함
	    // 저장국룰 cn + s
        
	    System.out.println();
	    //syso 작성 후 cn + space -> System.out.prinln(); 자동완성
	    
	    //Cn+ alt+ 방향키 (위아래) : 방향키 방향으로 해당 줄 복사
	    System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        
        
     
        //"" 안에 작성된 코드는 단순 문자열로 인식
        //"" 안에 작성되지 않은 코드는 숫자, 변수로 인식
        System.out.println(50 - 23);
        System.out.println(12 * 13);
        System.out.println(3217 / 3);
        System.out.println(12 % 2); //0  % 이건 나머지를 구하는 연산표시
        System.out.println("14 * 19 = "+ 266); //
        System.out.println("14 * 19 = " + 14 * 19);
        
        System.out.println("90 + 70 +65 = " + 90 + 70 + 65);
        System.out.println("90 + 70 +65 = " + (90 + 70 + 65));
        System.out.println("90 + 70 +65 = " + (90 + 70 + 65));
        
        // 자바는 사칙연산의 우선순위를 그대로따른다. 
        // - >우선계산을 원하면 () 괄호 사용
        
        //+ 기호의 역할
        //-> 숫자 +숫자 = 덧셈 연산 결가ㅗ
        //-> 문자열 + 숫자 or  
        //-> 문자열 + 문자열--> 이어쓰기
        System.out.println("A"+ "B");
        System.out.println("A + B");
        System.out.println("A + B = C");
        System.out.println("A + 1 = C");
        
        
        
	}
	
	    //실행은 위에 재생 버튼이나 
	     // cn + f11 누르면됨
	    
	
}
