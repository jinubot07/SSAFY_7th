package algo0208;

import java.util.Arrays;

public class SubsetTest {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int [] nums;
	static boolean [] v;
	static int count;
	
	public static void main(String[] args) {
		R = 3;
		//nums = new int[R];	// perm()의 파라미터로
		//v = new boolean[N];	// perm()의 파라미터로
		
		combi(0,0);
		System.out.println(count);
	
	}
	
	public static void combi(int cnt, int total) {
		if(cnt==N) {
			count++;
			System.out.println(total);
			return ;
		}
		v[cnt]=true;
		combi(cnt+1,total+p[cnt]);
		v[i]=false;
		combi(cnt+1,total)
		}
	}


}
