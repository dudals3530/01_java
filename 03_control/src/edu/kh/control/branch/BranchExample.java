package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
		// 1부터 10 까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		// 1 2 3 4 5 << 실행화면
		
		for (int i =1; i <= 10; i++) {
			
			System.out.print(i + " ");
			
			if(i ==5) {
				break;
			}
		}
		
		
	}
	
	public void ex2() {
		
		//입력 받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
	
		String str = ""; // 빈문자열
		
		while(true) {
			
			System.out.print("문자열 입력 (exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			// next ()    : 다음 한단어 (공백 포함 x)
			// nextLine() : 다음 한줄 (공백 포함 o)
			
			// 자바에서 문자열 (String) 비교는 == 연산자 사용 불가 !
			// 비교연산자 (==) 보통 기본 자료형끼리의 연산에서만 사용가능.
			// String 은 기본 자료형이 아닌 참조형!!
			
			
			// equals()메서드
			// 문자열1.equals(문자열2)
			// - > 문자열 1 과 문자열 2가 같으면 true // 다르면 false 반환 
			
			if (input.equals ("exit@")) {
				break;
			}
			str += input + "\n";
			
		}
			System.out.println("==============================");
			System.out.println(str);
		
		
		
	}

	public void ex3() {
		//contiune : 다음 반복으로 넘어감
		
		// 1~ 10 까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		
		
		//  1 2 4 5 7 8 10
		
		for (int i =1; i<=10; i++) {
			
			if (i % 3 == 0) {
				continue;
				
			} // 분기문은 위치가 중요함 
			//  i 가 3일 때는 스킵하고 다시 for문으로 진행 한다고 생각하면될듯 ?
			   
			
			
			System.out.print(i + " ");
			
					}
			
			
		
	}

	public void ex4() {
		
		//1~ 100 가지 1씩 증가하며 출력하는 반복문
		// 단 , 5의 배수는 건너띄고
		//증가하는 값이 40이 되었을때 반복 멈춤
		
		
		 // [실행화면]
		// 1
		// 2
		// 3
		// 4
		// ..... 11
		// 39 
		
		for (int i=1; i<= 100; i++) {
			System.out.println(i);	
			if( i == 40) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
	
		}
		}	
		   
	public void RSPGame() {
		
		/*가위바위보 게임
		 * 몇 판할지 입력받음
		 * 입력받은 판수 만큼반복
		 * 
		 * 컴퓨터 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		 * 1 ~ 3 사이 난 수 생성
		 * 1이면 가위, 2이면 바위 , 3이면 보 지정
		 * 컴퓨터와 플레이어 가위바위보 판별
		 * 플레이어 승 ! / 졌습니다 ㅠㅠ / 비겼습니다
		 * 매판마다 - 현재 기록 :  2승 1무 0패 이런식으로
		 *  
		 *
		 * 
		 * */
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("[가위 바위 보 게임 ~ !!!]");
		 System.out.print("몇판 ? : ");
		 int round = sc.nextInt();
		 
		 // 승 패 기록용 변수 
		 int win = 0;
		 int draw = 0;
		 int lose = 0;
		 
		 for(int i =1;i <= round; i++) {// 입력받은 판수 만큼 반복
			 
			 System.out.println("\n"+ i + "번째 게임");
			 System.out.print("가위/바위/보 중 하나 입력 : ");
			 String input = sc.next();
			 
			 int random = (int)(Math.random()* 3 + 1); // 1 2 3 
			 // math.roandom()" 0.0~ 1.0 사이
			 // 0.0 < = x < 1.0
			 // 0.0 <= x *3 > 3.0
			 // 1.0 <= x*3 +1 <4
			 
			 // -> 1이상 4미만 정수 -> 1 2 3 
			 
			 // switch로 random 값을 문자열 바꾸기
			 
			 String com = null;
			 // null : 아무것도 참조 하고 있지 않음.
			 
			 switch(random){
				 case 1: com ="가위"; break;
				 case 2: com ="바위"; break;
				 case 3: com = "보"; break;
				 // default 값이 우리는 없다는걸 알고있기때문에 null 값으로 값을
				 // 초기화 시켯음
			 }
			 System.out.printf("컴퓨터는 [%s]를 선택 했습니다.\n",com);
			 // 컴퓨터와 플레이어 가위바위보 판별
			 // 비긴 경우
			 if(input.equals(com)) {
				 System.out.println("비겼습니다.");
				 draw++;// 무승부 기록
			
			 }else { // 이기거나 진경우
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");	
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				
				}else {
					System.out.println("졌습니다. ㅠㅠ");
					lose++;
				}
			  
			 }// 바깥쪽 if 문의 끝
			 
			 System.out.printf("현재기록 : %d승 %d무 %d패\n",win,draw,lose);
			 
		 }// for 문의 끝
		 
	}
		 
	public void RSPGame2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[가위바위보 게임 ~!!]\n");
		System.out.print("몇판 ? : ");
		int round = sc.nextInt();
		
		int win = 0;
		int lose = 0;
		int draw =0;
		
		for (int i= 1; i<=round; i++) {
			System.out.println();
			System.out.println(i +"번째 게임");
			System.out.print("가위/ 바위/ 보중 하나입력: ");
			String input = sc.next();
			
			int random = (int)(Math.random() *3 +1);
			String com = null;
			
			switch (random) {
			case 1 : com = "가위";break;
			case 2 : com = "바위";break;
			case 3 : com = "보"; break;
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n",com);
			
			if(input .equals(com)){
				System.out.println("비겼습니다");
				draw++;
			}else {
			 //이기거나 진경우
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!!");
					win++; 
					
				}else {
					System.out.println("졌습니다. ㅠㅠ");
				lose++;
				
				
				}
			}
			System.out.printf("현재기록 : %d승 %d무 %d패\n",win,draw,lose);
			
			
				
		} 
		
		
	}
		
		
		
		
		
		
		
	
	//가위바위보 내가 한번 더해보기	
	
	}
		 
		 
		 
		
	
	
	
	
	
	
	
		 
	
	
	


