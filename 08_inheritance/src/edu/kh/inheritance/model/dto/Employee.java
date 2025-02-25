package edu.kh.inheritance.model.dto;

/*
 * Object
 *   ㄴ Person
 *         ㄴ Employee
 * */

// final 클래스 : 상속불가한 클래스다 ( 누군가의 부모가 될수없다.)
//  - > 제공되는 클래스 그대로 사용 해야하는 경우 사용함 
// ex ) String 클래스
public /*final*/ class Employee extends Person{

	//필드
	private String company; // 회사명
public Employee() {}
	

	
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);// Person의 매개변수생성자
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//Person 으로 부터상속받은 메서드중
	//move() 메서드를 EMployee에 맞게 재정의(==오버라이딩)
	
	//@Override : 해당 메서드가 오버라이딩 되었음을
	// 컴파일러에게 알려주는 역할
	// - > 컴파일러에게 문법체크를 하도록 알린다
	// -> 부모에게 해당 메서드가 있는지 체크
	// - > 이름,매개변수 타입과 개수 일치하는 여부 검사
	@Override
	public void move() {
		
		//super 참조변수 : 상속관계에서 부모 객체를 가리키는 참조변수
		//super.move(str, num);
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다.");
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ "/"+ company;
	}
	/*
	 *final 메서드 - > 오버라이딩 불가
	 *메서드의 기능이 변하면안되는 경우
	 * 
	 * */
	
	
	public final void onlyEmployee() {
		
		System.out.println("final 메서드 입니다");
	}
	
	
	}
	

