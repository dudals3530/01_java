package com.hw2.run;

import com.hw2.model.service.BooksService;

public class BookRun {

	public static void main(String[] args) {
		
		BooksService bs= new BooksService();
		
		bs.displayMenu();
	}
}
