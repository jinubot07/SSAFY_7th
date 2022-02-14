package algo0214;

import java.util.Arrays;

public class CombiTest1 {
	static int []p = {1,2,3,4,5};
	static int N=p.length;
	static int R;
	static int[] nums;
	static boolean[] v;
	static int count;
	
	public static void main(String[] args) {		
		R=3;
		nums=new int[R];
		v = new boolean[N];
		combi(0,0);
		System.out.println(count);
	}
	
	
	private static void combi(int cnt,int start){
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		for(int i=start; i<N; i++) {
			v[i] = true;
			nums[cnt] = p[i];
			combi(cnt+1,i+1);
			v[i]= false;
		}
		
	}
}
