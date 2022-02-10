package com.ssafy.ws05.step3;

public class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h="hello";
		Object o=new Object();
		
		System.out.println(o instanceof Object);
		System.out.println(h instanceof Object);
		System.out.println(o instanceof String);
		System.out.println(h instanceof String);
	}

}
