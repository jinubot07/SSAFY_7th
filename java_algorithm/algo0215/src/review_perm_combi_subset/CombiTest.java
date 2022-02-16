package review_perm_combi_subset;

import java.util.Arrays;

public class CombiTest {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int[] nums;				// 출력할 선택된 숫자들
	static boolean[] v;
	static int count;
	
	public static void main(String[] args) {
		R = 3;
		nums = new int[R];
		v = new boolean[N];
		perm(0);
		System.out.println(count);

	}

	private static void perm(int cnt) {
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		for(int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i] = true;
			nums[cnt] = p[i];
			perm(cnt+1);
			v[i] = false;
		}
			
	}

}
