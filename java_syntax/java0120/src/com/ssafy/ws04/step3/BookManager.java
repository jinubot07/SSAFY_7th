package com.ssafy.ws04.step3;

import java.util.Arrays;

public class BookManager {
	private static final int MAX_SIZE = 100; // UML에서의 대문자(=못 바꾸게 해) : final, UML에서의 밑줄 : static
	private int size; // 별도로 값 초기화 안하면 0초기화됨
	private Book[] books;

	// 생성자만들기 : Source - Generate Constructor fromSuperclass
	public BookManager() {
		//super();
		books = new Book[MAX_SIZE];// 객체 선언만 하고 생성되지 않은 상태
	}
	
	public void add(Book book) {	// 인자 : 새롭게 생성된 객체
		// 기존의 도서목록에 책이 없는 경우에만 추가	
		Book b = searchByIsbn(book.getIsbn());
		if(b == null && size < MAX_SIZE) {	// 도서목록이 꽉차서 추가할 수 없을 때
			books[size++] = book;
		}
	}
	
	public Book[] getList() {
		// 아이디어1.배열의 개수만큼 for문 돌려서 출력
		// 아이디어2. (더 쉬운방법은 금요일에!)
		Book[] nbs = new Book[size];
		for (int i=0; i<size; i++) {
			nbs[i] = books[i];
		}


		// 아이디어2. (더 쉬운방법은 금요일에!)
		// Arrays.copyOf(books, size);
		
		return nbs;
	}
	
	
	public Book searchByIsbn(String isbn) {
		for (int i=0; i<size; i++) {
			if((books[i] != null) && books[i].getIsbn().equals(isbn)) {// not null 이면서 = 객체가 생성되어있으면서 
				return books[i];
			}
			
		}
		return null;	// 위치를 못찾으면 null로 리턴
	}
	
/*	// 선언시 초기화 안했을 때, 값을 바꿀 수 있는 딱 한가지 방법 : static 생성자
	private static final int MAX_SIZE; 했을 때만 static 생성자 이용가능 
	static {
		MAX_SIZE=100;
	}
*/
}
