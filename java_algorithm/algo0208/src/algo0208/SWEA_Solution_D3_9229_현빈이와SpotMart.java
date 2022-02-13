package algo0208;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_D3_9229_현빈이와SpotMart {

	static int[] a ;//= {15,20,25,30,35};
	static int N ;// a.length;
	static int M;
	static int[] twosnack = new int[2]; 	// 과자 2봉지 무게
	static int max_twosnack = -1;
	static int [] nums;

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int T = scann.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			N = scann.nextInt();
			M = scann.nextInt();
			a = new int[N];

			for(int i=0; i<N; i++) {
				a[i] = scann.nextInt();
				System.out.print(a[i]+".");
			}
			combisum(0,0);
			System.out.printf("#%d %d\n",t,max_twosnack);
			max_twosnack = -1;				
		}
	}

	
	public static void combisum(int cnt, int start) {
		if(cnt==2) {	// 과자 2봉지만 뽑는 것
			System.out.println("twosnack:"+Arrays.toString(twosnack));
			if(max_twosnack < twosnack[0]+twosnack[1] && twosnack[0]+twosnack[1] <= M)
				max_twosnack = twosnack[0]+twosnack[1];
			return;
		}

		
		for (int i=start; i<N; i++) {	
			twosnack[cnt]=a[i];
			combisum(cnt+1,i+1);
		}
	}
	

}
