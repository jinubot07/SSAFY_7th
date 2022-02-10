package algo0209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_D3_7234_안전기지_BufferedReader {

	static int T;
	static int N,B;
	static int[][] map;
	static int[][] Bmap;
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            map=new int[N][N];
			Bmap=new int[N][N];
			
			
			for (int i = 0; i < B; i++) {
                st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken())-1;
				int c = Integer.parseInt(st.nextToken())-1;
				if(map[r][c]>0) {
					map[r][c]++;  //B 가 중복될 수 있다. 
				}else {
					map[r][c]=1;
				}
			}
			int max=-1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					max=Math.max(max, Bmap[i][j]);
				}
			}
			
			System.out.println("#"+t+" "+max);
		}

	}

}