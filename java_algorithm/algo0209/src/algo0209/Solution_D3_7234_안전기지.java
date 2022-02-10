package algo0209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_D3_7234_안전기지 {

	static int T;
	static int N,B;
	static int[][] map;
	static int[][] Bmap;
	
	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();
		
		
		for (int t = 1; t <= T; t++) {
			N=scann.nextInt();
			B=scann.nextInt();
			map=new int[N][N];
			Bmap=new int[N][N];
			for (int i = 0; i < B; i++) {
				int r=scann.nextInt()-1;
				int c=scann.nextInt()-1;
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