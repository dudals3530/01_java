package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능 (비즈니스 로직)을 제공하는 패키지 or 서비스
//(비밀번호 -> 암호화, 파일 - > 유요한 파일 걸러내는 작업 ..)
public class AbstractionService {
	
	// 속성 
	// 기능 
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		
		//People p1 : people 객체의 주소를 저장하여 참조하는 변수 p1
		                                     //p1 == 참조변수
		//new People(); 새로운 People 객체를 Heap 영역에 생성

		// * 클래스 이름이 마치 자료형처럼 사용된다 *
		// = 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다!!!
		              // 즉 클래스는 사용자 정의 자료형이라고도부른다.
		
		// int [] arr = new int[5];
		// 메서드 안쪽에서 태어난 변수 지역변수는  stack 영역에 생김 
        
		/*System.out.println("p1의 name: "+ p1.name);
		System.out.println("p1의 gender: "+ p1.gender);
		// char 타입의 기본값은 0인대 
		// 유니코드 문자체계에서 0은 공백을 나타냄 
		// 그래서 그냥 찍으면 콘솔창에 빈공간으로 나옴 
		// int 형으로 강제형변환하면 0값 보임
		
		System.out.println("p1의 pNo: "+ p1.pNo);
		System.out.println("p1의 address: "+ p1.address);
		System.out.println("p1의 phone: "+ p1.phone);
		System.out.println("p1의 age: "+ p1.age);
	     /*
		p1.name = "홍길동";
		p1.gender ='남';
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-2032-5555";
		p1.age= 20;
		*/
		/*p1.tax();
		p1.vote();*/
		
		/*System.out.println("p1의 pNo: "+ p1.pNo);
		System.out.println("p1의 address: "+ p1.address);
		System.out.println("p1의 phone: "+ p1.phone);
		System.out.println("p1의 age: "+ p1.age);
	      */    
	      
	          // 예입장에서는 getter 임
	     
	                // 여기서"홍길동"은 전달인자
	       					// 전달하는 값
					p1.setName("홍길동");
					p1.setGender('남');
					p1.setPhone("010-1234-1234");
					p1.setAddress("서울시 중랑구 어쩌구");
					p1.setAge(20);
					p1.setpNo("123456-1234567");

					System.out.println(p1.getName());
					System.out.println(p1.getGender());
					System.out.println(p1.getPhone());
					System.out.println(p1.getAddress());
					System.out.println(p1.getAge());
					System.out.println(p1.getpNo());

					//본인 객체
					//People 클래스 이용하여 본인 이름 객체 생성하기
					// 본인의 정보 setter 값 대입
					// getter 이용해서 콘솔창 출력까지
					
				
					

	       
	
	
	
	}

	public void me() {
		
		People me = new People();
		
		me.setName("김영민");
		me.setGender('남');
		me.setPhone("010-2032-2942");
		me.setAge(33);
		me.setAddress("서울시 중랑구 신내로 51길 성원 102 -902");
		me.setpNo("930323-1011111");
		
		System.out.println(me.getName());
		System.out.println(me.getGender());
		System.out.println(me.getPhone());
		System.out.println(me.getAddress());
		System.out.println(me.getAge());
		System.out.println(me.getpNo());
		
	}
}
	
