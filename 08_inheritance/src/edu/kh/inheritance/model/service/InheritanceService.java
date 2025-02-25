package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {

	// 상속 확인 예제
	
	public void ex1 () {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("====================");
		
		//person 을 상속받은 Student 가 
		// 정말로 Person 의필드 , 메서드를 사용할 수 있는가?
		
		//Student 객체 생성
		Student std = new Student();
		
		//Student 만의 고유한 멤버
		std.setGrade(3);
		std.setClassRoom(5);
		
		//Person 클래스로부터 상속받은 멤버
		
		std.setAge(19);
		std.setName("홍길동");
		std.setNationality("대한민국");
	
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println(std.getAge());
		System.out.println(std.getName());
		System.out.println(std.getNationality());
		
		System.out.println("=============");
		
		//Employee 의 고유 멤버
		Employee emp = new Employee();
		emp.setCompany("Kh정보교육원");
		
		
		//Person 클래스로부터 상속받은 멤버
		emp.setName("김모씨");
		emp.setNationality("대한민국");
		emp.setAge(25);
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breath();
		p.move();
		
		emp.breath();
		emp.move();
		
		std.breath();
		std.move();
		
		//상속의 특징
		//코드길이 감소 및 중복제거 효과!
		// Person - > Employee - > Student 도가능 하나 ??
		
		
		
	}

	// super() 생성자 이용해보기
	public void ex2() {
		
		//Student 객체 생성
		Student std = new Student("홍길동",17,"한국",3,5);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getClassRoom());
		System.out.println(std.getGrade());
		
		//Employee 객체생성
		// 매개변수 생성자 이용 (이름, 나이 , 국적 ,회사)
		
		Employee emp1 = new Employee("김노동",30,"한국","KH정보교육원");
		
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getNationality());
		System.out.println(emp1.getCompany());
		
	
		
	}

	//오버리이딩 확인예쩨
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move();// 오버라이딩 X
						// -> Person ( 부모) 의 메서드를 수행
		
		emp.move(); // 오버라이딩 
		//오버라이딩된 move()
		// 효율적으로 빨리 일하고 퇴근한다
		
	}

	
	//toString() 보어라이딩 예제
	public void ex4() {
		
		Person p = new Person ("김철수",17,"한국");
		
		System.out.println(p.toString());//김철수/17/한국
		System.out.println(p); //김철수/17/한국
		//print 구문 수행 시 참조변수명을 작성하면
		// 자동으로 toString() 메서드를 호출해서 출력해준다.
		
		System.out.println("=====================");
		
		Student std = new Student("강호동",18,"미국",2,6);
		
		System.out.println(std.toString());  //강호동/18/미국/2/6
		System.out.println(std);  //		강호동/18/미국/2/6
		
		Employee emp = new Employee("김노동",36,"한국","Kh정보교육원");
			
		System.out.println(emp.toString());
		System.out.println(emp);
		
		
		
	}
}
