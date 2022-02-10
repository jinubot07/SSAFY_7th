package algo0203;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class StudentTest3 {
	public static void main(String[] args) {
		
		PriorityQueue<Student2> sts=new PriorityQueue<>();
		sts.offer(new Student2("123","hello"));
		sts.offer(new Student2("123","aello"));
		sts.offer(new Student2("120","ehsfds"));
		sts.offer(new Student2("121","hells"));
		sts.offer(new Student2("122","names"));
		for (Student2 st: sts) {
			System.out.println(st);
		}
		System.out.println("---------");
		while(!sts.isEmpty()) {
			Student2 st2=sts.poll();
			System.out.println(st2);
		}	
		
	}
}