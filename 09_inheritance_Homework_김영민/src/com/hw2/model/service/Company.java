package com.hw2.model.service;

import java.util.Scanner;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;



public class Company implements ManagementSystem {

	Scanner sc= new Scanner(System.in);
	private Employee[] employee; // 전체직원저자용 배열
	
	private int employeeCount; // 직원수

	public Company(int size) {

		employee = new Employee[size];
		employeeCount = 0;


	}

	@Override
	public void addPerson(Person person) {
		/*
		 * 추상메서드를 상속받아 오버라이딩 
		 * 해야하는 메서드. 매개변수로 전달받은 Person 객체가 
		 * Employee 클래스의 인스턴스이며, 배열에
		 * 공간이 있다면, 해당 객체를 employees 배열에 
		 * 추가 후 추가된 객체의 정보를 출력. 
		 * 만약 배열에 더 이상 공간이 없다면, 인원이
		 * 모두 충원되었다는 메시지 출력
		 */
		if ( employee.length > employeeCount ) {
			employee[employeeCount]  =  new Employee() ;
			employeeCount++;
			System.out.print("직원이 추가되었습니다.");
			System.out.println(person.getInfo());
			
			
		}else {
			System.out.println("모두충원 되었습니다.");
		}
		
		
		
		
		
	}

	@Override
	public void removePerson(String id) {
		/*
		 * 추상메서드를 상속받아 오버라이딩 해야하는 메서드. 
		 * 매개변수로 전달받은 id와 일치하는 직원을 찾으면, 
		 * 해당 직원을 삭제하고 관련 정보를
		 * 출력. 일치하는 id가 없다면 해당 id를 가진 직원을 
		 * 찾을 수 없다는 메시지를 출력
		 * 
		 */
		boolean flag = true;
		
		 for(int i = 0 ; i < employee.length; i++) {
			 
			 if (employee[i].getId() == id) {
				 System.out.print("직원이 삭제되었습니다");
				 System.out.println(employee[i].getInfo());
				
			 }
			 
			 
		 }
		
	}

	@Override
	public void displayAllPersons() {
		/*
		 * 추상메서드를 상속받아 오버라이딩
 			해야하는 메서드. 
 			전체 직원 명단을 출력하는
			기능
		 * 
		 * 
		 * */ 

	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

}
