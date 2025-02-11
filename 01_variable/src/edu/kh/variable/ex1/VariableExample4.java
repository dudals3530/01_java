package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/* 강제 형변환
		 * - 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 * 
		 *  1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형을 변환 할때
		 *  2) 출력되는 데이터의 표기법을 변환 시키고 싶을때
		 *             *** char 와 int 사이에 
		 *    
		 *     * 강제 형변환 방법
		 *     - 자료형을 변환 시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 */    
		
		double temp = 3.14;
		int num = (int)temp;
		
		System.out.println("temp : " + temp);
		System.out.println("num :"+ num);
		// 실수형 double -> 정수형 int 변환시 소수점 아래 자리 손실 (데이터 손실)
		      
		  //int -> byte 강제형변환
		
		System.out.println("-----------------");
		
		int inum = 290;
			byte bnum = (byte)inum;
			System.out.println(inum); //290
			System.out.println(bnum); //34
		   
			//같은 정수형 끼리의 변환시에도
			//값의 범위 차이 떄문에 데이터 손실이 발생 ! 
			
			//char - > int 강제 형 변환
			
		char ch = 'A';
		System.out.println((int)ch); // 65
		
		// int -> char 강제형 변환
		
		int in = 44085;
		System.out.println((char)in); // 갵
		
		int in1 = 45878612;
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할 수 없다! 
		// -> 개발자가 미리 예측해야함.
		// 개발자가 미리 알고있어야됌.
		int i6 = 2147483647; // int형의 최대값
		int result2 = i6 + 1;
		System.out.println(result2); // -2147483648
		
		
		
		
        
        
		
		
		
		
		
		
	
				
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		 
				 
		
		

	}

}
