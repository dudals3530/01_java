package edu.kh.variable.practice;

public class CastinPractice1 {

	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int) dNum ); // 2
		System.out.println(iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( iNum1  / (float)iNum2) ; // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( (iNum1 / (int)fNum) ); // 3
		System.out.println( iNum1 / fNum );// 3.3333333
		   //float :  소수점 아래 8번째 자리 까지 연산후 반올림
		    // float 은 23비트 까지만 저장할수 있어서 
		    // 근사값이 빨리 끊어지고 반올림됨 - > 정밀도가 낮아 마지막값이 3
		   
		    //float 비트 수 : 32비트
		    // -> 저장 방식 : 23비트 (가수) + 8비트(지수) + 1비트(부호)
		
		
		System.out.println( (iNum1 / (double)fNum) ); // 3.3333333333333335
		// double : 소수점 아래 16번째 자리까지 연산후 반올림
		// double 은 52 비트까지 저장할 수 있어서
		// 더많은 자리수를 정확히 표현 할 수 있다 - > 정밀도가 높아 
		  // 마지막 값이 높다.
		
		   // double 비트 수 : 64 비트 
		   // -> 저장 방식 : 52비트 (가수) + 11비트 (지수) + 1비트(부호)
              
		      // 이래서 값이 5와 3의 차이가 있는거임
		
		System.out.println("'" + ch + "'" ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( "'"+ (char)(ch + iNum1) + "'" ); // 'K'
		
		
		

	}

}
