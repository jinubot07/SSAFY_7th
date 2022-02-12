package algo0211;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_Solution_D4_1226_미로_dfs {
	static int T = 10; // 테스트케이스
	static int N = 16;
	static int[][] map;
	static int sr, sc, er, ec;
	static int cango;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		for(int t=1;t<=T;t++) {
			int tn=scann.nextInt();
			map = new int[N][N];
			for (int i=0; i<N; i++) {
				char[] cs =scann.next().toCharArray();
				for (int j=0; j<N; j++) {
					map[i][j] = cs[j]-'0';
					if(map[i][j]==2) { // 시작점 찾기
						sr=i;
						sc=j;
					}else if(map[i][j]==3) {		// 목표도착점 찾기
						er=i;
						ec=j;
					}
					//미로 찾기 시작
					cango = 0;
					dfs(sr,sc);					
					System.err.printf("#%d #d\n",t,cango);
				}
			}
		
		}
	}
	
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = { 0, 1, 0,-1};	// 상하좌우

	private static void dfs(int cr, int cc) {
		map[cr][cc] = 1; // 방문했음을 표시
		for (int d=0; d<4; d++) {
			int nr = cr+dr[d];
			int nc = cc+dc[d];
			if(!check(nr,nc)) continue;	
			
			// base condition 기저조건
			if(nr==er && nc==ec) {
				cango=1;
				return;
			}
			// 갈수있으면 가
			if(map[nr][nc]==0) { 		// 방문 안함
				dfs(nr,nc);				// 가자!
			}
		}
	}

	
	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}
	

}
