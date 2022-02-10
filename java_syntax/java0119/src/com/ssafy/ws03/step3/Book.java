package com.ssafy.ws03.step3;

// uml : 메소드의 밑줄 - static
//       메소드내 :  - return
//       --->      - 사용한다. 의존한다.
//       - 변수         - private
//       c메소드        - construct
public class Book{
	//default는 같은 패키지까지 쓸 수 있음
	// 첫번째 은닉화 : 멤버 필드 프라이빗 메소드 퍼블릭
	// 두번째 은닉화 : package - package가 다르면 import해야함(java.lang은 import안해도됨)
	
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;			
	
	// 생성자 오버로딩
	public Book() {	// 내가 안 만들어도 디폴트로서 자동으로 생성된다.
		//super();  // object인 Book을 가리킴. 지워도 object이 있음. 생성자 초기화 = 부초자초
		this("","","","",0,""); // NULL로 초기화되지 않도록
			 					//아래 생성자를 이용 -> 잘 구현된 것 일부 사용
	}

	//  Source - Generate Constructor using Fields...
	public Book(String isbn, String title, String author,
			    String publisher, int price, String desc) {
		super();			// object임. 부모를 먼저 초기화해야하므로 지워도 디폴트로서 자동 생성됨.
							//만약 쓸거면 맨 위에 써야함. 왜냐하면 부모를 초기화 한 후 자식을 초기화 해야함.
		this.isbn = isbn;	// this : 지역변수 우선
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	} 
	
	// 은닉화 아니니까 메소드 필요없다.
	// 오버라이딩 : Source - Generate toString()...
	// 오버라이딩 : 부모 것이 내 것. object 4대 메소드 : getClass, hashCode, equals, toString
	@Override
	public String toString() {
		return  isbn+"\t|"+title+"\t|"+author+"\t|"+publisher+"\t|"+price+"\t|"+desc ;			
	}
	
	// object 4대 메소드
	// getClass(), hashCode(), equals(), toString()

}