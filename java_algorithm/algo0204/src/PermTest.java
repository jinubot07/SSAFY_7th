import java.util.Arrays;

public class PermTest {

	// 시간 : static 변수 < local 변수
	static int[] p = {1,2,3,4,5,6};
	static int N = p.length;
	static int R;
	static int [] nums;
	static boolean[]visited;
	static int count;
	
	public static void main(String[] args) {
		R=3;
		nums=new int[R];
		//Arrays.fill(nums,0);
		visited = new boolean[N];
		go(0); //지역변수
		System.out.println(count);
	}

	private static void go(int cnt) {
		// basis condition
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));//타입 골뱅이 해쉬코드 참조변수이므로
			return;			
		}

		// 한 번 방문한 곳은 재방문 못하도록 : 중복추첨 방지
		for (int i=0; i<N; i++) {
			if(visited[i]) continue;	//if(!visited[i]){//코드//}와 같은거
			visited[i] = true;
			nums[cnt] = i;
			
			go(cnt+1);
			//nums[cnt] = 0; //Array리스트는 값을 지워줘야함
			visited[i] = false;
			
		}
		
	}
}
