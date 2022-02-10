package com.ssafy.ws07.step3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ssafy.ws07.step3_1.Book;
import com.ssafy.ws07.step3_1.ISBNNotFoundException;
import com.ssafy.ws07.step3_1.Magazine;
import com.ssafy.ws07.step3_1.QuantityException;

// <| --- 삼각형 점선, ----삼각형 실선
public class BookManagerImpl implements IBookManager {

	// -------  싱글톤 디자인 패턴
	private static IBookManager manager = new BookManagerImpl();
	private BookManagerImpl() {}
	public static IBookManager getInstance() {
		return manager;
	}
	
	private List<Book> books = new ArrayList<>();
	
	@Override
	public void add(Book book) {
		Book b = searchByIsbn(book.getIsbn());
		if(b==null) {
			books.add(book);
		}
	}
	@Override
	public Book searchByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public com.ssafy.ws07.step3.Book[] getList() {
		/*
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).getIsbn().equals(isbn)) {
				return books.get(i);
			}
		}
		*/
		for(Book b:books) {
			if(b.getIsbn().equals(isbn)) {
				return b;
			}
		}
		return null;
	}
	@Override
	public void remove(String isbn) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public com.ssafy.ws07.step3.Book[] searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public com.ssafy.ws07.step3.Book[] getBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public com.ssafy.ws07.step3.Magazine[] getMagazines() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPriceAvg() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void sell(String isbn, int quantity)
			throws com.ssafy.ws07.step3.ISBNNotFoundException, com.ssafy.ws07.step3.QuantityException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buy(String isbn, int quantity) throws com.ssafy.ws07.step3.ISBNNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
