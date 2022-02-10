package algo0203;

public class Student2 implements Comparable<Student2>{
	String id;
	String name;
	public Student2(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student2 o2) {
		int id=this.id.compareTo(o2.id);// 문자열 우선순위 Lexico
		if(id!=0) {
			return id;  // 음수 또는 양수
		}else {// 0이면 이름으로 우선순위
			return this.name.compareTo(o2.name);
		}
	}
	
}
