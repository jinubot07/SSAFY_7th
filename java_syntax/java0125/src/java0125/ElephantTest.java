package java0125;

public class ElephantTest {
	public static void main(String args) {
		Elephant ee1=new AsianElephant();
		Elephant ee2=new AfricanElephant();
		
		//자식의 종류에 따라 eat이 달라진다. 오버라이딩
		ee1.eat();
		ee2.eat();
	}
}
