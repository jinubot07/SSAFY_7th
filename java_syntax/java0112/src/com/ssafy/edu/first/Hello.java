package com.ssafy.edu.first;

public class Hello {
	private int age;    // 
	private double height;  // 멤버 non-static
	private static int age3=230;
	private static String hhh="hello static";
    // 시작점 - entry point
	public static void main(String[] str) {
		//int age=20;
		System.out.println(age3);
		String h="hello";  // 문자 char 'h' 문자배열 문자열
		char c='h'; // 'A'-> 65 'a'=> 97 '0'=>48 
		char [] cs=h.toCharArray();
		//초기 조건 반복{} 스텝 조건 반복{} 스텝 조건 반복{} 스텝 조건 end
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		for (int i = 0; i < h.length() ; i++) {
			System.out.println(h.charAt(i));
		}
		
		Hello hj=new Hello();
		hj.say();
		say2();
		
		int cof=hj.coffee(500);
		System.out.println(cof+"잔");
		
	}
	
	public void say() {
		for (int i = 0; i < hhh.length() ; i++) {
			System.out.println(hhh.charAt(i));
		}
	}
	
	public static void say2() {
		for (int i = 0; i < hhh.length() ; i++) {
			System.out.println(hhh.charAt(i));
		}
	}
	//선언 -declaration
	//자판기 
	public int coffee(int money) {
		return money/200;  // [500/200] 2
	}
	
}
