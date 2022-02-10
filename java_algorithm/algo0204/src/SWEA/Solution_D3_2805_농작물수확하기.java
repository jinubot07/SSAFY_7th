package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution_D3_2805_농작물수확하기 {
	static int N;
	static int[][] map;

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int T=scann.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = scann.nextInt(); //밭의 크기
			map = new int[N][N];
			for(int i=0; i<N; i++) {
				char[] cs = scann.next().toCharArray();
				for(int j=0;j<N;j++) {
					map[i][j] = cs[j]-'0';
				}
				//System.out.println(cs);
			}
			int result = go();
			System.out.println("#"+test_case+" "+result);
		}
	}

	private static int go() {
		int sum=0;
		for(int r=0; r<N; r++) { 									// map의 모든 행을 돌아다니기 위함. 
			for(int c=Math.abs(N/2-r); c<=N-1-Math.abs(N/2-r); c++) {	// map 각 행의 특정 열만 돌아다니기 위함.
				//System.out.print("c:"+c);
				sum+=map[r][c];
			}
		}
		return sum;
	}

}
