package ao.bo.ex.op.run;

import ao.bo.ex.op.practice.OpPractice11;

//실행용 클래스 : 메인메서드 존재

public class OpRun {

	//메인 메서드 필수 작성
	public static void main(String[] args) {
		
		//OpPractice11 생성
		// -> OpPractice11 라는 클래스(설계도를 이용해서
		//객 체를 생성하는데, 그객체 이름이 opc 이다.
		OpPractice11 opc = new OpPractice11();
	 //*import 하지 않아도 자유롭게 불러다 쓸수있다!.
		
		// Scanner 도 이용할때 sc.nextLine();,sc.nextInt(); 든
		 // 똑같이 아래처럼 opc.ex1();
		             // 만든객체이름 . 호출할메서드명 
		                  
		           // 그럼 메인메서드가 있는 opc 에서 호출 되어있는곳에
		               //서도 쓸수있다? 라는 의미인것같음. 잘모르겟다.
		                 //어렵다.
		//opc.ex1(); 
		//opc.ex2(); 
		opc.ex3(); 
		
		
		
		// opc가 가지고있는 기능(메서드)
		// 중 ex1 이름의 메서드를 호출 시켜 실행한다.
		
	
	
	
	}
	
}
