package com.ssafy.ws07.step3;
// 21. 접근 제한자 private <  <protected < public 
public class Book {
	
	protected String isbn;
	protected String title;
	protected String author;
	protected String publisher;
	protected int price;
	protected String desc;
	protected int quantity;
	public Book() {
		this("","","","",0,"",0);//아래 생성자를 이용 -> 잘 구현된것 일부를 사용
	}
	// 생성자 오버로딩 
	public Book(String isbn, String title, String author,
			String publisher, int price, String desc,int quantity ) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
		this.quantity=quantity;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(isbn + "| ")
		  .append(title + "| ")
		  .append(author + "| ")
		  .append(publisher + "| ")
		  .append(price + "| ")
		  .append(desc + "| ")
		  .append(quantity);
		return sb.toString();
	}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}