package com.ssafy.hw06.step2;

public class HealthStudent {

	// 상속받을 필요없으니 은닉화
	private String name;
	private String measure;
	private double weight;
	private double height;
	public HealthStudent() {
		super();
	}
	
	public HealthStudent(String name, String measure, double weight, double height) {
		super();
		this.name = name;
		this.measure = measure;
		this.weight = weight;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "HealthStudent [name=" + name + ", measure=" + measure + ", weight=" + weight + ", height=" + height
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
