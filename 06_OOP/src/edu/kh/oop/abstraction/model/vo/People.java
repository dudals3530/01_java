package edu.kh.oop.abstraction.model.vo;

//model - 프로그램 로직 과 관련되어있는 데이터를 저장하는 용도, + 비즈니스 로직
//VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

public class People {// 국민 (사람) 클래스
	
	// 클래스란 ? - 객체의 특성(속성, 기능)을 정의한것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값 을 저장하기 위한 변수 선언
	// - > 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름 , 성별,  주민번호, 주소 , 전화번호 , 나이
                   // - > 이게 추상화
	
	//필드 == (스캐너 만든곳 잇자나) 필드변수 == 멤버변수
    
	// 캡슐화
	// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한 하는 것이 원칙 이다.
	// -> 직접접근 못하기 때문에
	//   클래스 내부에 간접 접근 방법을 제공하는 기능 ( 메서드) 작성하여야한다.
	// - > getter//setter
	
	/* 데이터 직접 접근 제한
	 * 
	 * public (공공의) -> private ( 사적인, 개인적인) 변경
	 * 
	 * 
	 * 
	 * */
	
	
	//[접근제한자] 자료형 변수명;
	private String name;
	private char gender;
	private String pNo;   // "123456-1234567"
	private String address;
	private String phone; // "010-1234-5678"
	private int age;
	//public double bitcoin; // 공통점이 아니기 떄문에 제거함 (추상화에 위배됨)

	//기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다...");
	}
     
	public void vote() {
		System.out.println("투표를 합니다.. 꼭하세요!");
	}
	
	// 캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	// [접근 제한자] 반환형 메서드명() {}

	// name 변수의 값을 호출한 쪽으로 
	// 돌려 보내주는 간접 접근 기능 중 getter
	
	// void : 반환할 값이 없다(반환형(자료형) 이없다)
	
	  public String getName() {//외부에서 접근 가능해야되서 public
		 return name;
		 //return : 반환, 되돌려주다
		 //return : 현재 메서드를 종료하고 호출한쪽으로 되돌아감.
		 //return 값/변수 ; : 현재 메서드를 종료하고
		 //값/변수 가지고 호출한쪽으로 되돌아감.
	
	  
	  }
	//getter() : 반환형이 무조건 있음
	  //         getter 는 필드에 작성된 변수값을 호출한쪽으로 되돌려주는애
    //           변수는 자료형이 있을것.
	  //         그 변수를 되도렬준다면 당연히 반환형도 존재하 것

	
	
	 // name 변수에 값을 세팅 하는 간접 접근 기능 중 setter
	 
	  
	  					//매개변수
	 /* public void setName(String name) {
		 this.name = name;
		 // ** this : 현재 객체
		 
	 }
	
	 public char getGender() {
		 return gender;
		 
		 
	 }
	 public void setGender(char gender) {
		 this.gender = gender;
	 }
	 
	 public String getPno() {
		 return pNo;
		 
	 }
	 public void setpNo(String pNo) {
		 
		 this.pNo = pNo;
	 }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;	
		}
	public int getAge() {
		return age;
	}
	public void setage(int age) {
		this.age =age;
	}
	
	*/
	// alt + shift + s 또는 상단메뉴 Source
	  // -> generate Getters and Setters .. 클릭
	 // - > selectAll - > Generate 클릭
	 
	  public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getpNo() {
			return pNo;
		}

		public void setpNo(String pNo) {
			this.pNo = pNo;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setName(String name) {
			this.name = name;
		}
		/*
		 * public void setAge(int age)
		 *  // 메서드(기능) 형태인 getter/setter를 이용하면 본인이 원하는 기능을 추가할수있음
		 *  // age 가 0보다 작을때 예외 발생시키키
		 *  // age 가 0보다 클 때 속성에 전달받은 값 세팅하기..
		 *  
		 *  if (age >= 0 ){
		 *                this.age = age;
		 *         }else{
		 *         throw new IllegalArgumetException("음수는안된다.. ");
		 *           //llegalArgumetException d
		 *           //메서드에 전달된 인자가 (매개변수)유효하지 않을때 발생하는예외
		 * 
		 * */

		public static void main(String[] args) {
			return "회원 가입 불가능합니다.(인원수초과)";
		}
		
		
}
