package algo0203;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class StudentTest4 {
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
		sts.sort(new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				return o1.compareTo(o2);
			}
			
		} );
		
		for (Student2 st: sts) {
			System.out.println(st);
		}
	}
}