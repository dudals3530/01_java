package com.hw1.model.dto;


import java.util.List;

public class Friend {

	private String name;
	
	
	
	public Friend() {}

	
	
	public Friend(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	// 기능
	public void pickLeader(List<Friend> friendList) {
			
		
		 int ran = (int)(Math.random()*friendList.size());
		 
		 System.out.println(friendList.get(ran).getName() + " 떡잎 방범대 대장이다!.");
	
		
	}
	

	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
}
