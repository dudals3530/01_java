package com.hw1.run;

import java.io.ObjectInputStream.GetField;
import java.net.MulticastSocket;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//3명의 학생 정보를 기록할 수 잇게 객체 배열 할당
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력
		
		// 최대 10명의 사원 정보를 기록할수 잇께 배열을 할당
		// 사원들의 정보를 키보드로 계속 입력받고 - -->> while(true) 무한반복문을 통해
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y' 이면 계속객체 추가  -  > flag 세우란예기네...
		// 한명씩 추가될때마다 카운트함  --> 카운트용 sum 변수 만들어줘서 누적싴기
		
		// 2명 정도의 사원 정보를 입력 받아 객체배열에 저장
		//현재 기록된 사원들의 정보를 모두출력
		
		Student std[] = new Student[3];
		
		
		std[0] = new Student ("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student ("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student ("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		//반복문을 통해출력
		// for / while ...
		// 향상된 for 문
		/*
		 * 자바에서 배열, 컬랙션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
		 * 구조를 제공
		 * 일반적인 for 문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 작성할 수 있다.
		 * 
		 * for(데이터 타입 변수명 : 배열또는 컬렉션){
		 *    //반복해서 실행할 코드 
		 * }
		 * for(Student i : std) {
		 *        System.out.println( i.information() }
		 * 
		 * */
		for(int i = 0; i < std.length; i++) {
			System.out.println( std[i].information()	);
		}
		
		
		
		
		
		
		
		
		System.out.println("==================================");	
		
		
		Employee emp[] = new Employee[10];
		
		String inputyn = "";
		boolean flag = true;
		
		int num = 0 ;
		
		while(flag) { 
			
			System.out.print("이름 : ");
			String inputName = sc.next();
			
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			
			System.out.print("신장 : ");
			double inputHeight = sc.nextDouble();
			
			System.out.print("무게 : ");
			double inputWeight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int inputSalary = sc.nextInt();
			
			System.out.print("부서 : ");
			String inputDept = sc.next();
			
			
			emp[num] = new Employee(inputName, inputAge, inputHeight, inputWeight, inputSalary, inputDept);
			num++;
			
			
			if( num == emp.length) {
				break;
			}
		    while(true){System.out.print("계속 추가할래? (y/n)");
			inputyn = sc.next();
			
			if(inputyn.equals("n") || inputyn.equals("N") )  {
			    flag = false;
				break;
				
			
		    }else if (inputyn.equals("y")|| inputyn.equals("Y")  ) {
				flag = true;
				break;
		    }else {
				System.out.print("잘못 입력하셨습니다.");
				
		    }
			
		    }
			
			
			
			
			
			
			
		
		for (int i = 0 ; i < num; i++) {
			System.out.println(emp[i].information());
			
		}
		
		// 추가 여부묻기
		/*System.out.println("계속 추가하시겠습니까 ? y/n");
		String str = sc.next().toUpperCase(); // 소문자 - > 대문자*/
		
		//String.toUpperCase() : "n"  - > "N"
		//String.toLowerCase() : 대문자 - > 소문자

		 //if(str2.equalsIgnoreCase("n") ) break ;    - > 어쨌뜬 대문자n이든 소문자n 이든 break; 됌
		                  // 두문자열이 같은지 비교  
		
		for (Employee i  : emp) {
			
			if(i == null) {break; // nullpointerException 방지
			
			}
			System.out.println(i.information());
			
		}
		
                                                                     		
		
		
		}}}
			
		
		
		
		
				
	    	
	    			
		
    	
    		
    
    
    
	    	

	            
	
	   
	   
	 
	    

	
			
	
		
		
	
	

	
