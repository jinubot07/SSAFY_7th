// Review
// Fail : 입력받는 방식 Scann -> BufferedReader 차이인데 해결안됌

package algo0216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_Solution_D4_1226_미로1_bfs {
	
	static int T = 1;			// 테스트케이스
	static int N = 16;
	static int[][] map;			// 미로 맵
	
	static int sr,sc,er,ec;		// 출발/도착점 좌표(행열)
	static int[] dr = {-1, 0, 1, 0};	// 북동남서
	static int[] dc = { 0, 1, 0,-1}; 	// 북동남서
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scann = new Scanner(System.in);

		for(int t=1; t<=T; t++) {
			
			// 입력받기
			map = new int[N][N];
			for(int i=0; i<N; i++) {						// 줄마다 한번에 입력받고
//				String[] str = br.readLine().split("");
				
				int input_line = scann.nextInt();
				for(int j=0; j<N; j++) {					// 열마다 일일이 값을 넣어준다
					char[] cs=scann.next().toCharArray();
					map[i][j] = cs[j]-'0';

//					map[i][j] = Integer.parseInt(str[j]);
					
					
					// 출발지점 -> sr, sc에 저장
					if(map[i][j] == 2) {
						sr = i;
						sc = j;
					}
					// 도착지점
					else if(map[i][j] ==3) {
						er = i;
						ec = j;
						
					}					
				}
			} // 입력받기 끝
			
			// 경로탐색
			int cango = bfs();
			System.out.println("#"+t+" "+cango);
			
		}
	}

	public static class P{			// static -> P(int ,int )는 non static이어서 외부에서 생성자없이 호출X -> 생성자 필요
		int r;
		int c;
		
		public P(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
	}


	
	// 도달가능하면 1반환, 불가능하면 0반환
	private static int bfs() {
		Queue<P> ps = new LinkedList<>();
		ps.offer(new P(sr,sc));				// 시작
		map[sr][sc] = -1;					// 지나감 표시
		
		while( !ps.isEmpty() ) {			// ps가 Empty면 sr,sc좌표에서 갈수 있는길 모두 방문한 것.
			P p=ps.poll();					// ps에 값이 있으면 빼준다.
			for (int d = 0; d < 4; d++) {	// 4방향(북동남서 순)
				int nr = p.r+dr[d];
				int nc = p.c+dc[d];			// 그때그때 바뀌는 현위치때마다 현위치에서의 북동남서에 대한 좌표값 구하기
				
				// 4방향의 좌표가 맵의 밖으로 벗어난 경우
				if( !check(nr,nc) ) continue;
				
				// 현위치가 도착지점에 온 경운
				if(nr==er && nc==ec) {
					return 1;
				}
				
				// 4방향의 좌표가 밖이 아니면서, 갈수 있음에도 안간 곳
				if( map[nr][nc] == 0 ) {
					map[nr][nc] = -1;		// 지나감 표시후 방문
					ps.offer(new P(nr,nc));	// 지나가서 stack에 쌓기
				}
			}		
		}
		return 0;
	}


	// 좌표 (r,c)가 map안에 있는지 확인하는 메소드
	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

	
	
}
