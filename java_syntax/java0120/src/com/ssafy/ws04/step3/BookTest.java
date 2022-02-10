package com.ssafy.ws04.step3;

public class BookTest {
	public static void main(String[] args) {
		
		BookManager manager = new BookManager();
		manager.add(new Book());			// 추가 도서정보 삽입후
		for(Book b: manager.getList()) {	// 출력확인
			System.out.println(b);
		}
	}
}
