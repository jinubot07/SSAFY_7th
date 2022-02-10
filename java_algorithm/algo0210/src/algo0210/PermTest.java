package algo0210;

import java.util.Arrays;
import java.util.Scanner;

public class PermTest {
	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int count;
	
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		R=3;//scann.nextInt();
		
		perm(0,new int[R], new boolean[N]);
		System.out.println(count);

	}

	private static void perm(int cnt, int[] nums, boolean[] v) {
		if(cnt==R) {
			System.out.println(Arrays.toString(nums));
			count++;
			return;
		}
		
		for (int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i] = true;
			nums[cnt] = p[i];
			perm(cnt+1,nums,v);
			v[i] = false;
			
		}
	}

}
