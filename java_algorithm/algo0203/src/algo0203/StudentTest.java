package algo0203;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> sts = new ArrayList<>();
		sts.add(new Student("101","kim"));
		sts.add(new Student("104","lee"));		
		sts.add(new Student("123","park"));
		sts.add(new Student("123","david"));

		
		//출력
		for(Student a:sts) {
			System.out.println(a);
		}
		
		//정렬 id정렬후 같으면 이름정렬
		System.out.println("----정렬 : id정렬후 같으면 이름정렬------");
		sts.sort(new StuComp());
		
		for (Student st: sts) {
			System.out.println(st);
		}
	}

}
