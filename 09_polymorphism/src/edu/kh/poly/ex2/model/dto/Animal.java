package edu.kh.poly.ex2.model.dto;

public abstract class Animal {//넌이제 추상클래스여
	//추상 클래스(abstract calss)
	//1 . 미완성 메서드(추상 메서드)를 보유하고있는 클래스
	//2 . 객체로 만들수 없는 클래스
	// -> 여러 타입들을 관리하기 위한 상위 타입의 목적
	// 객체로 생성하여 사용하기 위한 목적이 아님
	
	// 속성
	private String type;     // 종 / 과
	private String eatType;  //식성
	
	// 기능
	
	public Animal() { //기본생성자
			}

	
	 // 매개변수생성자
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}
	

	// 동물의 공통 기능 추출(추상화)
	// -> 동물은 공통적으로 먹고, 숨쉬고,
	// 움직이지만
	// 어떤 동물이냐에 따라 그방법이 다름!
	// - > 해당 클래스에 메서드 정의를 자세히
	// 할수 없을것 같다.
	//--> 미완성 상태로 만들어 상속받은 자식이
	// 해당 메서드를 자식 본인에게 맞는 정의를
	// 하도록 오버라이딩 강제화 시킴.
	//--> 추상 메서드(abstract method) 로 작성
	
	// 먹다
	public abstract void eat();// 추상 메서드
	
	
	//숨쉬다 
	public abstract void breath();
	
	
	//움직이다
	public abstract void move();
	
	
	// 추상클래스는 일반 멤버(필드,메서드작성가능)
	public void ex() {
		System.out.println("이메서드는 평범메서드..");
	}
		
	
	
	@Override
		public String toString() {
			
			return type + " / " + eatType;
		}
	
	
	
	
	//게터세터
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	
}
