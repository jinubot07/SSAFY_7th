package review_perm_combi_subset;

import java.util.Arrays;

public class SubsetTest {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static boolean[] v;
	static int count;
	
	public static void main(String[] args) {
		v = new boolean[N];
		subset(0,0);
		System.out.println(count);

	}

	private static void subset(int cnt, int total) {
		if(cnt==N) {		//선택했냐 안했냐가 총N개
			count++;
			for(int i=0; i<N; i++) {
				if(v[i]) System.out.print(p[i]+" ");
			}
			System.out.println("\n"+total);
			return;
		}
		v[cnt] = true;
		subset(cnt+1,total+p[cnt]);
		v[cnt] = false;
		subset(cnt+1,total);			
	}

}
