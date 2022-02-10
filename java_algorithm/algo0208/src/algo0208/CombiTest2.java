package algo0208;

import java.util.Arrays;

public class CombiTest2 {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	//static int [] nums;
	static boolean [] v;
	static int count;
	
	public static void main(String[] args) {
		list.clear();
		R = 3;
		v = new boolean[N];	// perm()의 파라미터로
		perm(0);
		System.out.println(count);
	
	}
	
	public static void perm(int cnt) {
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(list.toArray()));
			return ;
		}
		
		for (int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i]=true;
			//nums[cnt]=p[i];
			list.add((i+" "));			//list.add((p[i]+""));
			perm(cnt+1);
			list.remove((i+""));
			v[i]=false;
		}
	}


}
