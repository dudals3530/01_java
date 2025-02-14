package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { //기능 제공용 클래스
Scanner sc= new Scanner(System.in);
	public void ex1() {
		// for 문이용 
		
		// 1~ 10 까지 콘솔창에 쪼르륵 출려 되게끔 해보자
		//for (초기값; 조건식; 증감식) {syso 변수} 하면 될듯 ?
		               
		for(int i = 1; i <= 10; i++  ){System.out.println(i);
			
		}
		
		
		
		
		
		
		
	}
	
	public void ex2() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		
		
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		//for (초기식; 조건식; 증감식) { true 값}
		
		for(int i = 'A';i<= 'Z';i++) {
			System.out.print((char) i);}
		
	   	    System.out.println();
	   for(char i = 'A';i<= 'Z'; i++) {System.out.print(i);}
	

	}

	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		// 1~ n 
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		
		for(int i = 1; i <=num; i++ ) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
	}
	
	public void ex4( ) {
		// 정수 5개를 입력받아서 합계 구하기
		
		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		//입력 3: 30
		// 입력 4 :40
		// 입력 5 : 50
		
		// 합계 출력 : 150
		
		int sum = 0; // 요게 살짝 중요하네 >> 느낌이 
		                   
		
		for(int i = 1; i <= 5;i++) {
			System.out.print("입력 "+ i + ": ");
			int input = sc.nextInt();
		  // sum에 입력받은 input 값 누적
			//sum = sum + input
			sum += input;
		
		}
	          
		System.out.println("합계 : "+ sum);
	         
		
			
		
		
		
		
	
	
	}
// 포문이용한 입력값 합 구하기
	public void ex5() {
		//1부터 20까지 1씩 증가하면서 ㅊ ㅜㄹ력
		// 단, 입력받은 수의 배수는 양쪽에 ()표시
		
		//[실행화면]
		//괄호를 표시할 배수 :
		// 1 2 (3) 4 5 (6) 7 8 (9) .... 20
		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) ... 20
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % num == 0) {
				System.out.print("("+ i + ")");
				
			}else {
				System.out.print(i + " "); 
			}
			
		 
			
		}
		
		
		
		
		
	}
 // 포문 안에 if문 다시 풀어보자
	public void ex6( ) {
		//[구구단 출력]
		// 2~ 9 사이 수를 하나 입력 받아
		//해당 단을 출력
		//단 , 입력 받은 수가 2~9 사이 숫자가 아니라면
		//"잘못 입력하셨습니다 " 출력
		
		/*
		 * 단 입력 : 5
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 * ... 5 X 9 =45
		 * */
	System.out.print(" 단 입력 : ");
	int num = sc.nextInt();
	 
		if (num > 0 || num <= 9) {
			
			for(int i = 1; i <=9; i++) {
				
				System.out.printf("%d X %d = %d\n",num,i,num*i);
				
			}
			
			
		}else {
			System.out.print("잘못 입력하셧습니다");
		}
			
			
		
		
		
		
		
		
		
		
		
	}
//  구구단 다시풀어보기
	public void ex7() {
	 //숫자 세기 count
		
		//1부터 20까지 1씩 증가하면서
		//입력 받은수의 배수의 총개수 출력
		// 입력받은 수의 배수의 합계출력
		//[실행화면] 
		//배수입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		//힌트 
		// 필요한 변수가 뭐 가있을까?
		
		int count = 0; // n의 배수의 개수를 세기위한 변수
		// count 증가
		int sum = 0;    // n의 배수의 합계를 구하기 위한 변수
		String result = " ";
		// 왜 String result = " " ; 이게 어떻게 된거지 ? 이게 이해가안간다
		 // " " 이건  " " + " " + "  " = 아무리많이더해도  " " 이거라는것ㅎ
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			//증갈 할떄마다 input 갑 과 같은지
			if ( i % input ==0) {//배수일때
				result += i + " ";// "3 "
				count++; // 갯수세기
				sum += i;  // 합계 누적
				
			}
			
			
		}
		
		System.out.printf("%s : %d개\n",result,count);
		System.out.printf("%d의 배수 합계 : %d",input, sum);
		
		
		
		
		
		
		
		
		
	}
// for 문 예제
	public void ex8() {
		// 구구단 모두 출력하기
		// 단을 맡을 for문 필요
		// 곱해지는 수가 안쪽 for문 
		
		for (int dan = 2;dan <= 9; dan++)//단은 2단 ~ 부터 9단이라 2부터시작 {
		  {  for (int num = 1; num <= 9; num ++)// 각단에 곱해질 수 1~9까지차례
		          {System.out.printf("%d X %d = %2d ",dan, num, dan*num);}
		         
			
		
		System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
	}
// for 문안에 for 문으로 구구단 만들어보기
	
	public void ex101() {
		/*
		입력: 10
        출력:
        짝수: 2, 4, 6, 8, 10
        홀수: 1, 3, 5, 7, 9
*/
		  System.out.print("입력: " );
		  int num1 = sc.nextInt();
		  
		  if (num1 >=1 && num1 <= 20) {
			  System.out.print("짝수: ");
			  for(int i = 1; i <=num1; ++i) {
				  if(i % 2 ==0) {
					  System.out.print(i+" ");
					  
				  }
					  
				  
				  }
				 System.out.println();
			  System.out.print("홀수: ");
		        for(int i=1; i< num1; ++i) {
		        	if (i % 2 !=0) {
		        		System.out.print(i +" ");
		        	}
			  }
			  
			  
			  
		  }else {
			  System.out.println("잘못입력하셨습니다.");
		  }
		  
		
		
		
		
	}
      // 내가만든예제
	public void ex102() {
		/*
        입력: 15
        출력:
        3의 배수: 3, 6, 9, 12, 15
        5의 배수: 5, 10, 15
        */
		// 1~ 20 까지 숫자만 입력
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		if(num>=1 && num <=20) {
			System.out.println("출력");
			System.out.print("3의 배수:");
			for(int i =1; i<= num; ++i) {
			if	(i % 3 ==0) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.print("5의 배수: ");
			for (int i1 =1; i1<= num; ++i1) {
				if (i1 % 5 ==0) {
					System.out.print(i1+ " ");
					
				}
				
			}
			
		
				
				
				
			}
			
			
			
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		
		
		
		
	}





}
