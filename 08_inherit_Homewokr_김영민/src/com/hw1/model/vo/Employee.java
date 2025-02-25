package com.hw1.model.vo;

public class Employee extends Person{// 자식놈
	
	private int salary ;      //급여
	private String dept ;     //부서
	
	
	
	//기본생성자
	public Employee() {}



	//Person을 상속한 매개변수 생성자

	
	public Employee(String name,int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;  //부모 Person에 작성된 필드중 protected 접근제한자 name
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String information() {
		
		return super.information() +"/급여 : "+ salary +"/ 부서 : "+ dept;
	}					//         +String.format(" / 급여 : %d / 부서 : %s", salary, dept);
	
	
	
	
	
	public int getSalary() {
		return salary;
	}
	
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	public String getDept() {
		return dept;
	}
	
	
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}


	



	
	

