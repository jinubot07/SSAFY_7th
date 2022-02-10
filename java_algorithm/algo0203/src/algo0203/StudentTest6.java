package algo0203;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
public class StudentTest6 {
	public static void main(String[] args) {
		
		Stack<Student2> sts=new Stack<>();
		sts.push(new Student2("123","hello"));
		sts.push(new Student2("123","aello"));
		sts.push(new Student2("120","ehsfds"));
		sts.push(new Student2("121","hells"));
		sts.push(new Student2("122","names"));
		for (Student2 st: sts) {
			System.out.println(st);
		}
		
		System.out.println("----정렬 후(stack)-----");
		while(!sts.isEmpty()){
			Student2 st2 =sts.pop();
			System.out.println(st2);
		}
	}
}

