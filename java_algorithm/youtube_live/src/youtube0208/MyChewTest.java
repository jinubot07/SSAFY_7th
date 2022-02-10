package youtube0208;

import java.util.LinkedList;
import java.util.Queue;

public class MyChewTest {

	public static void main(String[] args) {

		int N = 20; 	//마이쮸 개수
		int person = 1;	//대기열에 새롭게 등장하는 사람의 번호
		
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {person,1});
		
		while(N>0) {
			int[] p = queue.poll();
			int availableCount = (N>=p[1])?p[1]:N;// 마이쮸가 부족하면 남아있는 N만큼만 준다.
			N -= availableCount;	// 마이쮸 주고 남은 수량 업데이트
			
			if(N==0) {
				System.out.println("마지막 마이쮸를 가져간 사람:"+p[0]+", 가져간 마이쮸 개수:"+availableCount);
			}else {
				System.out.println("마이쮸를 가져간 사람:"+p[0]+", 가져간 마이쮸 개수:"+availableCount);
				
				// 받은 사람 넣기, 개수 한개늘려서
				p[1]++;
				queue.offer(p);
				// 새로운 사람 넣기
				queue.offer(new int[] {++person,1});
			}
			
			
			
		}
		
	}

}
