package algo0203;
import java.util.ArrayList;
public class StudentTest2 {
	public static void main(String[] args) {
		
		ArrayList<Student2> sts=new ArrayList<>();
		sts.add(new Student2("123","hello"));
		sts.add(new Student2("123","aello"));
		sts.add(new Student2("120","ehsfds"));
		sts.add(new Student2("121","hells"));
		sts.add(new Student2("122","names"));
		for (Student2 st: sts) {
			System.out.println(st);
		}
		System.out.println("----------");
		sts.sort(new StuComp2());
		
		for (Student2 st: sts) {
			System.out.println(st);
		}
	}
}
