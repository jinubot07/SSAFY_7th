package algo0211;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_Solution_D4_1226_미로_bfs {
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
					bfs();					
					System.err.printf("#%d #d\n",t,cango);
				}
			}
		
		}
	}

	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = { 0, 1, 0,-1};	// 상하좌우
	// Queue
	private static void bfs() {	
		Queue<int[]>que = new LinkedList<>();
		// Queue에 들어갔으면 갈수있으므로, 별도로 갈수 있는지없는지 체크할 필요없다.
		que.offer(new int[] {sr,sc});	// 시작. 파라미터 : 시작점
		map[sr][sc] = -1; 				// 방문했다.
		while(!que.isEmpty()) {			// 방문할 지점이 있을동안만 반복, 없으면 반복문 탈출
			int nr = cr+dr[d];
			int nc = cc+dc[d];
			if(!check(nr,nc)) continue;	
			int[] cur = que.poll();
			int cr = cur[0];
			int cc = cur[1];
			for (int d=0; d<4; d++) {
				// 도착했으면 멈춰.도착 안했으면 계속 가
				if(nr==er && nc==ec) {		
					cango = 1;
					break;
				}
				// 계속 가려면
				if(map[nr][nc]==0) {	// 방문안한 경우
					map[nr][nc] = -1;
					que.offer(new int[] {nr,nc});
				}
			}
		}
	}
	
	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}
	

}
