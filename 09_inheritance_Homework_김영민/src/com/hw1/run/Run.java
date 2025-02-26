package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		
		//Book 객체배열 3칸 생성후 각 인덱스마다 Novel, TextBook,Poetry 생성하여 대입
		
		// 모든 도서 정보 출력
		
		Book arr[] = new Book[3];
		
		arr[0] = new Novel ("해리포터","j.k 롤링", "판타지");
		arr[1] = new Textbook("자바 프로그래밍","james Gosling","컴퓨터과학");
		arr[2] = new Poetry("우리들의 사랑시", "김소월",30);
		
		for(int i = 0; i< arr.length; i++) {
			
			arr[i].displayInfo();
			System.out.println();
		}
		
	}
}
