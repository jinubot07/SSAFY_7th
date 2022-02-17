package algo0217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_Solution_3109_빵집 {
	static int R, C;
	static char[][] map;
	static int ans = 0;	 			// 출력할 정답, 파이프를 설치할 수 있는 경우의 수
	static int[] dr = {-1,0,1};
	static int[] dc = { 1,1,1};
	
	public static void main(String[] args) throws IOException{
		Scanner scann = new Scanner(System.in);
		
		// 입력
		R = scann.nextInt();
		C = scann.nextInt();
		
		map = new char[R][C];
		for (int i=0; i<R; i++) {
			map[i] = scann.next().toCharArray();
		}
		
		// 로직
		for(int i =0; i<R;i++) {
			if(dfs(i,0)) ans++;
		}
		
		// 정답 출력
		System.out.println(ans);

	}

	private static boolean dfs(int r, int c) {
		for (int d=0; d<3; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(!check(nr,nc)) continue;		// map 범위를 벗어났으면 stop, for문 탈출
			
			if(nc == C-1) {					// 도착한경우
				return true;
			}
			map[nr][nc] = 'x';				// 파이프 설치했음을 건물설치와 같은 모양으로 표시
			if(dfs(nr,nc)) return true;		// 다음 열로 이동할 수 있으면 가라(true).
		}
		return false;
	}

	// 현 위치가 map안에 있는지. (벗어났으면 0, 있으면 1)
	private static boolean check(int r, int c) {
		//if(map[r][c]=='x') return false;
		return r>=0 && r<R && c>=0 && c<C;
	}



}
