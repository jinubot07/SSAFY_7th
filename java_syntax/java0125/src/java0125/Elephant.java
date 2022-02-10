package java0125;

public abstract class Elephant {
	public abstract void eat();	//{} 닫아버리면 구현 안된지 알 수없으니까 상속강요가 안됨
								// 상속시키면서 반드시 구현해야해 강요
	public void go() {};
}
