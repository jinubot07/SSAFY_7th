package algo0210;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetTest {
	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int count;
	
	public static void main(String[] args) {
		subset(0,0,new boolean[N]);
		System.out.println(count);

	}

	private static void subset(int cnt, int total, boolean[] v) {
		if(cnt==N) {
			count++;
			for (int i=0; i<N; i++) {
				if(v[i]) {
					System.out.print(p[i]+" ");
				}
			}
			System.out.println();
			for (int i=0; i<N; i++) {
				if(!v[i]) {
					System.out.print(p[i]+" ");
				}
			}
			System.out.println();
			System.out.println("==>"+total);
			System.out.println("------------");
			
			return;
		}
	
		v[cnt] = true;
		subset(cnt+1,total+p[cnt],v);
		v[cnt] = false;
		subset(cnt+1,total,v);

			
	}

}
