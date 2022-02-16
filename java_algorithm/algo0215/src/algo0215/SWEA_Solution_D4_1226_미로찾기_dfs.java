package algo0215;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_Solution_D4_1226_미로찾기_dfs {

	static int T = 10;
	static int N = 16;
	static int[][] map;
//	static boolean[][] check;			// 방문여부 -> 방문지역은 -1로 초기화
	
	static int sr,sc,er,ec;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = { 0, 1, 0,-1};
	
	static int cango;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		for(int t=1; t<=T; t++) {
			map = new int[N][N];
			int n = scann.nextInt();
			for(int i=0; i<N; i++) {
				char[] cs=scann.next().toCharArray();
				for(int j=0; j<N; j++) {
					map[i][j] = cs[j]-'0';
					if(map[i][j]==2) {
						sr=i;
						sc=j;
					}else if(map[i][j]==3){
						er=i;
						ec=j;
					}
				}
			}//	읽기 끝
		
			//로직
			cango=0;
			dfs();
			System.out.println("#"+t+" "+cango);
			
		}		
	}


	public static class P{
		int r;
		int c;
		public P(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	private static void dfs(int r, int c) {
		map[sr][sc] = -1;			// 지나감 표시
		
		while(!ps.isEmpty()) {
			P p=ps.poll();
			for(int d=0; d<4; d++) {		// 본인 위치에서 4방향 검사
				int nr=p.r+dr[d];
				int nc=p.c+dc[d];
				
				// 밖
				if(!check(nr,nc)) continue;	//갈수없으면 이번스텝 skip 다음 스텝으로
				
				// 밖이 아니면서, 갈수 있으면서 안 간곳
				if(map[nr][nc] == 0) {
					map[nr][nc] = -1;
					ps.offer(new P(nr,nc));		// 갈 수 있는 곳 저장
				}
			}
		}
	}
	
	
	private static boolean check(int r, int c) {
		return r>=0 &&  r<N && c>=0 && c<N;
	}
	
}
