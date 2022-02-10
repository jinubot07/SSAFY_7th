// HealthBmiReport가 객체생성을 위한 클래스

package com.ssafy.hw06.step2;

public class HealthStudent {
	private String name;
	private String measure;
	private double weight;
	private double height;
	public HealthStudent() {
		super();
		// TODO Auto-generated constructor stub
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
		return "[name=" + name + "| measure=" + measure + "| weight=" + weight + "| height=" + height
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
