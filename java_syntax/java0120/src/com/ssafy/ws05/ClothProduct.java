package com.ssafy.ws05;

public class ClothProduct {
	private int id;
	private String title;
	private String describe;
	private int price;
	private int quantity;
	public ClothProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClothProduct(int id, String title, String describe, int price, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.describe = describe;
		this.price = price;
		this.quantity = quantity;
	}

	public ClothProduct(int id, String title, String describe) {
		this(id,title,describe,0,0);
	}

	@Override
	public String toString() {
		return id + "|" + title + "|" + describe + "|" + price + "|" + quantity ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	

}
