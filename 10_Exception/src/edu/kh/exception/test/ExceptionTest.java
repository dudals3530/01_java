package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// 컴파일 에러 => 개발자가 코드 잘못쓴 경우
		
		// 자료형이 맞지안아 연산 불가하여 "컴파일 에러" 가 발생 (코드 틀림)
		//int a = 99.9; //Type mismatch: cannot convert from double to int
		
		int a =(int)99.9; // 코드수정 가능!
		
		// 런타임 에러 - > 프로그램 수행중 발생하는 에러
		//               주로 if 문으로 처리 가능하다.
		int[] arr = new int [3]; // 길이 3 : 인텍스 0, 1, 2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;
		
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// 배열범위 초과 예외
		
		if ( 3 >= arr.length ) { // 배열 인덱스 범위 초과한 값이 들어왔다면
			System.out.println("배열범위를 초과했습니다");
			
		}else {
			arr[3] = 40;
			System.out.println("배열범위 안정적 ..");
		}
		
		
	}
}
