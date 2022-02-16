package review_perm_combi_subset;

import java.util.Arrays;

public class SubsetTest2 {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	
	public static void main(String[] args) {
		for (int i=0; i<(1<<N); i++) {			//2 의 n제곱
			for (int j=0; j<N; j++) {
				if( ( i&(1<<j) ) != 0 ) {
					System.out.println(p[j]+" ");
				}
			}
		}
		
	}
}
