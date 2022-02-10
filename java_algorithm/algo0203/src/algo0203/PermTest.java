// 5개의 값 중 3개만 골라 나열하는 모든 경우의 수
// 백트래킹

package algo0203;

import java.util.Arrays;

public class PermTest {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int[] nums;// =new int[R];
	static boolean[] v =new boolean[N];
	static int count;
	
	public static void main(String[] args) {
		R=3;
		nums = new int[R];
		nPr(0);
		System.out.println("count:"+count);
		
	}

	private static void nPr(int cnt) {
		if(cnt == R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		for (int i=0; i<N; i++) {
			if(v[i]) continue;	// 온적있다면 진행
			v[i] =true;
			nums[cnt] = i;
			nPr(cnt+1);
			nums[cnt] = 0;
			v[i] =false;
		}
		
		
	}

}
