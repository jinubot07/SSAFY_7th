package algo0203;

public class Student {
	String id;
	String name;
	//get set안하고
	
	//생성자 생성
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
