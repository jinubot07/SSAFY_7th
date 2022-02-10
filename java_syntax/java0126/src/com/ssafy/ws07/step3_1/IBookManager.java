package com.ssafy.ws07.step3_1;
// 100% abstract class -> interface(순수가상함 C++)
// abstract 상속강요 -> 오버라이딩 
// abstract class -> 변수 멤버 -> 생성자
// interface -> public static final 변수 -> 상수 -> 생성자 없다.
// 구현클래스 extends  abstract class 
// 구현클래스 implements inteface
// 자바 펭귄상고 Penguin extends Bird implemnts IWalk, ISwim

public interface IBookManager {
	void add(Book book) ;
	Book searchByIsbn(String isbn) ;
	Book[] getList() ;
	
	void remove(String isbn);
	Book[] searchByTitle(String title);
	Book[] getBooks() ;
	Magazine[] getMagazines() ;
	int getTotalPrice() ;
	
	double getPriceAvg() ;
	void sell(String isbn, int quantity) throws ISBNNotFoundException,
	QuantityException;
	void buy(String isbn,int quantity) throws ISBNNotFoundException;
}
