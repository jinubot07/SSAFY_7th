package review_perm_combi_subset;

import java.util.Arrays;

public class NextCombiTest {

	static int[] p = {0,0,1,1,1};		// 5C3 인경우
	static int[] A = {1,2,3,4,5};
	static int N = p.length;
	static int R;
	static int[] nums;				// 출력할 선택된 숫자들
	static boolean[] v;
	static int count;
	
	public static void main(String[] args) {
		
		// 다른 알고리즘과 다르게, 중간에 개수를 확인할 수 있음.
		do {
			count++;
			for (int i=0; i<N; i++) {
				if(p[i] == 1) {
					System.out.print(A[i]+" ");
				}
			}
			System.out.println();
			
		}while(np(N-1));
		System.out.println(count);
	}

	
	private static boolean np(int size) {
		int i = size;
		while(i>=0 && p[i-1]>=p[i]) i--;
		if(i==0) return false;
		
		int j= size;
		while(p[i-1]>=p[i]) j--;
		int temp = p[i-1];			// swap
		p[i-1]=p[j];
		p[j]=temp;
		
		// 오름차순
		int k = size;
		while(i<=k) {
			temp = p[i];
			p[i]=p[k];
			p[k]=temp;
			i++;
			k--;
		}
		return false;
	}

}
