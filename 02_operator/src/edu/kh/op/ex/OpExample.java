package edu.kh.op.ex;

import java.util.Scanner;

// 예제 코드 작성용 클래스( 기능용 /메서드용)
 
	public class OpExample {
	 
		//ex1() method : OpExample 이라는 클래스에 포함된 메서드
		public void ex1() {
			
		   //증감(증가, 감소) 연산자 : ++ , --
			//1을 더하거나 감소시키는 연산자
			
			int iNum1 = 10;
			int iNum2 = 10;
		    
			iNum1++;
			iNum2--;
			
			System.out.println("iNum1 :"+ iNum1);
			System.out.println("iNum2 :"+ iNum2);
		    
			//전위 연산
			int temp1 = 5;
			System.out.println(++temp1 + 5);
			                 // 6 + 5 -> 11
			
			
			//후위 연산
            int temp2 = 3;
            System.out.println(temp2-- + 2); //5
            //                   3 + 2 - > 5
            //                   3-- ->2 * 우리눈에는 안보임
                                  // 아래 프린트 구문 찍어보면 2라고바뀐걸
                                        //알수있음
                     // *우선순위가 중요함 *
            
            System.out.println(temp2);
		
			int a = 3;
			int b = 5;
			int c = a++ + --b;
			
			//    3 ++ + --5
			//    3 ++ + 4(b)
			//    c = 7
			//    3++ -> 4(a)
			
			
			// 최종적으로 a,b,c 는 각 각 얼마로 출력 ㅗ딜까?
			System.out.printf("%d /%d / %d\n ", a, b, c);
			
			// a 4  b4  c 7   >> 내가 처음 생각해본값 .
                    // 오 맞앗어 ... ㅅㅂ .. 			
			
		}
 			
		public void ex2() {
			// 비교 연산자 : > < >= <= == !=
			//-비교 연산자의 결과는 항상 논리값(t/f)
			
			int a = 10;
			int b = 20;
			
			System.out.println( (a == b) == false);
	                             //(false) == false
			                       // - > true
			
		
		 int c = 4;
		 int d = 5;
		 
		 System.out.println((++c !=d) == (--c != d) );
		                    // 5 != 5       4 != 5   
		                    //   f            t
		                    //   f   ==  t
		                    //    -> false
		                    //f -- > 내가 생각한답 .. 
		 
		System.out.println("----------------");
		 
		 System.out.println(100 > 99);
		 System.out.println(100 >= 100);
		 System.out.println(99 < 64);
		 System.out.println(99 <= 100);
		 System.out.println(101 <= 100);
		 
		 // = 은 항상 오른쪽
		 
		 
		
		
		
		}
			
		public void ex3() {
			 // 논리 연산자 : &&(AND),  ||(OR)
			
			//&& (AND) : 둘다 true 면 true, 나머지는 false
			// 와 , 그리고 , ~이면서 , ~부터 ~까지, ~사이

			 // a는 100 이상이면서 짝수인가?
			
			int a = 101;
			System.out.println((a >= 100) && (a % 2 == 0) );
		                                     // false
			
			int b = 5;
			// b는 1부터 10까지 숫자 범위에 포함되어있는가?
			// 1~ 10 b
			System.out.println((b >= 1) && (b <= 10) );
			
			// || (OR) : 둘다 false면 false , 나머지 true
		    // 또는 , 혹은 , ~거나
			int c = 10;
			// c는 10을 초과하거나 짝수인가?
			
			System.out.println((c > 10) || (c % 2 == 0));
			                             // true
			
			
			
			
			
			
			
		
			
			
			
			
			
			
		
		}
			
		public void ex4() {

//삼항 연산자 : 조건식 ? true 일때 수행될값 : false 일때 수행될 값.
		// * 조건식 : 연산결과가 t/f 인 식	
			
			int num = 30;
			
			// num 이 30보다 크면(초과) "num 은 30보다 큰수이다"
			//   아니면 "num 은 30 이하의 수이다" 출력
      String result = num > 30 ? "num 은 30보다 큰수이다" : "num 은 30 이하의 수이다" ;
			
          // 조건문 먼저 쓰고 
          // 출력할값 "" 을 씀  "어쩌구" : "저쩌구"
         // 앞에 String result = 
         // 이걸 출력하면됨
		
      
      System.out.println(result);
			
			// 입력 받은 정수가 음수인지 양수인지 구분
            // 단, 0은 양수로 처리
	       
            // Scanner 생성
          
            //ex) 
            //정수 입력 : 4
            // 양수 입니다. 
            // 정수 입력 : -5 
            // 음수 입니다.
            
      Scanner sc = new Scanner(System.in);
      
          
      System.out.print("정수 입력 : ");
      
      int input = sc.nextInt();
       // 난 왜 이게 기억이 안나지 ..
       
      String result2 = input >= 0 ? "양수 입니다." : "음수 입니다.";
      
      System.out.println(result2);      
      
      System.out.println("------------");
      
		
		
		
		}
		
		
		
		
	

}
