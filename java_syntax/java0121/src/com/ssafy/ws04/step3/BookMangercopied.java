package com.ssafy.ws04.step3;

public class BookMangercopied {
	//싱글톤
	private static BookManager manager=new BookManager();
	private BookManager() { // 생성자
		//어디선가 누군가가 생성해서 넣어야 함
		books = new Book[MAX_SIZE]; //책 타입별의 배열 -> 생성 안됨
	}
	
	public static BookManager getInstance() {
		return manager;
	}
	
	//----멤버 선언
}
