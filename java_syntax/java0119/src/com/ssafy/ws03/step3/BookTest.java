package com.ssafy.ws03.step3;

public class BookTest {
	public static void main(String[] args) {
		
	/* 수업시간 코드
		Book b1=new Book("11111","누구를 위하여 자바를 하는가","멀캠",
				         "한빛",2000,"자바를 위한 스파르타 교육");
		Book b2=new Book("11112","누구나 할 수 있는 CSS","효은",
		         "정보",3000,"프론트 스타일 구성 CSS")
		// 자바는 new하면 hasCode()와 Reference가 같은게 없다. (단, String은 equals.() 사용)
		b2.price = -1000;	// 메서드는 로직으로 이런 현상을 막을 수 있다.
							// 메소드를 작성하는 것이 좋다.
							// 왜냐하면 price에 음수값이 올 수 없도록 로직을 작성해주면 좀 더 안정적인 프로그램이 되니까.
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.getClass()); //메서드가 없어도 4개의 메서드는 물려받는다.
	 */
		System.out.println("********************도서목록********************");
		Book b3=new Book("21424","Java Pro","김하나",
		         "jaen.kr",15000,"Java 기본 문법");
		Book b4=new Book("35355","분석설계      ","소나무",
		         "jaen.kr",30000,"SW 모델링");
		
		// 오버라이딩 했기 때문에 toString이 자동으로 붙는다.
		// 하지만 메소드를 작성하는 것이 좋다.
		// 왜냐하면 price에 음수값이 올 수 없도록 로직을 작성해주면 좀 더 안정적인 프로그램이 되니까.
		System.out.println(b3);
		System.out.println(b4);
	}
}
