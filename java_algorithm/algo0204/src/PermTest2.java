import java.util.Arrays;

public class PermTest2 {

	static int[] p = {1,9,2,4,3,6,8,7,10,5};
	static int N = p.length;
	static int R;
	
	static boolean[]visited;
	//static int num1,num2;	 // 배열p에서 고른 숫자 5개의 합의 최솟값과 최댓갑의 차이
	static int max=-1000000; // max니까 첫번째 작동부터 값이 입력되도록
	
	public static void main(String[] args) {
		R = p.length/2;
		//Arrays.fill(nums,0);
		visited = new boolean[N];
		go(0); //지역변수
		System.out.println(max);
	}

	private static void go(int cnt) {
		// basis condition
		if(cnt==R) {
			int num1=0;
			int num2=0;
			for (int i=0; i<N; i++) {
				if(visited[i]) {
					System.out.print(p[i]+" ");
					num1 += p[i];
				}
				if(!visited[i]) {
					num2 += p[i];
				}
			}
			System.out.println();
			max=Math.max(max,Math.abs(num1-num2));
			System.out.println(max+ " ");
			return;
		}

		// 한 번 방문한 곳은 재방문 못하도록 : 중복추첨 방지
		for (int i=0; i<N; i++) {
			if(visited[i]) continue;	//if(!visited[i]){//코드//}와 같은거
			visited[i] = true;
			go(cnt+1);
			visited[i] = false;
			
		}
		
	}
}
