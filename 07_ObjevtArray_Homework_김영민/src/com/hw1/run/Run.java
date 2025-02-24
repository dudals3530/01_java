package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;


public class Run {/*

*3개의 생성자를 사용하여 3명의 사원 정보를
배열로 생성한 후 출력 해보고 값이 없는
필드에 각각 값을 입력해 넣어 출력
직원 각각의 보너스가 적용된 연봉을 계산하여
출력하고 총 직원 연봉의 평균을 구하여 출력
*
*/
public static void main(String[] args) {
	
	//객체 배열을 크기 3으로 할당한뒤 3개의 생성자를 이용하여
	// 객체 생성후 출력
	Employee emp[] = new Employee[3];
	
	

	//3개의 객체중값이 없는 필드에 각각 값을 넣은뒤 출력
	emp[0] = new Employee();// 기본생성자 
	emp[1] = new Employee(1,"홍길동",19,'M',"01022223333","서울마곡"); //null 값을 안넣어도 이미 만든매개변수 생성자에 의해
	                      											// 값을 안넣어도
	emp[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.1,"01022223333","서울마곡");
	
	
	
	System.out.println("emp[0] : "+emp[0].information());
	System.out.println("emp[1] : "+emp[1].information());
	System.out.println("emp[2] : "+emp[2].information());
	System.out.println("=====================================================");
	//포문 돌아도 편함
	// for ( int i = 0 ; i < emp.length; i++){
	    // syso  ("emp [" + i + "]" . emp[i].information(); 
	// 이런식으로도 할수 있
	
	
	//3개의 객체중 값이 없는 필드에 각각 값을 넣고 출
	emp[0].setEmpNO(0);
	emp[0].setEmpName("김말똥");
	emp[0].setDept("영업부");
	emp[0].setJob("팀장");
	emp[0].setAge(30);
	emp[0].setGender('M');
	emp[0].setSalary(3000000);
	emp[0].setBonusPoint(0.2);
	emp[0].setPhone("01055559999");
	emp[0].setAddress("전라도 광주");
	
	emp[1].setDept("기획부");
	emp[1].setJob("부장");
	emp[1].setAge(19);
	emp[1].setGender('M');
	emp[1].setSalary(4000000);
	emp[1].setBonusPoint(0.3);
	emp[1].setPhone("01022223333");
	emp[1].setAddress("서울 잠실");
	System.out.println("emp[0] : "+emp[0].information());
	System.out.println("emp[1]: "+emp[1].information());
	System.out.println("=====================================================");
	
	//직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
	// 연봉 = (급여+(급여*보너스포인트)) *12

	//for 문 
	//for ( int i =0 ; i< emp.length; i++)
	// { int sumSalaty = emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint()) )* 12
 	
	int salary0 = (int) ( (emp[0].getSalary() + ( emp[0].getSalary() * emp[0].getBonusPoint() ) ) * 12);
	int salary1 = (int) ( (emp[1].getSalary() + ( emp[1].getSalary() * emp[1].getBonusPoint() ) ) * 12);
	int salary2 = (int) ( (emp[2].getSalary() + ( emp[2].getSalary() * emp[2].getBonusPoint() ) ) * 12);
	
	System.out.println(emp[0].getEmpName()+"의 연봉 :"+ salary0+"원");
	System.out.println(emp[1].getEmpName()+"의 연봉 :"+ salary1+"원");
	System.out.println(emp[2].getEmpName()+"의 연봉 :"+ salary2+"원");
	
	int sum = (salary0 + salary1+salary2)/3;
	
	System.out.println("======================================================");
	System.out.println("직원들의 연봉의 평균: "+sum+"원");
	
	
	//3명의 직원의 연봉 평균을 구하여 출력
	
	//집에서 다시해
	
	
	
}
	
	
}
     

		
		
	
	


