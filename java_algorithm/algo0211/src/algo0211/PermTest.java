package algo0211;

import java.util.Arrays;

public class PermTest {
	static int[] p = {1,2,3,4,5};
	static int N;
	static int R;
	static boolean[] v;
	static int count;
	public static void main(String[] args) {
		R=3;
		perm(0,new int[R], new boolean[N]);
		System.out.println(count);
	}
	private static void perm(int cnt, int[] nums, boolean[] v) {
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		for(int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i] = true;
			nums[cnt] = p[i];
			perm(cnt+1, nums, v);
			v[i] = false;
		}
	}
}
