package algo0204;

class Test1{
	void play() {
		this.show();                   //(4)
		System.out.println("A");       //(7)
	}
	
	void show() {                    //(5)
		System.out.println("B");
	}
}


class Child extends Test1{
	void show() {
		super.show();                  //(3)
		System.out.println("C");       //(6)
	}
}

public class Test{
	public static void main(String args[]) {
		Test1 c = new Child();       //(1)
		c.play();                     //(2)
	}
}