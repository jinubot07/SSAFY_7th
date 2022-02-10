package youtube0208;

import java.util.LinkedList;

public class QueueAPITest {
	public static void main(String[] args) {
		
		LinkedList<String> queue = new LinkedList<String>();
		System.out.println("How many data? "+queue.size()+", isEmpty? "+queue.isEmpty());
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println("How many data? "+queue.size()+", isEmpty? "+queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println("How many data? "+queue.size()+", isEmpty? "+queue.isEmpty());
		System.out.println(queue.peek());
		System.out.println("How many data? "+queue.size()+", isEmpty? "+queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("How many data? "+queue.size()+", isEmpty? "+queue.isEmpty());
		System.out.println(queue.poll());
	}
}
