package algo0207;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SubsetTest {
	
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
		subset(0,0);
		System.out.println(count);
	}

	private static void subset(int cnt,int total) {
		if(cnt==N) {
			count++;
			for (int i=0; i<N; i++) {
				if(v[i]) {
					System.out.print(p[i]+" ");
				}
			}
			System.out.println();
			System.out.println(total);
			return;
		}
		
		v[cnt]=true;
		subset(cnt+1,total+p[cnt]);
		v[cnt] = false;
		subset(cnt+1,total);
	}
}

