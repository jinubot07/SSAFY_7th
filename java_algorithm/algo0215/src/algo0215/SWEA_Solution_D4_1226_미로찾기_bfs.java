package algo0215;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_Solution_D4_1226_미로찾기_bfs {

	static int T = 1;
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
			}//	입력받기 끝
		
			// 경로탐색
			cango = bfs();
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

	private static int bfs() {
		Queue<P> ps = new LinkedList<>();
		ps.offer(new P(sr,sc));					//시작
		map[sr][sc] = -1;						// 지나감 표시
		
		while(!ps.isEmpty()) {					// ps가 Empty면 sr,sc좌표에서 갈수 있는길 모두 방문한 것.
			P p=ps.poll();						// ps에 값이 있으면 빼준다.
			for(int d=0; d<4; d++) {			// 본인 위치에서 4방향 검사(북동남서 순)
				int nr=p.r+dr[d];
				int nc=p.c+dc[d];				// 그때그때 바뀌는 현위치때마다 현위치에서의 북동남서에 대한 좌표값 구하기
				
				// 밖
				if(!check(nr,nc)) continue;		//갈수없으면 이번스텝 skip 다음 스텝으로
				
				// 현위치가 도착지점에 온 경우 -> 끝!
				if(nr==er && nc==ec) return 1;
				
				// 4방향의 좌표가 밖이 아니면서, 갈수 있음에도 안간 곳
				if(map[nr][nc] == 0) {
					map[nr][nc] = -1;			// 지나감 표시후 방문
					ps.offer(new P(nr,nc));		// 지나가서 stack에 쌓기
				}
			}
		}
		return 0;
	}
	
	// 좌표 (r,c)가 map안에 있는지 확인하는 메소드
	private static boolean check(int r, int c) {
		return r>=0 &&  r<N && c>=0 && c<N;
	}
	
}
