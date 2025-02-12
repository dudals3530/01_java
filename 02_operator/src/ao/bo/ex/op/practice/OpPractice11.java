package ao.bo.ex.op.practice;

import java.util.Scanner;


//예제 코드 작성용 (기능용 메서드)
public class OpPractice11 {
     
	//ex1()method : OpPractice 라는 클래스에 포함된
	                  //메서드
	
	public void ex1() {
		
		/*
		 *모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 *인원 수와 사탕 개수를 키보드로 입력 받고
          1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 
          사탕의 개수를 출력하세요. 
		 * 
		 * 인원 수 : 29
          사탕 개수 : 100
          1인당 사탕 개수 : 3
          남는 사탕 개수 : 13
		 * */
		
		   // 100 / 29 % = ?
		
		// 다시풀어보자잉 ?! 
		
		// 키보드를 입력받아 ? = 스캐너솬 
	   Scanner sc = new Scanner(System.in); // 스캐너 솬주문명ㅋㅋ
	                                         //스캐너 솬햇으니깐 임포트해
	                                 
	   System.out.print("사탕수 ?: ");
	   int can = sc.nextInt();            //스캐너 솬만하고 이제 사용하는
	                                      // 주문 int 와 nextint니깐 정수만
	   System.out.print("인원수 ?: ");
	   int peo = sc.nextInt();
	   int can1 = can/peo; 
	   int can2 = can%peo;
	   System.out.println("인원당 받는사탕수 : "+ can1);
	   System.out.print("남는 사탕갯수 : "+ can2);
	   
	                                      //이게 훨 깔끔하누 ?굳
	   
	   
	   
	   
	   
	
		
		
	}
	
	public void ex2() {

		
		//키보드로 입력 받은 값들을 변수에 기록하고 
				//저장된 변수 값을 화면에 출력하여 확인하세요.
				/*
				 * ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75

		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
				 * 
				 * */
		
		// 키보드로 입력 받는거 ? 스캐너솬 ㄱㄱ 
		  Scanner sc = new Scanner(System.in); //스캐너솬 
		                                        //아까 ex1에서 솬한거 다시
		                                       // 못쓰나? - 못쓰넹 ...
		                                        //실행쪽 opc.ex1(); 도
		                                          // 2로 바꾸자
		  
		 System.out.print("키미노나마에와? : ");
		 String na = sc.nextLine();      //스캐너 사용 주문 
		 
		 System.out.print("몇학년이고 ?숫자로만 대답해라잉 : ");
		 int gr = sc.nextInt();
		 
		 System.out.print("몇반이누?숫자로만 대답해라잉 : "); 
		 int cl = sc.nextInt();
		 
		 System.out.print("몇번인디?숫자로만 대답해라잉 : "); 
		 int nu = sc.nextInt();
		 
		 System.out.print("남학생? 여학생? 둘중에하나로만 답해라잉 : ");
		 String se = sc.nextLine();
		 sc.nextLine(); // 요게 이제 스캐너\n 요거 주문
		 
		 System.out.print("마! 공부잠잘하누? 평균몇정두나오누? : ");
		 double ev = sc.nextDouble();
		 
		 System.out.println("ㅇㅋ 알겟음!! 그래서..");
		 System.out.printf("%d학년 %d반 %d번 %s %s에.. 성적은 %.2f 이구먼 "
				 , gr, cl, nu, na, se, ev );
		 
		 //3학년 4반 15번 홍길동 남학생의 성적은 85.75이구먼 .
		  //ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 오케잇
		 
		 
		 
		
		
		 
		 
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
	}

    public void ex3() {
    	
    	/*
    	 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
           세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		 * 
		 * [실행화면]
            국어 : 60
            영어 : 80
            수학 : 40
            합계 : 180
            평균 : 60.0
		 * 
		 * */
    	
    	// 키보드 를 이용해 정수? 로 입력 받아? Scanner 솬!! 
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("국어몇이얌? : ");
    	int ko = sc.nextInt();
    	System.out.print("영어는? : ");
    	int en = sc.nextInt();
    	System.out.print("수학은? : ");
    	int koo = sc.nextInt();
    	int re = ko+en+koo;
    	double ev = (double)re/3.0;
    	
    	                      // 오 gpt 개멋잇네 .. 3.0 을 코드로 구현할수
    	                     // 없는지 물어봣는데 아직 배워보지 못한
    	 // int[] scores = new int[3];?? 가 있엇구먼 ?흠..
    	 // int subjectCount = scores.length; 흠 .. 배열의 길이 ?[] 요게 알아서
    	 // 증감 까지 된다는건가 ? 카운팅을 해준다는건가 ?
    	// 재밋넹 .. 배열.. for루프 ??? 이걸 배워야대는구먼 ㅇㅋ 
    	
    	System.out.println("그럼 총점이 " + re +"에" );
    	System.out.print("평균이 " + ev +"이구먼?");


    	
    	
    	
    	
    	
    	
    }

}
