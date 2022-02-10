// class검색시 : ctrl - shift - r -> *찾고자하는이름 -> 검색결과
package com.ssafy.ws04.step3;

public class Book{
	// 은닉화하기 
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;			
	
	// 생성자 오버로딩
	public Book() {	// 내가 안 만들어도 디폴트로서 자동으로 생성된다.
		this("","","","",0,"");  	//아래 생성자를 이용 -> 잘 구현된 것 일부 사용
	}

	// 생성자 오버로딩
	// Source - Generate Constructor using Fields...
	public Book(String isbn, String title, String author,
			    String publisher, int price, String desc) {
		super();			
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	} 
	
	// 오버라이딩 : Source - Generate toString()...
	@Override
	public String toString() {
		return  isbn+"\t|"+title+"\t|"+author+"\t|"+publisher+"\t|"+price+"\t|"+desc ;			
	}

	
	// Source - Generate Getters and Setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}