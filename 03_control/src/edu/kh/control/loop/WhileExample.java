package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	Scanner sc = new Scanner(System.in);

	public void ex1() {

		/*
		 * while 문
		 * 
		 * - 별도의 초기식, 증감식이 존재하지 않고 반복 종료 조건을 자유롭게 설정하는 반복문
		 * 
		 * ** 확실히 얼마만큼 반복후에끝날지는 모르지만 언젠가 반복 조건이 false 가 되는경우 반복을 종료함.
		 * 
		 *      // while (조건식) { 실행될 문구  }
		 */

		int input = 9;

		while (input != 0) { // input 이 0 이 아니면 무한반복
								// input 이 0이 되면 멈춤
			System.out.println(" ------ 메뉴 선택 -----------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");

			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("떡볶이를 주문했다");
				break;
			case 2:
				System.out.println("쫄면을 주문했다");
				break;
			case 3:
				System.out.println("김밥을 주문했다");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다..");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			// 반복구간이 정해진 횟수만 큼 도는 게아니라 특정 조건에 맞았을때
			// 정지를 시킬수있음
			// while 과 for문의 다른점
		}

	}

    public void ex2( ) {
    	// 입력되 는 모든 정수의 합구하기
    	// 단, 0이 입력 되면 반복종료후 결과 출력
    	// -> 0이 입력 되지 않으면 계속 반복
    	
    	/*
    	 * do {
    	 *    반복 수행 될 코드;
    	 *    -> 무조건 한번은 수행
    	 * 
    	 * }while(조건식);
    	 *
    	 *     //do { 한번이래도 실행될 문구 }
    	 *           while (조건식){조건식이false일때 실행될문구}
    	 *           
    	 *             -- >> 한번이래도 실행문구 -> true 이면 다시 do 문구
    	 *             -->  한번이래도 실행문구  -> false 이면 while 뒤에문구
    	 *                                     -->  후 종료
    	 * */
   
    	int input = 0; // 입력받은 값을 저장 할 변수
    	int sum = 0;  // 합계를 저장 할변수
    
    	do {
    		System.out.print("정수 입력 : ");
    		input = sc.nextInt(); // 한번이라도 실행될 실행문
    		
    		sum +=input;             //sum 값에다가 input 값 누적 더함
    		
    	                       	
    		
    		
    	}while(input !=0); // 조건시 
              
    	System.out.println("합계: " + sum);
    }

    public void ex3() {
    	
    	
    }
}
    
