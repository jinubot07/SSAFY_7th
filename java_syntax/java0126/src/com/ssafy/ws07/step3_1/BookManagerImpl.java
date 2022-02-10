package com.ssafy.ws07.step3_1;

import java.util.Arrays;
// <| --- 삼각형 점선, ----삼각형 실선
public class BookManagerImpl implements IBookManager {

	// -------  싱글톤 디자인 패턴
	private static IBookManager manager = new BookManagerImpl();
	private BookManagerImpl() {
		books = new Book[MAX_SIZE];
	}
	public static IBookManager getInstance() {
		return manager;
	}
	
	private static final int MAX_SIZE = 100;
	private Book[] books;	// 다이아몬드 부분1<>--------100 aggregation 
	private int size;
	
	
	@Override
	public void add(Book book) {
		//추가하려는 책이 이미 있을 때 발생하는 문제 고려
		Book b = searchByIsbn(book.getIsbn());	// 인자를 isbn으로 받음
		// 오버라이딩 안되는 것 2가지 : 멤버와 static (오버로딩은 다 됨.)
		if(b==null) {	//추가하려는 책이 없어서 충돌 되지 않을 때.
			books[size++]=book;
		}	
	}

	@Override
	public Book searchByIsbn(String isbn) {
		for (int i=0; i<size; i++) { 	 // 주의) length 아님, null나올 수 있음
			if (books[i].getIsbn().equals(isbn)) {
				return books[i]; // 인덱스를 줘도되고, get을 줘도 되고
			}
		}
		return null;
	}

	@Override
	public Book[] getList() {
		return Arrays.copyOf(books, size);	// Array와 Arrays관계는 Collection과 Collections와의 관계와 같다.
	}

	@Override
	public void remove(String isbn) {
		int index=-1;
		for (int i=0; i<size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			books[index] = books[size-1];
			books[size-1] = null;
			//size--;
		}
	}

	@Override
	public Book[] searchByTitle(String title) {
		Book[] bs=new Book[size];
		int cnt=0;
		for (int i=0; i<size; i++) {
			if (books[i].getTitle().contains(title)){
				bs[cnt++] = books[i];
			}
		}
		return Arrays.copyOf(bs, cnt);
	}

	@Override
	public Book[] getBooks() {		// 힙에 매거진 있니없니?	
		Book[] bs = new Book[size];
		int cnt=0;
		for (int i=0; i<size; i++) {
			if(!(books[i] instanceof Magazine)){	//빈칸 단골 문제
				bs[cnt++] = books[i]; 	
			}
		}
		return Arrays.copyOf(bs, cnt);
	}

	@Override
	public Magazine[] getMagazines() {
		Magazine[] bs = new Magazine[size];
		int cnt=0;
		for (int i=0; i<size; i++) {
			if(books[i] instanceof Magazine){
				bs[cnt++] = (Magazine)books[i]; 	
			}
		}
		return Arrays.copyOf(bs, cnt);
	}

	@Override
	public int getTotalPrice() {
		int cnt=0;
		for (int i=0; i<size; i++) {
			cnt += books[i].getPrice();		
		}
		return cnt;
	}

	@Override
	public double getPriceAvg() {
		return 1.0*getTotalPrice()/size;
	}
	
	@Override
	public void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException {
		Book b= searchByIsbn(isbn);
		if(b==null) {
			throw new ISBNNotFoundException(isbn+"이 존재하지 않습니다.");
		}
		int myQuantity = b.getQuantity();
		if(myQuantity-quantity<0){
			throw new QuantityException("수량이 부족합니다. 수량을 확인해 주세요.");
		}
		//얕은 복사이기 때문에
		b.setQuantity(myQuantity-quantity);

	}
	
	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		Book b =searchByIsbn(isbn);
		if(b==null) {
			throw new ISBNNotFoundException(isbn+"이 존재하지 않습니다.");
		}
		int myQuantity = b.getQuantity();
		//얕은 복사이기 때문에
		b.setQuantity(myQuantity-quantity);


	}
		
}
