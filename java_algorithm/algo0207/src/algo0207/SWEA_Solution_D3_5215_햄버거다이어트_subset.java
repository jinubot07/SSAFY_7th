package algo0207;

import java.util.Scanner;

public class SWEA_Solution_D3_5215_햄버거다이어트_subset {

	static int T,N,L;
	static int[] num;
	static int[] cal;
	static int max;
	
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		T = scann.nextInt();
		for (int t=1; t<=T; t++) {
			N = scann.nextInt();
			L = scann.nextInt();
			num = new int[N];
			cal = new int[N];
			
			for (int i=0; i<N; i++) {
				num[i] = scann.nextInt();
				cal[i] = scann.nextInt();
			}
			
			max = -1;
			subset(0,0,0);
			System.out.println("#"+t+" "+max);
		}
	}

	private static void subset(int cnt, int sum, int val) { //cnt 반복횟수, sum 칼로리합, val음식맛의 합
		
		// 기저 조건
		if(cnt==N) {
			// 칼로리는 특정값 이하면서 맛은 최댓값
			if(sum<=L) {
				max=Math.max(max, val);
			}
			return;
		}
		// 선택한 경우
		subset(cnt+1, sum+cal[cnt], val+num[cnt]);
		
		// 선택 안한 경우
		subset(cnt+1, sum, val);
	}
}
