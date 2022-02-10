package com.ssafy.ws05.step3;

public class Magazine extends Book {
	
	private int year;
	private int month;
	public Magazine() {
		super();
	}
	
	public Magazine(String args[]) {
		super(isbn,title,author,publisher,price,desc);
		// this();	생성자는 둘중에 하나만 쓸 수 있기때문에 에러남.
		this.year=year;
		this.month=month;
	}
}
