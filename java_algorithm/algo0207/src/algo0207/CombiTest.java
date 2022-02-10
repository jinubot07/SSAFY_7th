package algo0207;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CombiTest {
	
	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int count;
	static boolean[] v;
	static int[] nums;
	  
	public static void main(String[] args) {
		
		R=3;
		v=new boolean[N];
		nums=new int[R];
		combi(0,0);
		System.out.println(count);
	}

	private static void combi(int cnt,int start) {
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		
		for(int i=start;i<N;i++) {
			//if(v[i]) continue;
			v[i] = true;
			nums[cnt] = p[i];
			combi(cnt+1,i+1);
			//nums[cnt] = 0;
			v[i] = false;
		}
	}

	
	
	
}
