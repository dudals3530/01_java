package edu.kh.inheritance.model.dto;

// DTO(Data Transfer Object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체.
public class Person extends Object  {
     //Object 클래스
	// 모든 클래스의 최상위 부모
	// -class 선언부에 상속 구문이 하나도 작성되어있찌 않다면
	// 컴파일러가 extends Object 구문을 자동으로 추가해준다.
	
	// 속성 (필드)
	private String name;		// 이름
	private int age;			// 나이
	private String nationality;	// 국적
	

	public Person() {//기본생성자
	//super(); 컴파일러가 자동으로 추가해
	}                                                                     //생성자의 역할 
																		// 객체 생성기능  
	                           
	public Person(String name, int age, String nationality) {// 자식객체를 생성하면 내부에 부모객체가 먼저생성된다.
		super(); // 부모의 생성자 , (Object의 기본생성자)
		this.name = name;                                       // 부모생성자 호출 - >부모객체 먼저 생성
		this.age = age;                                        //자식 생성자호출 - > 자식 객체 생성
		this.nationality = nationality;                        // 이때 자식 객체 안쪽에 부모객체 포함
	}
	

	

	// 기능)(메서드)
	// getter/setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality; }

	public void breath() {
		System.out.println("사람은 코나 입으로 숨을쉰다.");
	}

	public void move() {
		System.out.println("사람은 움직일수있다.");
	}
	
	@Override
	public String toString() {
		
		return name + "/"+ age + "/"+ nationality;
	
	}
	
}

	


	
