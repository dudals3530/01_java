package com.hw1.model.vo;

public class Student extends Person{

	private int    grade ;        //학년
	private String major ;        // 전공
	
	
	
	public Student() {} // 기본생성자


                //Person 을 상속한 매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super( age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
		
	}
	
	


	
	
	@Override
	public String information() {
		
		return super.information() + "/ 학년 :" + grade + "/ 전공 :"+ major ;
	}                //            +  String.format("/학년 :%d, /전공 : %s" , grade, major);
	
	
	
	
	
	
	
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
	
	
	
	
}
