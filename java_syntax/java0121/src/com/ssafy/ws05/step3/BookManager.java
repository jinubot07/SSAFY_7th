package com.ssafy.ws05.step3;

public class BookManager {
	// ---- 싱글톤 패턴
	private static BookManger manager = new BookManager;
	private BookManager() {
		books = new Bookp[MAX_SIZE];
	}
	public static void main(String[] args) {
		return manager;
	}
	private static final int MAX_SIZE=100;
	private Book[] books;	//null
	private int size; // 0으로 초기화
	
	public void add(Book book) {
		Book b=searchByIsbn(book.getIsbn());
		if(b==null) {
			books[size++] = book;
		}
	}
	
	// 중요한 것
	public Book searchByIsbn(String isbn) {	//낙타방식으로 네이밍
		Book b=null;
		for (int i=0; i<size; i++) {
			if (books[i].getIsbn.equals(isbn)) {
				return books[i];
			}
		}
		return null;
	}
	
	public Book[] getList() {
		return Arrays.copyf(books,size);
	}
	
	public void remove(String isbn) {
		int index=-1;
		for (int i=0; i<size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			books[index]=books[size-1];
			books[size-- -1]=null;
			//size--;
		}else {
			System.out.printf("존재하지 않는 %s입니다.\n",isbn);
		}
	}
}












