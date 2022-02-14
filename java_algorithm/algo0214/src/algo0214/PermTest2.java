package algo0214;

import java.util.Arrays;

public class PermTest2 {
	static int []p = {1,2,3,4,5};
	static int N=p.length;
	static int R;
	static int count;
	static int[] nums;
	static boolean[] v;
	
	public static void main(String[] args) {		
		R=3;
		nums=new int[R];
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
			v[i]= false;
			
		}
		
	}
}
