package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	//예외(Exception) : 소스코드의 수정으로 해결 가능한 오류
	
	//예외는 두종류로 구분됨
	//1) Unchecked Exception : 선택적으로 예외처리(ex. Runtime Exception)
	//2) Checked Exception : 필수적으로 예외처리 (ex. IOException, 나머지 ...)
	
	private Scanner sc= new Scanner(System.in);
	
	public void ex1() {
		// 두 정수를 입력받아 나누기한 몫을 출력 하기 
		System.out.print("정수 1입력 : ");
		int input1 = sc.nextInt();//InputMismatchException
		// int 형이 아닌 다른 자료형을 대입했을때
		
		System.out.print("정수 2 입력: ");
		int input2 = sc.nextInt();//InputMismatchException
		
		
		

		if ( input2 !=0) {
			System.out.println("결과 : "+ input1/input2); //ArithmeticException
			// input2에 0 이들어왔을때 0으로 나눌 수 없다 : 산술저 예외 발생
			
		}else {
			System.out.println("infinity");
			
		}
		
		// --------------------------------
		
		try {
			// 예외가 발생할 것같은 코드
			System.out.println("결과 : "+ input1/input2);
			
		}catch(ArithmeticException e) {
			// try 에서 던져진 예외를 catch 문의 매개변수 eㄹ ㅗ잡음.
			// e를 사용하여 예외 추적 코드 작성할수도있음
			//
			System.out.println("infinity");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 지점 추적 메서드
			
			//java.lang.ArithmeticException: / by zero
		//	at edu.kh.exception.model.service.ExceptionService.ex1(ExceptionService.java:40)
		//	at edu.kh.exception.run.ExceptionRun.main(ExceptionRun.java:8)

		}
			
		//발생하는 예외 중 일부 예외 try-catch 사용안해도
		// if - else 예외 상황 방지 가능
		// 일부 예외 == 대부분 Unchecked Exception
			
			
		
		
		
	}
	
	
	// 여러가지 예외에 대한 처리방법
	public void ex2() {
		 
		try {
			// 두 정수를 입력받아 나누기한 몫을 출력 하기 
			System.out.print("정수 1입력 : ");
			int input1 = sc.nextInt();//InputMismatchException
			// int 형이 아닌 다른 자료형을 대입했을때
			
			System.out.print("정수 2 입력: ");
			int input2 = sc.nextInt();//InputMismatchException
			
			System.out.println("결과 : "+ input1 / input2);//ArithmeticException
			// input2에 0 이들어왔을때 0으로 나눌 수 없다 : 산술저 예외 발생
			
			String str = null;
			System.out.println(str.charAt(0));
			
			// InputMismatchException , ArithmeticException 둘 다 RuntimeException 의 후손
			//RuntimeException 은 Exception 의 후손
			
			//Exception
			//     ㄴRuntimeException
			//             ㄴ ArithmeticException , InputMismatchException
			// 다형성에 의해서 부모 RuntimeException 이 먼저 와버리면
			// 후손까지 도달할수가없음
			// 즉 후손 부터 작성하면서 , 마지막에 최상위 부모쪽으로 가게끔 작성해야함
			
			
		}catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		
		}catch (RuntimeException e) {
		
			
		}catch (Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모 타입 참조변수로 자식객체 참조

			// ** 상위 타입의 예외 클래스를 catch 문에 작성하면
			//     다형성 업캐스팅에 의해 모두 잡아서 처리 가능!! **
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함 ..");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력
			
		}
		
		
		
		
	}
			
	// try - cath - finally
	public void ex3() {

		// finally : try 구문에서 예외가 발생하든 말든 무조건 수행
		
		try {
			// 두 정수를 입력받아 나누기한 몫을 출력 하기 
			System.out.print("정수 1입력 : ");
			int input1 = sc.nextInt();//InputMismatchException
			// int 형이 아닌 다른 자료형을 대입했을때
			
			System.out.print("정수 2 입력: ");
			int input2 = sc.nextInt();//InputMismatchException
			
			System.out.println("결과 : "+ input1 / input2);//ArithmeticException
			// input2에 0 이들어왔을때 0으로 나눌 수 없다 : 산술저 예외 발생
			
			
		}catch(ArithmeticException e) {
			System.out.println("산술적 예외처리가됨");
			
			//매개변수 e : 예외관련된정보 + 예외관련 기능 ???
			System.out.println(e.getClass());// 어떤 예외 클래스인가 ?
			// class java.lang.ArithmeticException
		
			System.out.println(e.getMessage()); //Throwable 이건 Error 와 Exception 의 부모
			                                    // 예외 발생시 출력된 내용
			System.out.println(e);
			//java.lang.ArithmeticException: / by zero
			
			e.printStackTrace();   // 이게 다 합쳐서 나온것 어디위치에서 발생햇는지도보여줌
			
		}catch(InputMismatchException e) {
			System.out.println("숫자만 넣어라 ..");
		
			
		}finally{
			
			System.out.println(" 무조건 수행됨");
			sc.close();// 스캐너 통로 닫기 : 메모리 누수 방지
		}
			

		
		
	}

	
	//throw ,throws 이용해보기
	public void ex4()  {
		
		try {
			methodA();
			
		}catch(IOException e) {
			System.out.println("method C 에서 부터 발생한 예외를 ex4에서 잡아 처리함");
		}
		
		
		
		
		
	}
	
	public void methodA() throws IOException {
		methodB();
		
	}
	
	public void methodB() throws IOException {
		methodC();
		
	}

	public void methodC() throws IOException{
		//throws : 호출한 메서드에게 예외를 던짐
		// - > 호출한 메서드에게 예외처리를 하라고 위임하는 행위
		
		//throw : 예외 강제 발생 구문
		
		// 호출한쪽에서 자식 예외구문을 발생시켰을때 
		// 호출받은 쪽에서는 부모를 이용하면 
		// 같거나 해당 상위 객체를 이용해야한다
		throw new FileNotFoundException();
		
	}
	
	public void ex5() throws UserException {
		// 사용 자 정의 예외 클래스 인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("사용자정의 예외 발생");
		
		
		
	}

	
}
	
	

